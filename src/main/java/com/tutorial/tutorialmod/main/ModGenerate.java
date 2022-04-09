package com.tutorial.tutorialmod.main;

import com.google.common.collect.ImmutableList;
import com.tutorial.tutorialmod.block.ModOrePlacements;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModGenerate {
    public static void ModGenerate(final BiomeLoadingEvent event) {
        if (event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
        } else {
            if (event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            }else{
               //1.17 generateOre(event.getGeneration(), OreConfiguration.Predicates.STONE_ORE_REPLACEABLES,ModBlocks.TUTORIAL_BLOCK.defaultBlockState(),9,60,80,10);

                generateOre(event.getGeneration());

            }
        }
    }

    public static void generateOre(BiomeGenerationSettingsBuilder biomeGenerationSettingsBuilder){
     //   biomeGenerationSettingsBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
        //        ModOrePlacements.TUTORIAL_BLOCK);
    }

/* 1.17
    public static void generateOre(BiomeGenerationSettingsBuilder biomeGenerationSettingsBuilder, RuleTest test, BlockState state, int size , int range1, int range2, int amount ) {
        ImmutableList<OreConfiguration.TargetBlockState> ORE_LIST = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ModBlocks.TUTORIAL_BLOCK.defaultBlockState()), OreConfiguration.target(test,state));



        biomeGenerationSettingsBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreConfiguration(ORE_LIST, size)).rangeUniform(VerticalAnchor.absolute(range1), VerticalAnchor.absolute(range2)).squared().count(amount));

    }
*/
    }

