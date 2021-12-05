package com.tutorial.tutorialmod.block;

import com.tutorial.tutorialmod.main.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static net.minecraft.data.worldgen.features.OreFeatures.STONE_ORE_REPLACEABLES;

public class ModOreFeatures {

    public static final List<OreConfiguration.TargetBlockState> TUTORIALBLOCK_LIST =
            List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.TUTORIAL_BLOCK.defaultBlockState()));
    public static final ConfiguredFeature<?, ?> TUTORIAL_BLOCK =
            FeatureUtils.register("tutorial_block", Feature.ORE.configured(new OreConfiguration(TUTORIALBLOCK_LIST, 10, 0.5F)));
    }

