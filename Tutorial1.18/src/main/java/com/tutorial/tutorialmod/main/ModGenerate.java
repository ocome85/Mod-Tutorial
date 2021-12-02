package com.tutorial.tutorialmod.main;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.ORE_DIAMOND_TARGET_LIST;

public class ModGenerate {
    public static void ModGenerate(final BiomeLoadingEvent event) {
        if (event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
        } else {
            if (event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            }else{
                                                                                                                                                                                                                                                                             //大きさ　Y座標下　上　　　　チャンクに対しての数
                generateOre(event.getGeneration());

            }
        }
    }

    public static void generateOre(BiomeGenerationSettingsBuilder biomeGenerationSettingsBuilder){
        biomeGenerationSettingsBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.TUTORIAL_BLOCK);
    }




    }

