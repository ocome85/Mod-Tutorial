package com.tutorial.tutorialmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.List;


public class Tutorial_Block extends Block {

        public Tutorial_Block() {
                super(Properties
                        .of(Material.METAL, MaterialColor.RAW_IRON)
                        .sound(SoundType.METAL)
                        /* 破壊時間 */
                        .destroyTime(2)
                        /* 爆破耐性 帯電121 TNT78 creeper 56 */
                        .explosionResistance(80)
                        .requiresCorrectToolForDrops()
                );

                this.setRegistryName("tutorial_block");

        }

        @Override
        public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader reader, BlockPos pos, int fortune, int silktouch) {
                return silktouch == 0 ? 0 : 0;
        }
        public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flags){
                tooltip.add(new TranslatableComponent(this.getDescriptionId()+".desc"));
        }

}
