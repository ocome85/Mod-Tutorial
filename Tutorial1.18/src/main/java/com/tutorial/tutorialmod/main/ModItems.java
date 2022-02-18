package com.tutorial.tutorialmod.main;

import com.tutorial.tutorialmod.item.Rainbow_Apple;
import com.tutorial.tutorialmod.item.Strawberry;
import com.tutorial.tutorialmod.item.Tutorial_T2;
import com.tutorial.tutorialmod.item.Zone;

import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoat;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoatItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


@ObjectHolder(TutorialMod.MOD_ID)
@Mod.EventBusSubscriber(modid=TutorialMod.MOD_ID,bus =Mod.EventBusSubscriber.Bus.MOD)

public class ModItems {
   public static final Item TUTORIAL_T = new Item((new Item.Properties()).tab(TutorialMod.MOD_TAB));
    public static final Item TUTORIAL_BOAT = new TutorialBoatItem(TutorialBoat.Type.OAK, (new Item.Properties()).stacksTo(1).tab(TutorialMod.MOD_TAB));
    public static final Item TUTORIAL_CAR = new Item((new Item.Properties()).stacksTo(1).tab(TutorialMod.MOD_TAB));

    @SubscribeEvent
    public static void  registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().register(TUTORIAL_T.setRegistryName("tutorial_t"));
        event.getRegistry().register(TUTORIAL_BOAT.setRegistryName("tutorial_boat"));
        event.getRegistry().register(TUTORIAL_CAR.setRegistryName("tutorial_car"));
        event.getRegistry().register(new Tutorial_T2());
        event.getRegistry().register(new Strawberry());
        event.getRegistry().register(new Rainbow_Apple());
        event.getRegistry().register(new Zone());

    }

    public static void register(RegistryEvent.Register<Item> registry, Item item) {
        if (item instanceof BlockItem && item.getRegistryName() == null) {
            item.setRegistryName(((BlockItem) item).getBlock().getRegistryName());
            Item.BY_BLOCK.put(((BlockItem) item).getBlock(), item);
        }
        registry.getRegistry().register(item);
    }
}

