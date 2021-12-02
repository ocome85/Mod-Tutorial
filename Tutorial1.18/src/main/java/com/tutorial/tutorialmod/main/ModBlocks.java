package com.tutorial.tutorialmod.main;


import com.tutorial.tutorialmod.block.Tutorial_Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


@ObjectHolder(TutorialMod.MOD_ID)



public class ModBlocks {
    public static final Block TUTORIAL_BLOCK= new Tutorial_Block();

    @Mod.EventBusSubscriber(modid=TutorialMod.MOD_ID,bus =Mod.EventBusSubscriber.Bus.MOD)
public static class Register {
        @SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new Tutorial_Block());

        }
            @SubscribeEvent
            public static void registerBlockItem (RegistryEvent.Register < Item > event) {
                ModItems.register(event, new BlockItem(TUTORIAL_BLOCK, (new Item.Properties()).tab(TutorialMod.MOD_TAB)));

            }
        }
    }


