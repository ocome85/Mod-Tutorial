package com.tutorial.tutorialmod.main;

import com.tutorial.tutorialmod.item.Rainbow_Apple;
import com.tutorial.tutorialmod.item.Strawberry;
import com.tutorial.tutorialmod.item.Tutorial_T2;
import com.tutorial.tutorialmod.item.Zone;

import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoat;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoatItem;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialEntity.TutorialEntityItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> TUTORIAL_T = ITEMS.register("tutorial_t",
            () -> new Item(new Item.Properties().tab(TutorialMod.MOD_TAB)));
    public static final RegistryObject<Item> TUTORIAL_T2 = ITEMS.register("tutorial_t2",
            () -> new  Tutorial_T2());
    public static final RegistryObject<Item> TUTORIAL_STRAWBERRY = ITEMS.register("tutorial_strawberry",
            () -> new Strawberry());
    public static final RegistryObject<Item> RAINBOW_APPLE = ITEMS.register("rainbow_apple",
            () -> new  Rainbow_Apple());
    public static final RegistryObject<Item> ZONE = ITEMS.register("zone",
            () -> new Zone());
    public static final RegistryObject<Item> TUTORIAL_BOAT= ITEMS.register("tutorial_boat",
            () -> new   TutorialBoatItem(TutorialBoat.Type.OAK, (new Item.Properties()).stacksTo(1).tab(TutorialMod.MOD_TAB)));
    public static final RegistryObject<Item> TUTORIAL_CAR = ITEMS.register("tutorial_car",
            () -> new Item(new Item.Properties().tab(TutorialMod.MOD_TAB)));
    public static final RegistryObject<Item> TUTORIAL_ENTITY_ITEM = ITEMS.register("tutorial_entity_item",
            () ->new TutorialEntityItem((new Item.Properties()).stacksTo(1).tab(TutorialMod.MOD_TAB)));


    public static void register(RegistryEvent.Register<Item> registry, Item item) {
        if (item instanceof BlockItem && item.getRegistryName() == null) {
            item.setRegistryName(((BlockItem) item).getBlock().getRegistryName());
            Item.BY_BLOCK.put(((BlockItem) item).getBlock(), item);
        }
        registry.getRegistry().register(item);
    }
}

