package com.tutorial.tutorialmod.main;




import com.tutorial.tutorialmod.mobdata.TutorialBoat.TutorialBoat;
import com.tutorial.tutorialmod.mobdata.TutorialHorse.TutorialHorse;
import com.tutorial.tutorialmod.mobdata.TutorialPig.TutorialPig;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEntityType{
    //動物
    public static final EntityType<TutorialPig> TUTORIAL_PIG= EntityType.Builder.of(TutorialPig::new, MobCategory.CREATURE)
            .sized(0.9F, 0.9F).build(prefix("tutorial_pig"));
    public static final EntityType<TutorialHorse> TUTORIAL_HORSE= EntityType.Builder.of(TutorialHorse::new, MobCategory.CREATURE)
            .sized(0.9F, 0.9F).build(prefix("tutorial_horse"));

    //乗り物
    public static final EntityType<TutorialBoat> TUTORIAL_BOAT= EntityType.Builder.of(TutorialBoat::new,MobCategory.MISC)
            .sized(1.375F, 0.5625F).clientTrackingRange(10).build(prefix("tutorial_boat"));

    private static String prefix(String path) {
        return TutorialMod.MOD_ID + "." + path;
    }

    @SubscribeEvent
    public static void registerEntity(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().register(TUTORIAL_PIG.setRegistryName("tutorial_pig"));
        event.getRegistry().register(TUTORIAL_HORSE.setRegistryName("tutorial_horse"));
        event.getRegistry().register(TUTORIAL_BOAT.setRegistryName("tutorial_boat"));


        SpawnPlacements.register(TUTORIAL_PIG, SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);
        SpawnPlacements.register(TUTORIAL_HORSE, SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

 }

    @SubscribeEvent
    public static void registerEntityAttribute(EntityAttributeCreationEvent event) {
        event.put(TUTORIAL_PIG, TutorialPig.createAttributes().build());
        event.put(TUTORIAL_HORSE, AbstractHorse.createBaseHorseAttributes().build());


    }
}