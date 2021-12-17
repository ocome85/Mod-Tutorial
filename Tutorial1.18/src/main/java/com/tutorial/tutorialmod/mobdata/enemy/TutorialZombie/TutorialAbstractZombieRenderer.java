package com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie;

import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;


public abstract class TutorialAbstractZombieRenderer<T extends TutorialZombie, M extends TutorialZombieModel<T>> extends HumanoidMobRenderer<T, M> {
    private static final ResourceLocation ZOMBIE_LOCATION = new ResourceLocation("textures/entity/zombie/zombie.png");

    protected TutorialAbstractZombieRenderer(EntityRendererProvider.Context p_173910_, M p_173911_) {
        super(p_173910_, p_173911_, 0.5F);
    }

    public ResourceLocation getTextureLocation(TutorialZombie p_113771_) {
        return ZOMBIE_LOCATION;
    }

    protected boolean isShaking(T p_113773_) {
        return super.isShaking(p_113773_) || p_113773_.isUnderWaterConverting();
    }
}