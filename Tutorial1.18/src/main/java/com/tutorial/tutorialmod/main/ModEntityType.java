package com.tutorial.tutorialmod.main;





import com.tutorial.tutorialmod.mobdata.creature.TutorialHorse.TutorialHorse;
import com.tutorial.tutorialmod.mobdata.creature.TutorialPig.TutorialPig;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialWitch.TutorialWitch;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie.TutorialZombie;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoat;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar.TutorialCar;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Monster;
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

    //敵
    public static final EntityType<TutorialZombie> TUTORIAL_ZOMBIE= EntityType.Builder.of(TutorialZombie::new, MobCategory.MONSTER)
            .sized(0.9F, 0.9F).clientTrackingRange(10).build(prefix("tutorial_zombie"));
    public static final EntityType<TutorialWitch> TUTORIAL_WITCH= EntityType.Builder.of(TutorialWitch::new, MobCategory.MONSTER)
            .sized(0.9F, 0.9F).clientTrackingRange(10).build(prefix("tutorial_witch"));

    //乗り物
    public static final EntityType<TutorialBoat> TUTORIAL_BOAT= EntityType.Builder.of(TutorialBoat::new,MobCategory.MISC)
            .sized(1.375F, 0.5625F).clientTrackingRange(10).build(prefix("tutorial_boat"));
    public static final EntityType<TutorialCar> TUTORIAL_CAR= EntityType.Builder.of(TutorialCar::new,MobCategory.MISC)
            .sized(4F, 3F).build(prefix("tutorial_car"));
//size 広さ.高さ

    private static String prefix(String path) {
        return TutorialMod.MOD_ID + "." + path;
    }

    @SubscribeEvent
    public static void registerEntity(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().register(TUTORIAL_PIG.setRegistryName("tutorial_pig"));
        event.getRegistry().register(TUTORIAL_HORSE.setRegistryName("tutorial_horse"));
        event.getRegistry().register(TUTORIAL_BOAT.setRegistryName("tutorial_boat"));
        event.getRegistry().register(TUTORIAL_CAR.setRegistryName("tutorial_car"));
        event.getRegistry().register(TUTORIAL_ZOMBIE.setRegistryName("tutorial_zombie"));
        event.getRegistry().register(TUTORIAL_WITCH.setRegistryName("tutorial_witch"));


        SpawnPlacements.register(TUTORIAL_PIG, SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);
        SpawnPlacements.register(TUTORIAL_HORSE, SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);

        SpawnPlacements.register(TUTORIAL_ZOMBIE, SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(TUTORIAL_WITCH, SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);

 }

    @SubscribeEvent
    public static void registerEntityAttribute(EntityAttributeCreationEvent event) {
        event.put(TUTORIAL_PIG, TutorialPig.createAttributes().build());
        event.put(TUTORIAL_HORSE, AbstractHorse.createBaseHorseAttributes().build());
        event.put(TUTORIAL_ZOMBIE, TutorialZombie.createAttributes().build());
        event.put(TUTORIAL_WITCH, TutorialWitch.createAttributes().build());


    }
}