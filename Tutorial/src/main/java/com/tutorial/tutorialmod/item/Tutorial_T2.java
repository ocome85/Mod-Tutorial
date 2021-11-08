package com.tutorial.tutorialmod.item;

import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class Tutorial_T2 extends Item {
    public Tutorial_T2() {
        super(new Properties().tab(TutorialMod.MOD_TAB));
        this.setRegistryName("tutorial_t2");

    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flags){
        tooltip.add(new TranslatableComponent(this.getDescriptionId()+".desc"));
    }
}
