package com.tutorial.tutorialmod.mobdata.inanimate.TutorialEntity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import com.tutorial.tutorialmod.main.ModEntityRenderers;
import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;


    public class TutorialEntityRenderer extends LivingEntityRenderer<TutorialEntity, TutorialEntityModel<TutorialEntity>> {
        public static final ResourceLocation DEFAULT_SKIN_LOCATION = new ResourceLocation(TutorialMod.MOD_ID,"textures/tutorialentity.png");

        public TutorialEntityRenderer(EntityRendererProvider.Context p_173915_) {
            super(p_173915_, new TutorialEntityModel<>(p_173915_.bakeLayer(ModEntityRenderers.TUTORIAL_ENTITY_LAYER)), 0.0F);
        }

        public ResourceLocation getTextureLocation(TutorialEntity p_113798_) {
            return DEFAULT_SKIN_LOCATION;
        }

        protected void setupRotations(TutorialEntity p_113800_, PoseStack p_113801_, float p_113802_, float p_113803_, float p_113804_) {
            p_113801_.mulPose(Vector3f.YP.rotationDegrees(180.0F - p_113803_));
            float f = (float)(p_113800_.level.getGameTime() - p_113800_.lastHit) + p_113804_;
            if (f < 5.0F) {
                p_113801_.mulPose(Vector3f.YP.rotationDegrees(Mth.sin(f / 1.5F * (float)Math.PI) * 3.0F));
            }

        }

        protected boolean shouldShowName(TutorialEntity p_113815_) {
            double d0 = this.entityRenderDispatcher.distanceToSqr(p_113815_);
            float f = p_113815_.isCrouching() ? 32.0F : 64.0F;
            return d0 >= (double)(f * f) ? false : p_113815_.isCustomNameVisible();
        }

        @Nullable
        protected RenderType getRenderType(TutorialEntity p_113806_, boolean p_113807_, boolean p_113808_, boolean p_113809_) {
            if (!p_113806_.isMarker()) {
                return super.getRenderType(p_113806_, p_113807_, p_113808_, p_113809_);
            } else {
                ResourceLocation resourcelocation = this.getTextureLocation(p_113806_);
                if (p_113808_) {
                    return RenderType.entityTranslucent(resourcelocation, false);
                } else {
                    return p_113807_ ? RenderType.entityCutoutNoCull(resourcelocation, false) : null;
                }
            }
        }
    }
