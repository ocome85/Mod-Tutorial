package com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.tutorial.tutorialmod.main.ModEntityType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.vehicle.Boat;

import net.minecraft.world.entity.vehicle.DismountHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class TutorialCar extends Boat {
    private static final ImmutableMap<Pose, ImmutableList<Integer>> POSE_DISMOUNT_HEIGHTS = ImmutableMap.of(Pose.STANDING, ImmutableList.of(0, 1, -1), Pose.CROUCHING, ImmutableList.of(0, 1, -1), Pose.SWIMMING, ImmutableList.of(0, 1));


    public TutorialCar(EntityType<TutorialCar> p_38290_, Level p_38291_) {
        super(p_38290_, p_38291_);
        this.blocksBuilding = true;
    }

    protected TutorialCar(Level p_38293_, double p_38294_, double p_38295_, double p_38296_) {
        this(ModEntityType.TUTORIAL_CAR, p_38293_);
        this.setPos(p_38294_, p_38295_, p_38296_);
        this.xo = p_38294_;
        this.yo = p_38295_;
        this.zo = p_38296_;
    }

@Override
    public void controlBoat() {
        if (this.isVehicle()) {
            float f = 0.0F;
            if (this.inputLeft) {
                --this.deltaRotation;
            }

            if (this.inputRight) {
                ++this.deltaRotation;
            }

            if (this.inputRight != this.inputLeft && !this.inputUp && !this.inputDown) {
                f += 0.05F;
            }

            this.setYRot(this.getYRot() + this.deltaRotation);
            if (this.inputUp) {
                f += 0.14F;
            }

            if (this.inputDown) {
                f -= 0.01F;
            }

            this.setDeltaMovement(this.getDeltaMovement().add((double)(Mth.sin(-this.getYRot() * ((float)Math.PI / 180F)) * f), 0.0D, (double)(Mth.cos(this.getYRot() * ((float)Math.PI / 180F)) * f)));
            this.setPaddleState(this.inputRight && !this.inputLeft || this.inputUp, this.inputLeft && !this.inputRight || this.inputUp);
        }
    }
@Override //乗車関係
    public void positionRider(Entity p_38379_) {
        if (this.hasPassenger(p_38379_)) {
            float f = 0.0F;
           float f1 = (float)((this.isRemoved() ? (double)0.01F : this.getPassengersRidingOffset()) + p_38379_.getMyRidingOffset());
            if (this.getPassengers().size() > 1) {
                int i = this.getPassengers().indexOf(p_38379_);
                if (i == 0) {
                    f = 0.2F;
                } else {
                    f = -0.6F;
                }
            }

            Vec3 vec3 = (new Vec3((double)f, 1.0D, 1.0D)).yRot(-this.getYRot() * ((float)Math.PI / 180F) - ((float)Math.PI / 2F)); ;
           // Vec3 vec3 = (new Vec3((double)f, 1.0D, 1.0D)).yRot(-this.getYRot() * ((float)Math.PI / 180F) - ((float)Math.PI / 2F)) ;
            //乗車位置
            p_38379_.setPos(this.getX() + vec3.x, this.getY() +vec3.y, this.getZ() + vec3.z);
            p_38379_.setYRot(p_38379_.getYRot() + this.deltaRotation);
            p_38379_.setYHeadRot(p_38379_.getYHeadRot() + this.deltaRotation);
            this.clampRotation(p_38379_);
        }
    }
//降車関係
    public Vec3 getDismountLocationForPassenger(LivingEntity p_38145_) {
        Direction direction = this.getMotionDirection();
        if (direction.getAxis() == Direction.Axis.Y) {
            return super.getDismountLocationForPassenger(p_38145_);
        } else {
            int[][] aint = DismountHelper.offsetsForDirection(direction);
            BlockPos blockpos = this.blockPosition();
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
            ImmutableList<Pose> immutablelist = p_38145_.getDismountPoses();

            for(Pose pose : immutablelist) {
                EntityDimensions entitydimensions = p_38145_.getDimensions(pose);
                float f = Math.min(entitydimensions.width, 1.0F) / 2.0F;

                for(int i : POSE_DISMOUNT_HEIGHTS.get(pose)) {
                    for(int[] aint1 : aint) {
                        blockpos$mutableblockpos.set(blockpos.getX() + aint1[0], blockpos.getY() + i, blockpos.getZ() + aint1[1]);
                        double d0 = this.level.getBlockFloorHeight(DismountHelper.nonClimbableShape(this.level, blockpos$mutableblockpos), () -> {
                            return DismountHelper.nonClimbableShape(this.level, blockpos$mutableblockpos.below());
                        });
                        if (DismountHelper.isBlockFloorValid(d0)) {
                            AABB aabb = new AABB((double)(-f), 0.0D, (double)(-f), (double)f, (double)entitydimensions.height, (double)f);
                            Vec3 vec3 = Vec3.upFromBottomCenterOf(blockpos$mutableblockpos, d0); //d0 =yの高さ
                            if (DismountHelper.canDismountTo(this.level, p_38145_, aabb.move(vec3))) {
                                p_38145_.setPose(pose);
                                return vec3;
                            }
                        }
                    }
                }
            }

            double d1 = this.getBoundingBox().maxY;
            blockpos$mutableblockpos.set((double)blockpos.getX(), d1, (double)blockpos.getZ());

            for(Pose pose1 : immutablelist) {
                double d2 = (double)p_38145_.getDimensions(pose1).height;
                int j = Mth.ceil(d1 - (double)blockpos$mutableblockpos.getY() + d2);
                double d3 = DismountHelper.findCeilingFrom(blockpos$mutableblockpos, j, (p_38149_) -> {
                    return this.level.getBlockState(p_38149_).getCollisionShape(this.level, p_38149_);
                });
                if (d1 + d2 <= d3) {
                    p_38145_.setPose(pose1);
                    break;
                }
            }

            return super.getDismountLocationForPassenger(p_38145_);
        }
    }


}