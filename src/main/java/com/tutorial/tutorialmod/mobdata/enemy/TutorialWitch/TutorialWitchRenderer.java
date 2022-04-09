package com.tutorial.tutorialmod.mobdata.enemy.TutorialWitch;

import com.tutorial.tutorialmod.main.ModEntityRenderers;
import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

import static com.tutorial.tutorialmod.main.ModEntityRenderers.TUTORIAL_WITCH_LAYER;

public class TutorialWitchRenderer extends MobRenderer  {
    private static final ResourceLocation TEXTURE = new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/viler_witch.png");

    public TutorialWitchRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new TutorialWitchModel<>(p_173952_.bakeLayer(TUTORIAL_WITCH_LAYER)), 0.5F);
        //this.addLayer(new VilerWitchItemLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Entity p_114482_) {
        return TEXTURE;
    }

}