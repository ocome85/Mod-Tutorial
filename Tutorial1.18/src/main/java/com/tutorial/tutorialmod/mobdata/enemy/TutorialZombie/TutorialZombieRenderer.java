package com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie;

import com.tutorial.tutorialmod.main.ModEntityRenderers;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TutorialZombieRenderer extends TutorialAbstractZombieRenderer<TutorialZombie, TutorialZombieModel<TutorialZombie>> {
    public TutorialZombieRenderer(EntityRendererProvider.Context p_174456_) {
        this(p_174456_, ModEntityRenderers.TUTORIAL_ZOMNBIE_LAYER);
    }

    public TutorialZombieRenderer(EntityRendererProvider.Context p_174458_, ModelLayerLocation p_174459_) {
        super(p_174458_, new TutorialZombieModel<>(p_174458_.bakeLayer(p_174459_)));
    }
}