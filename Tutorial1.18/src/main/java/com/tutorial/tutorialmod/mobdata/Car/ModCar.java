package com.tutorial.tutorialmod.mobdata.Car;

import com.mojang.math.Vector3d;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nonnull;
import java.util.logging.Level;


public class ModCar extends PathfinderMob {
    protected float playerJumpPendingScale;
    protected int gallopSoundCounter;
    protected boolean isJumping;

    protected ModCar(EntityType<? extends PathfinderMob> p_21683_, net.minecraft.world.level.Level p_21684_) {
        super(p_21683_, p_21684_);
        xpReward = 0;
        setNoAi(true);
        setPersistenceRequired();


    }

    @Override
    public void travel(Vec3 p_30633_) {
            if (this.isVehicle() ) {
                LivingEntity livingentity = (LivingEntity)this.getControllingPassenger();
                this.setYRot(livingentity.getYRot());
                this.yRotO = this.getYRot();
                this.setXRot(livingentity.getXRot() * 0.5F);
                this.setRot(this.getYRot(), this.getXRot());
                this.yBodyRot = this.getYRot();
                this.yHeadRot = this.yBodyRot;
                float f = livingentity.xxa * 0.5F;
                float f1 = livingentity.zza;
                if (f1 <= 0.0F) {
                    f1 *= 0.25F;
                    this.gallopSoundCounter = 0;
                }


                this.flyingSpeed = this.getSpeed() * 0.1F;
                if (this.isControlledByLocalInstance()) {
                    this.setSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED));
                    super.travel(new Vec3((double)f, p_30633_.y, (double)f1));
                } else if (livingentity instanceof Player) {
                    this.setDeltaMovement(Vec3.ZERO);
                }

                this.calculateEntityAnimation(this, false);
                this.tryCheckInsideBlocks();
            } else {
                this.flyingSpeed = 0.02F;
                super.travel(p_30633_);
            }
        }

    @Nonnull
    @Override
    public InteractionResult mobInteract(@Nonnull Player sourcePlayer, @Nonnull InteractionHand hand) {

        InteractionResult resultType = InteractionResult.sidedSuccess(this.level.isClientSide());
        super.mobInteract(sourcePlayer, hand);
        sourcePlayer.startRiding(this);

        return resultType;
    }

    public boolean canDespawn(double distanceToClosestPlayer) {
        return false;
    }

    @Nonnull
    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @OnlyIn(Dist.CLIENT)
    public static AttributeSupplier.Builder mutableAttributeCarBrok(){
        return PathfinderMob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D)
                .add(Attributes.ATTACK_SPEED, 1.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 1.0D)
                .add(Attributes.MOVEMENT_SPEED, 1.0D);

    }
    @Nonnull
    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    protected int getExperienceReward(@Nonnull Player player) {

        return 1 + this.level.random.nextInt(5);
    }
    @Override
    public void playStepSound(@Nonnull BlockPos pos, @Nonnull BlockState blockIn) {

        this.playSound(SoundEvents.METAL_STEP, 0.25F, 1.0F);
    }

    @Override
    public SoundEvent getHurtSound(@Nonnull DamageSource ds) {

        return SoundEvents.METAL_BREAK;
    }

    @Override
    public SoundEvent getDeathSound() {

        return SoundEvents.METAL_BREAK;
    }
    @Override
    protected SoundEvent getAmbientSound() {

        return SoundEvents.AMBIENT_WARPED_FOREST_LOOP;
    }



}