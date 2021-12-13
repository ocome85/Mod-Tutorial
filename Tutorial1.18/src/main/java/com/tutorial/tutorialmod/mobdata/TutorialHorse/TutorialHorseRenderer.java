package com.tutorial.tutorialmod.mobdata.TutorialHorse;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.tutorial.tutorialmod.main.ModEntityRenderers;
import com.tutorial.tutorialmod.main.TutorialMod;
import net.minecraft.Util;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.model.IllagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.AbstractHorseRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HorseArmorLayer;
import net.minecraft.client.renderer.entity.layers.HorseMarkingLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Variant;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;


public final class TutorialHorseRenderer extends ModAbstractHorseRenderer<TutorialHorse, TutorialHorseModel<TutorialHorse>> {
    private static final Map<Variant, ResourceLocation> LOCATION_BY_VARIANT = Util.make(Maps.newEnumMap(Variant.class), (p_114874_) -> {
        p_114874_.put(Variant.WHITE, new ResourceLocation("textures/entity/horse/horse_white.png"));
        p_114874_.put(Variant.CREAMY, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
        p_114874_.put(Variant.CHESTNUT, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
        p_114874_.put(Variant.BROWN, new ResourceLocation("textures/entity/horse/horse_brown.png"));
        p_114874_.put(Variant.BLACK, new ResourceLocation("textures/entity/horse/horse_black.png"));
        p_114874_.put(Variant.GRAY, new ResourceLocation("textures/entity/horse/horse_gray.png"));
        p_114874_.put(Variant.DARKBROWN, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
    });

    public TutorialHorseRenderer(EntityRendererProvider.Context p_174167_) {
        //super(p_174167_, new TutorialHorseModel<>(p_174167_.bakeLayer(ModelLayers.HORSE)), 1.1F);
        super(p_174167_, new TutorialHorseModel<>(p_174167_.bakeLayer(ModEntityRenderers.TUTORIAL_HORSE_LAYER)), 1.1F);
        //this.addLayer(new HorseMarkingLayer(this));
        //this.addLayer(new HorseArmorLayer(this, p_174167_.getModelSet()));
    }

    public ResourceLocation getTextureLocation(TutorialHorse p_114872_) {
        return LOCATION_BY_VARIANT.get(p_114872_.getVariant());
    }
}

