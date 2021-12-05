package com.tutorial.tutorialmod.main;

import com.tutorial.tutorialmod.mobdata.TutorialPig.TutorialPig;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityType {

    public static final EntityType<TutorialPig> TUTORIAL_PIG= EntityType.Builder.of(TutorialPig::new, MobCategory.CREATURE).sized(0.9F, 0.9F).build(prefix("tutorial_pig"));


    private static String prefix(String path) {
        return TutorialMod.MOD_ID + "." + path;
    }

    @SubscribeEvent
    public static void registerEntity(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().register(TUTORIAL_PIG.setRegistryName("tutorial_pig"));


        SpawnPlacements.register(TUTORIAL_PIG, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);
 }

    @SubscribeEvent
    public static void registerEntityAttribute(EntityAttributeCreationEvent event) {
        event.put(TUTORIAL_PIG, Chicken.createAttributes().build());

    }
}