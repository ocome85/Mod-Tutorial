package com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import com.tutorial.tutorialmod.main.ModEntityRenderers;
import com.tutorial.tutorialmod.main.TutorialMod;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialWitch.TutorialWitchModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import static com.tutorial.tutorialmod.main.ModEntityRenderers.TUTORIAL_WITCH_LAYER;
import static com.tutorial.tutorialmod.main.ModEntityRenderers.TUTORIAL_ZOMNBIE_LAYER;

public class TutorialZombieRenderer extends MobRenderer {
    private static final ResourceLocation TEXTURE = new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/ars/ars.png");
    private static final ResourceLocation GUARDIAN_BEAM_LOCATION = new ResourceLocation("textures/entity/end_gateway_beam.png");
    private static final RenderType BEAM_RENDER_TYPE = RenderType.entityCutoutNoCull(GUARDIAN_BEAM_LOCATION);



    public TutorialZombieRenderer(EntityRendererProvider.Context p_174456_) {
        this(p_174456_, ModEntityRenderers.TUTORIAL_ZOMNBIE_LAYER);
    }
    public TutorialZombieRenderer(EntityRendererProvider.Context p_174458_, ModelLayerLocation p_174459_) {
        super(p_174458_, new TutorialZombieModel<>(p_174458_.bakeLayer(TUTORIAL_ZOMNBIE_LAYER)),0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(Entity p_114482_) {
        return TEXTURE;
    }
}