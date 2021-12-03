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

public class ModOreFeatures {
    public static final RuleTest STONE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    public static final List<OreConfiguration.TargetBlockState> ORE_DIAMOND_TARGET_LIST = List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, ModBlocks.TUTORIAL_BLOCK.defaultBlockState()));
    public static final ConfiguredFeature<?, ?> TUTORIAL_BLOCK = FeatureUtils.register("tutorial_block", Feature.ORE.configured(new OreConfiguration(ORE_DIAMOND_TARGET_LIST, 10, 0.5F)));
    }

