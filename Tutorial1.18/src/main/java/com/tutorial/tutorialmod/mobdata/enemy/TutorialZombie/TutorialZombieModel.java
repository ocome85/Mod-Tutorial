package com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.*;


import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Function;




public class TutorialZombieModel<T extends LivingEntity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "alex"), "main");
    private final ModelPart Head;
    private final ModelPart Body;
    private final ModelPart RightArm;
    private final ModelPart LeftArm;
    private final ModelPart RightLeg;
    private final ModelPart LeftLeg;
    private final ModelPart Book;

    public HumanoidModel.ArmPose LeftArmPose = HumanoidModel.ArmPose.EMPTY;
    public HumanoidModel.ArmPose RightArmPose = HumanoidModel.ArmPose.EMPTY;
    public boolean crouching;
    public float swimAmount;

    public TutorialZombieModel(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
        this.RightLeg = root.getChild("RightLeg");
        this.LeftLeg = root.getChild("LeftLeg");
        this.Book = root.getChild("Book");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));

        PartDefinition SideAccessoryLeft = Head.addOrReplaceChild("SideAccessoryLeft", CubeListBuilder.create().texOffs(74, 0).addBox(5.0F, -35.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 1).addBox(5.0F, -34.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(77, 0).addBox(5.0F, -33.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(5.0F, -30.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(84, 0).addBox(5.5F, -28.3F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(84, 0).addBox(5.5F, -28.3F, 1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition SideAccessoryRight = Head.addOrReplaceChild("SideAccessoryRight", CubeListBuilder.create().texOffs(74, 0).addBox(-6.0F, -35.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 1).addBox(-6.0F, -34.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(77, 0).addBox(-6.0F, -33.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-6.0F, -30.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(84, 0).addBox(-6.5F, -28.3F, 1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(84, 2).addBox(-6.5F, -28.3F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(16, 32).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(64, 16).addBox(-3.0F, 3.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 19).addBox(1.0F, 3.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(40, 32).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-5.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(5.0F, 2.5F, 0.0F, 0.2094F, 0.0F, 0.0F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.192F, 0.0F, 0.0349F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.1745F, 0.0F, -0.0349F));

        PartDefinition Book = partdefinition.addOrReplaceChild("Book", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = Book.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(106, 0).addBox(-5.6F, -28.4F, -6.8F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2566F, 0.0F, 0.0F));

        PartDefinition book1_r1 = Book.addOrReplaceChild("book1_r1", CubeListBuilder.create().texOffs(90, 11).addBox(-6.0F, -28.5F, -4.0F, 6.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.3491F, -0.096F));

        PartDefinition book1_r2 = Book.addOrReplaceChild("book1_r2", CubeListBuilder.create().texOffs(90, 0).addBox(-9.0F, -28.5F, -7.0F, 6.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.3054F, 0.0873F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Head.render(poseStack, buffer, packedLight, packedOverlay);
        Body.render(poseStack, buffer, packedLight, packedOverlay);
        RightArm.render(poseStack, buffer, packedLight, packedOverlay);
        LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
        RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
        Book.render(poseStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(T p_102866_, float p_102867_, float p_102868_, float p_102869_, float p_102870_, float p_102871_) {
        boolean flag = p_102866_.getFallFlyingTicks() > 4;
        boolean flag1 = p_102866_.isVisuallySwimming();
        this.Head.yRot = p_102870_ * ((float)Math.PI / 180F);
        if (flag) {
            this.Head.xRot = (-(float)Math.PI / 4F);
        } else if (this.swimAmount > 0.0F) {
            if (flag1) {
                this.Head.xRot = this.rotlerpRad(this.swimAmount, this.Head.xRot, (-(float)Math.PI / 4F));
            } else {
                this.Head.xRot = this.rotlerpRad(this.swimAmount, this.Head.xRot, p_102871_ * ((float)Math.PI / 180F));
            }
        } else {
            this.Head.xRot = p_102871_ * ((float)Math.PI / 180F);
        }

        this.Body.yRot = 0.0F;
        this.RightArm.z = 0.0F;
        this.RightArm.x = -5.0F;
        this.LeftArm.z = 0.0F;
        this.LeftArm.x = 5.0F;
        float f = 1.0F;
        if (flag) {
            f = (float)p_102866_.getDeltaMovement().lengthSqr();
            f /= 0.2F;
            f *= f * f;
        }

        if (f < 1.0F) {
            f = 1.0F;
        }

        this.RightArm.xRot = Mth.cos(p_102867_ * 0.6662F + (float)Math.PI) * 2.0F * p_102868_ * 0.5F / f;
        this.LeftArm.xRot = Mth.cos(p_102867_ * 0.6662F) * 2.0F * p_102868_ * 0.5F / f;
        this.RightArm.zRot = 0.0F;
        this.LeftArm.zRot = 0.0F;
        this.RightLeg.xRot = Mth.cos(p_102867_ * 0.6662F) * 1.4F * p_102868_ / f;
        this.LeftLeg.xRot = Mth.cos(p_102867_ * 0.6662F + (float)Math.PI) * 1.4F * p_102868_ / f;
        this.RightLeg.yRot = 0.0F;
        this.LeftLeg.yRot = 0.0F;
        this.RightLeg.zRot = 0.0F;
        this.LeftLeg.zRot = 0.0F;
        if (this.riding) {
            this.RightArm.xRot += (-(float)Math.PI / 5F);
            this.LeftArm.xRot += (-(float)Math.PI / 5F);
            this.RightLeg.xRot = -1.4137167F;
            this.RightLeg.yRot = ((float)Math.PI / 10F);
            this.RightLeg.zRot = 0.07853982F;
            this.LeftLeg.xRot = -1.4137167F;
            this.LeftLeg.yRot = (-(float)Math.PI / 10F);
            this.LeftLeg.zRot = -0.07853982F;
        }

        this.RightArm.yRot = 0.0F;
        this.LeftArm.yRot = 0.0F;
        boolean flag2 = p_102866_.getMainArm() == HumanoidArm.RIGHT;
        if (p_102866_.isUsingItem()) {
            boolean flag3 = p_102866_.getUsedItemHand() == InteractionHand.MAIN_HAND;
            if (flag3 == flag2) {
                this.poseRightArm(p_102866_);
            } else {
                this.poseLeftArm(p_102866_);
            }
        } else {
            boolean flag4 = flag2 ? this.LeftArmPose.isTwoHanded() : this.RightArmPose.isTwoHanded();
            if (flag2 != flag4) {
                this.poseLeftArm(p_102866_);
                this.poseRightArm(p_102866_);
            } else {
                this.poseRightArm(p_102866_);
                this.poseLeftArm(p_102866_);
            }
        }

        this.setupAttackAnimation(p_102866_, p_102869_);
        if (this.crouching) {
            this.Body.xRot = 0.5F;
            this.RightArm.xRot += 0.4F;
            this.LeftArm.xRot += 0.4F;
            this.RightLeg.z = 4.0F;
            this.LeftLeg.z = 4.0F;
            this.RightLeg.y = 12.2F;
            this.LeftLeg.y = 12.2F;
            this.Head.y = 4.2F;
            this.Body.y = 3.2F;
            this.LeftArm.y = 5.2F;
            this.RightArm.y = 5.2F;
        } else {
            this.Body.xRot = 0.0F;
            this.RightLeg.z = 0.1F;
            this.LeftLeg.z = 0.1F;
            this.RightLeg.y = 12.0F;
            this.LeftLeg.y = 12.0F;
            this.Head.y = 0.0F;
            this.Body.y = 0.0F;
            this.LeftArm.y = 2.0F;
            this.RightArm.y = 2.0F;
        }

        if (this.RightArmPose != HumanoidModel.ArmPose.SPYGLASS) {
            AnimationUtils.bobModelPart(this.RightArm, p_102869_, 1.0F);
        }

        if (this.LeftArmPose != HumanoidModel.ArmPose.SPYGLASS) {
            AnimationUtils.bobModelPart(this.LeftArm, p_102869_, -1.0F);
        }

        if (this.swimAmount > 0.0F) {
            float f5 = p_102867_ % 26.0F;
            HumanoidArm humanoidarm = this.getAttackArm(p_102866_);
            float f1 = humanoidarm == HumanoidArm.RIGHT && this.attackTime > 0.0F ? 0.0F : this.swimAmount;
            float f2 = humanoidarm == HumanoidArm.LEFT && this.attackTime > 0.0F ? 0.0F : this.swimAmount;
            if (!p_102866_.isUsingItem()) {
                if (f5 < 14.0F) {
                    this.LeftArm.xRot = this.rotlerpRad(f2, this.LeftArm.xRot, 0.0F);
                    this.RightArm.xRot = Mth.lerp(f1, this.RightArm.xRot, 0.0F);
                    this.LeftArm.yRot = this.rotlerpRad(f2, this.LeftArm.yRot, (float)Math.PI);
                    this.RightArm.yRot = Mth.lerp(f1, this.RightArm.yRot, (float)Math.PI);
                    this.LeftArm.zRot = this.rotlerpRad(f2, this.LeftArm.zRot, (float)Math.PI + 1.8707964F * this.quadraticArmUpdate(f5) / this.quadraticArmUpdate(14.0F));
                    this.RightArm.zRot = Mth.lerp(f1, this.RightArm.zRot, (float)Math.PI - 1.8707964F * this.quadraticArmUpdate(f5) / this.quadraticArmUpdate(14.0F));
                } else if (f5 >= 14.0F && f5 < 22.0F) {
                    float f6 = (f5 - 14.0F) / 8.0F;
                    this.LeftArm.xRot = this.rotlerpRad(f2, this.LeftArm.xRot, ((float)Math.PI / 2F) * f6);
                    this.RightArm.xRot = Mth.lerp(f1, this.RightArm.xRot, ((float)Math.PI / 2F) * f6);
                    this.LeftArm.yRot = this.rotlerpRad(f2, this.LeftArm.yRot, (float)Math.PI);
                    this.RightArm.yRot = Mth.lerp(f1, this.RightArm.yRot, (float)Math.PI);
                    this.LeftArm.zRot = this.rotlerpRad(f2, this.LeftArm.zRot, 5.012389F - 1.8707964F * f6);
                    this.RightArm.zRot = Mth.lerp(f1, this.RightArm.zRot, 1.2707963F + 1.8707964F * f6);
                } else if (f5 >= 22.0F && f5 < 26.0F) {
                    float f3 = (f5 - 22.0F) / 4.0F;
                    this.LeftArm.xRot = this.rotlerpRad(f2, this.LeftArm.xRot, ((float)Math.PI / 2F) - ((float)Math.PI / 2F) * f3);
                    this.RightArm.xRot = Mth.lerp(f1, this.RightArm.xRot, ((float)Math.PI / 2F) - ((float)Math.PI / 2F) * f3);
                    this.LeftArm.yRot = this.rotlerpRad(f2, this.LeftArm.yRot, (float)Math.PI);
                    this.RightArm.yRot = Mth.lerp(f1, this.RightArm.yRot, (float)Math.PI);
                    this.LeftArm.zRot = this.rotlerpRad(f2, this.LeftArm.zRot, (float)Math.PI);
                    this.RightArm.zRot = Mth.lerp(f1, this.RightArm.zRot, (float)Math.PI);
                }
            }

            float f7 = 0.3F;
            float f4 = 0.33333334F;
            this.LeftLeg.xRot = Mth.lerp(this.swimAmount, this.LeftLeg.xRot, 0.3F * Mth.cos(p_102867_ * 0.33333334F + (float)Math.PI));
            this.RightLeg.xRot = Mth.lerp(this.swimAmount, this.RightLeg.xRot, 0.3F * Mth.cos(p_102867_ * 0.33333334F));
        }

//        this.hat.copyFrom(this.Head);
    }

    private void poseRightArm(T p_102876_) {
        switch(this.RightArmPose) {
            case EMPTY:
                this.RightArm.yRot = 0.0F;
                break;
            case BLOCK:
                this.RightArm.xRot = this.RightArm.xRot * 0.5F - 0.9424779F;
                this.RightArm.yRot = (-(float)Math.PI / 6F);
                break;
            case ITEM:
                this.RightArm.xRot = this.RightArm.xRot * 0.5F - ((float)Math.PI / 10F);
                this.RightArm.yRot = 0.0F;
                break;
            case THROW_SPEAR:
                this.RightArm.xRot = this.RightArm.xRot * 0.5F - (float)Math.PI;
                this.RightArm.yRot = 0.0F;
                break;
            case BOW_AND_ARROW:
                this.RightArm.yRot = -0.1F + this.Head.yRot;
                this.LeftArm.yRot = 0.1F + this.Head.yRot + 0.4F;
                this.RightArm.xRot = (-(float)Math.PI / 2F) + this.Head.xRot;
                this.LeftArm.xRot = (-(float)Math.PI / 2F) + this.Head.xRot;
                break;
            case CROSSBOW_CHARGE:
                AnimationUtils.animateCrossbowCharge(this.RightArm, this.LeftArm, p_102876_, true);
                break;
            case CROSSBOW_HOLD:
                AnimationUtils.animateCrossbowHold(this.RightArm, this.LeftArm, this.Head, true);
                break;
            case SPYGLASS:
                this.RightArm.xRot = Mth.clamp(this.Head.xRot - 1.9198622F - (p_102876_.isCrouching() ? 0.2617994F : 0.0F), -2.4F, 3.3F);
                this.RightArm.yRot = this.Head.yRot - 0.2617994F;
        }

    }

    private void poseLeftArm(T p_102879_) {
        switch(this.LeftArmPose) {
            case EMPTY:
                this.LeftArm.yRot = 0.0F;
                break;
            case BLOCK:
                this.LeftArm.xRot = this.LeftArm.xRot * 0.5F - 0.9424779F;
                this.LeftArm.yRot = ((float)Math.PI / 6F);
                break;
            case ITEM:
                this.LeftArm.xRot = this.LeftArm.xRot * 0.5F - ((float)Math.PI / 10F);
                this.LeftArm.yRot = 0.0F;
                break;
            case THROW_SPEAR:
                this.LeftArm.xRot = this.LeftArm.xRot * 0.5F - (float)Math.PI;
                this.LeftArm.yRot = 0.0F;
                break;
            case BOW_AND_ARROW:
                this.RightArm.yRot = -0.1F + this.Head.yRot - 0.4F;
                this.LeftArm.yRot = 0.1F + this.Head.yRot;
                this.RightArm.xRot = (-(float)Math.PI / 2F) + this.Head.xRot;
                this.LeftArm.xRot = (-(float)Math.PI / 2F) + this.Head.xRot;
                break;
            case CROSSBOW_CHARGE:
                AnimationUtils.animateCrossbowCharge(this.RightArm, this.LeftArm, p_102879_, false);
                break;
            case CROSSBOW_HOLD:
                AnimationUtils.animateCrossbowHold(this.RightArm, this.LeftArm, this.Head, false);
                break;
            case SPYGLASS:
                this.LeftArm.xRot = Mth.clamp(this.Head.xRot - 1.9198622F - (p_102879_.isCrouching() ? 0.2617994F : 0.0F), -2.4F, 3.3F);
                this.LeftArm.yRot = this.Head.yRot + 0.2617994F;
        }

    }

    protected void setupAttackAnimation(T p_102858_, float p_102859_) {
        if (!(this.attackTime <= 0.0F)) {
            HumanoidArm humanoidarm = this.getAttackArm(p_102858_);
            ModelPart modelpart = this.getArm(humanoidarm);
            float f = this.attackTime;
            this.Body.yRot = Mth.sin(Mth.sqrt(f) * ((float)Math.PI * 2F)) * 0.2F;
            if (humanoidarm == HumanoidArm.LEFT) {
                this.Body.yRot *= -1.0F;
            }

            this.RightArm.z = Mth.sin(this.Body.yRot) * 5.0F;
            this.RightArm.x = -Mth.cos(this.Body.yRot) * 5.0F;
            this.LeftArm.z = -Mth.sin(this.Body.yRot) * 5.0F;
            this.LeftArm.x = Mth.cos(this.Body.yRot) * 5.0F;
            this.RightArm.yRot += this.Body.yRot;
            this.LeftArm.yRot += this.Body.yRot;
            this.LeftArm.xRot += this.Body.yRot;
            f = 1.0F - this.attackTime;
            f *= f;
            f *= f;
            f = 1.0F - f;
            float f1 = Mth.sin(f * (float)Math.PI);
            float f2 = Mth.sin(this.attackTime * (float)Math.PI) * -(this.Head.xRot - 0.7F) * 0.75F;
            modelpart.xRot = (float)((double)modelpart.xRot - ((double)f1 * 1.2D + (double)f2));
            modelpart.yRot += this.Body.yRot * 2.0F;
            modelpart.zRot += Mth.sin(this.attackTime * (float)Math.PI) * -0.4F;
        }
    }

    protected float rotlerpRad(float p_102836_, float p_102837_, float p_102838_) {
        float f = (p_102838_ - p_102837_) % ((float)Math.PI * 2F);
        if (f < -(float)Math.PI) {
            f += ((float)Math.PI * 2F);
        }

        if (f >= (float)Math.PI) {
            f -= ((float)Math.PI * 2F);
        }

        return p_102837_ + p_102836_ * f;
    }

    private float quadraticArmUpdate(float p_102834_) {
        return -65.0F * p_102834_ + p_102834_ * p_102834_;
    }

    public void copyPropertiesTo(TutorialZombieModel<T> p_102873_) {
        super.copyPropertiesTo(p_102873_);
        p_102873_.LeftArmPose = this.LeftArmPose;
        p_102873_.RightArmPose = this.RightArmPose;
        p_102873_.crouching = this.crouching;
        p_102873_.Head.copyFrom(this.Head);
       // p_102873_.hat.copyFrom(this.hat);
        p_102873_.Body.copyFrom(this.Body);
        p_102873_.RightArm.copyFrom(this.RightArm);
        p_102873_.LeftArm.copyFrom(this.LeftArm);
        p_102873_.RightLeg.copyFrom(this.RightLeg);
        p_102873_.LeftLeg.copyFrom(this.LeftLeg);
    }

    public void setAllVisible(boolean p_102880_) {
        this.Head.visible = p_102880_;
        //this.hat.visible = p_102880_;
        this.Body.visible = p_102880_;
        this.RightArm.visible = p_102880_;
        this.LeftArm.visible = p_102880_;
        this.RightLeg.visible = p_102880_;
        this.LeftLeg.visible = p_102880_;
    }

    public void translateToHand(HumanoidArm p_102854_, PoseStack p_102855_) {
        this.getArm(p_102854_).translateAndRotate(p_102855_);
    }

    protected ModelPart getArm(HumanoidArm p_102852_) {
        return p_102852_ == HumanoidArm.LEFT ? this.LeftArm : this.RightArm;
    }

    public ModelPart getHead() {
        return this.Head;
    }

    private HumanoidArm getAttackArm(T p_102857_) {
        HumanoidArm humanoidarm = p_102857_.getMainArm();
        return p_102857_.swingingArm == InteractionHand.MAIN_HAND ? humanoidarm : humanoidarm.getOpposite();
    }


    public static enum ArmPose {
        EMPTY(false),
        ITEM(false),
        BLOCK(false),
        BOW_AND_ARROW(true),
        THROW_SPEAR(false),
        CROSSBOW_CHARGE(true),
        CROSSBOW_HOLD(true),
        SPYGLASS(false);

        private final boolean twoHanded;

        private ArmPose(boolean p_102896_) {
            this.twoHanded = p_102896_;
        }

        public boolean isTwoHanded() {
            return this.twoHanded;
        }
    }
}