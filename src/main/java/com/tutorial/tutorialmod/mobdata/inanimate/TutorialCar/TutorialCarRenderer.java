package com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import com.tutorial.tutorialmod.main.ModEntityRenderers;
import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

import java.util.Map;
import java.util.stream.Stream;


public class TutorialCarRenderer extends EntityRenderer<TutorialCar> {
    private final Map<TutorialCar.Type, Pair<ResourceLocation, TutorialCarModel>> boatResources;

    public TutorialCarRenderer(EntityRendererProvider.Context p_173936_) {
        super(p_173936_);
        this.shadowRadius = 1.8F;
        this.boatResources = Stream.of(TutorialCar.Type.values()).collect(ImmutableMap.toImmutableMap((p_173938_) -> {
            return p_173938_;
        }, (p_73940_) -> {
            return Pair.of(new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/car/tutorial_car.png"), new TutorialCarModel(p_173936_.bakeLayer(ModEntityRenderers.TUTORIAL_CAR_LAYER)));
        }));
    }


    public void render(TutorialCar p_113929_, float p_113930_, float p_113931_, PoseStack p_113932_, MultiBufferSource p_113933_, int p_113934_) {
        p_113932_.pushPose();
        p_113932_.translate(0.0D, 1.375D, 0.0D); // 機体の高さ調整
        p_113932_.mulPose(Vector3f.YP.rotationDegrees(180.0F - p_113930_));
        float f = (float) p_113929_.getHurtTime() - p_113931_;
        float f1 = p_113929_.getDamage() - p_113931_;
        if (f1 < 0.0F) {
            f1 = 0.0F;
        }

        if (f > 0.0F) {
            p_113932_.mulPose(Vector3f.XP.rotationDegrees(Mth.sin(f) * f * f1 / 10.0F * (float) p_113929_.getHurtDir()));
        }

        float f2 = p_113929_.getBubbleAngle(p_113931_);
        if (!Mth.equal(f2, 0.0F)) {
            p_113932_.mulPose(new Quaternion(new Vector3f(1.0F, 0.0F, 1.0F), p_113929_.getBubbleAngle(p_113931_), true)); //
        }

        Pair<ResourceLocation, TutorialCarModel> pair = getModelWithLocation(p_113929_);
        ResourceLocation resourcelocation = pair.getFirst();
        TutorialCarModel carmodel = pair.getSecond();
        p_113932_.scale(-1.0F, -1.0F, 1.0F); //car direction xyz default -1 -1 1
        p_113932_.mulPose(Vector3f.YP.rotationDegrees(0.0F)); //動く向き
        carmodel.setupAnim(p_113929_, p_113931_, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer vertexconsumer = p_113933_.getBuffer(carmodel.renderType(resourcelocation));
        carmodel.renderToBuffer(p_113932_, vertexconsumer, p_113934_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

        p_113932_.popPose();
        super.render(p_113929_, p_113930_, p_113931_, p_113932_, p_113933_, p_113934_);
    }

    @Deprecated
    public ResourceLocation getTextureLocation(TutorialCar p_113927_) {
        return getModelWithLocation(p_113927_).getFirst();
    }

    public Pair<ResourceLocation, TutorialCarModel> getModelWithLocation(TutorialCar boat) {
        return this.boatResources.get(boat.getBoatType());
    }
}
