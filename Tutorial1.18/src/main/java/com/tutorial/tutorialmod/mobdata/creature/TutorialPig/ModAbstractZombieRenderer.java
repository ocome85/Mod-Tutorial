package com.tutorial.tutorialmod.mobdata.creature.TutorialPig;


import com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie.TutorialZombie;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie.TutorialZombieModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;

public abstract class ModAbstractZombieRenderer<T extends TutorialZombie, M extends TutorialZombieModel<T>> extends HumanoidMobRenderer<T, M> {
    private static final ResourceLocation ZOMBIE_LOCATION = new ResourceLocation("textures/entity/zombie/zombie.png");

    protected ModAbstractZombieRenderer(EntityRendererProvider.Context p_173910_, M p_173911_, M p_173912_, M p_173913_) {
        super(p_173910_, p_173911_, 0.5F);
        this.addLayer(new HumanoidArmorLayer<>(this, p_173912_, p_173913_));
    }

    public ResourceLocation getTextureLocation(TutorialZombie p_113771_) {
        return ZOMBIE_LOCATION;
    }

    protected boolean isShaking(T p_113773_) {
        return super.isShaking(p_113773_) || p_113773_.isUnderWaterConverting();
    }
}