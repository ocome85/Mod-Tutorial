package com.tutorial.tutorialmod.main;

import com.tutorial.tutorialmod.block.ModOrePlacements;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModGenerate {
    public static void ModGenerate(final BiomeLoadingEvent event) {
        if (event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
        } else {
            if (event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            }else{
                     generateOre(event.getGeneration());

            }
        }
    }

    public static void generateOre(BiomeGenerationSettingsBuilder biomeGenerationSettingsBuilder){
        biomeGenerationSettingsBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.TUTORIAL_BLOCK);
    }




    }

