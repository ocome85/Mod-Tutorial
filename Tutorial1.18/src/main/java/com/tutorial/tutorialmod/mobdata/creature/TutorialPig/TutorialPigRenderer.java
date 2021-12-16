package com.tutorial.tutorialmod.mobdata.creature.TutorialPig;

import com.tutorial.tutorialmod.main.ModEntityRenderers;
import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.client.model.PigModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SaddleLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class TutorialPigRenderer extends MobRenderer<TutorialPig, TutorialPigModel<TutorialPig>> {
    private static final ResourceLocation PIG_LOCATION = new ResourceLocation(TutorialMod.MOD_ID,"textures/entity/tutorial_pig/tutorial_pig.png");

    public TutorialPigRenderer(EntityRendererProvider.Context p_174340_) {
        super(p_174340_, new TutorialPigModel<>(p_174340_.bakeLayer(ModEntityRenderers.TUTORIAL_PIG_LAYER)), 0.7F);
        this.addLayer(new SaddleLayer<>(this, new TutorialPigModel<>(p_174340_.bakeLayer(ModelLayers.PIG_SADDLE)), new ResourceLocation("textures/entity/pig/pig_saddle.png")));
    }

    @Override
    public ResourceLocation getTextureLocation(TutorialPig p_114482_) {
        return PIG_LOCATION;
    }

}