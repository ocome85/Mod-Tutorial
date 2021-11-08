package com.tutorial.tutorialmod.item;

import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class Strawberry extends Item {
    public Strawberry() {
        super(new Properties().tab(TutorialMod.MOD_TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(3)
                        .saturationMod(0.6F)
                        .fast()
                        .effect(new MobEffectInstance(MobEffects.REGENERATION,200,1),1F)
                        .build())
                );
        this.setRegistryName("strawberry");
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flags){
        tooltip.add(new TranslatableComponent(this.getDescriptionId()+".desc"));
    }
}
