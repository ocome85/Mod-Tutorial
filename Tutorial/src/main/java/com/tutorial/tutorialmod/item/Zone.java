package com.tutorial.tutorialmod.item;

import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Random;

public class Zone extends Item {
    protected final Random random = new Random();
    public Zone() {
        super(new Properties().tab(TutorialMod.MOD_TAB)
                .food(new FoodProperties.Builder()
                        .alwaysEat()
                        .fast()
                        .effect(new MobEffectInstance(MobEffects.REGENERATION,200,1),1F)
                        .build())
        );
        this.setRegistryName("zone");
    }
    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flags){
        tooltip.add(new TranslatableComponent(this.getDescriptionId()+".desc"));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack p_41409_, Level p_41410_, LivingEntity p_41411_) {

        this.addOneEntity(p_41410_,p_41411_);
        return this.isEdible() ? p_41411_.eat(p_41410_, p_41409_) : p_41409_;
    }

    private void addOneEntity(Level level ,LivingEntity livingEntity) {
        Creeper creeper = new Creeper(EntityType.CREEPER,level);
        creeper.moveTo(livingEntity.getX(), livingEntity.getY()+5F, livingEntity.getZ(), this.random.nextFloat() * 360.0F , 0.0F);
        level.addFreshEntity(creeper);
    }

    }
