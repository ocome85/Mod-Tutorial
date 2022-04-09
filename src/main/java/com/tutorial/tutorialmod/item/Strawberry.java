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
                        .nutrition(3) // 満腹度
                        .saturationMod(0.6F) //0.6F = 1.2栄養価
                        //隠し満腹度 = nutrition * saturationMod(F)*2
                        //carrot = 3.6隠し満腹度
                        .fast()
                        .effect(new MobEffectInstance(MobEffects.REGENERATION,200,1),1F)
                                                                                                                          // =20=1s         //1=2level      //1F =100%
                        .build())
                );
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flags){
        tooltip.add(new TranslatableComponent(this.getDescriptionId()+".desc"));
    }
}
