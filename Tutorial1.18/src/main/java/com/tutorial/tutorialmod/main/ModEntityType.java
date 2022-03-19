package com.tutorial.tutorialmod.main;





import com.tutorial.tutorialmod.mobdata.creature.TutorialHorse.TutorialHorse;
import com.tutorial.tutorialmod.mobdata.creature.TutorialPig.TutorialPig;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialWitch.TutorialWitch;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie.TutorialZombie;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoat;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar.TutorialCar;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialEntity.TutorialEntity;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialEntity.TutorialEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEntityType{
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, TutorialMod.MOD_ID);

//動物
    public static final RegistryObject<EntityType<TutorialPig>> TUTORIAL_PIG =
            ENTITY_TYPES.register("tutorial_pig",
                    () -> EntityType.Builder.of(TutorialPig::new,
                                    MobCategory.CREATURE).sized(0.9f, 0.9f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_pig").toString()));
    public static final RegistryObject<EntityType<TutorialHorse>> TUTORIAL_HORSE =
            ENTITY_TYPES.register("tutorial_horse",
                    () -> EntityType.Builder.of(TutorialHorse::new,
                                    MobCategory.CREATURE).sized(0.9f, 0.9f)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_horse").toString()));


    //敵
    public static final RegistryObject<EntityType<TutorialZombie>> TUTORIAL_ZOMBIE =
            ENTITY_TYPES.register("tutorial_zombie",
                    () -> EntityType.Builder.of(TutorialZombie::new,
                                    MobCategory.MONSTER).sized(0.9f, 0.9f).clientTrackingRange(10)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_zombie").toString()));
    public static final RegistryObject<EntityType<TutorialWitch>> TUTORIAL_WITCH =
            ENTITY_TYPES.register("tutorial_witch",
                    () -> EntityType.Builder.of(TutorialWitch::new,
                                    MobCategory.MONSTER).sized(0.9f, 0.9f).clientTrackingRange(10)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_witch").toString()));

    public static final RegistryObject<EntityType<TutorialBoat>> TUTORIAL_BOAT =
            ENTITY_TYPES.register("tutorial_boat",
                    () -> EntityType.Builder.of(TutorialBoat::new,
                                    MobCategory.MISC).sized(0.9f, 0.9f).clientTrackingRange(10)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_boat").toString()));
    public static final RegistryObject<EntityType<TutorialCar>> TUTORIAL_CAR =
            ENTITY_TYPES.register("tutorial_car",
                    () -> EntityType.Builder.of(TutorialCar::new,
                                    MobCategory.MISC).sized(4f, 3f).clientTrackingRange(10)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_car").toString()));
    public static final RegistryObject<EntityType<TutorialEntity>> TUTORIAL_ENTITY =
            ENTITY_TYPES.register("tutorial_entity",
                    () -> EntityType.Builder.of(TutorialEntity::new,
                                    MobCategory.MISC).sized(0.1f, 0.1f).clientTrackingRange(10)
                            .build(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_entity").toString()));

//size 広さ.高さ
    @SubscribeEvent
    public static void registerEntity(RegistryEvent.Register<EntityType<?>> event) {
        SpawnPlacements.register(TUTORIAL_PIG.get(), SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);
        SpawnPlacements.register(TUTORIAL_HORSE.get(), SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules);
        SpawnPlacements.register(TUTORIAL_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(TUTORIAL_WITCH.get(), SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
 }

    @SubscribeEvent
    public static void registerEntityAttribute(EntityAttributeCreationEvent event) {
        event.put(TUTORIAL_PIG.get(), TutorialPig.createAttributes().build());
        event.put(TUTORIAL_HORSE.get(), AbstractHorse.createBaseHorseAttributes().build());
        event.put(TUTORIAL_ZOMBIE.get(), TutorialZombie.createAttributes().build());
        event.put(TUTORIAL_WITCH.get(), TutorialWitch.createAttributes().build());
        event.put(TUTORIAL_ENTITY.get(), LivingEntity.createLivingAttributes().build());


    }
}