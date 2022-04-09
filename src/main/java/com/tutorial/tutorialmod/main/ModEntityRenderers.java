package com.tutorial.tutorialmod.main;


import com.tutorial.tutorialmod.mobdata.creature.TutorialHorse.TutorialHorseModel;
import com.tutorial.tutorialmod.mobdata.creature.TutorialHorse.TutorialHorseRenderer;
import com.tutorial.tutorialmod.mobdata.creature.TutorialPig.TutorialPigModel;
import com.tutorial.tutorialmod.mobdata.creature.TutorialPig.TutorialPigRenderer;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialWitch.TutorialWitchModel;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialWitch.TutorialWitchRenderer;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie.TutorialZombieModel;
import com.tutorial.tutorialmod.mobdata.enemy.TutorialZombie.TutorialZombieRenderer;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoat;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoatModel;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialBoat.TutorialBoatRenderer;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar.TutorialCar;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar.TutorialCarModel;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialCar.TutorialCarRenderer;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialEntity.TutorialEntityModel;
import com.tutorial.tutorialmod.mobdata.inanimate.TutorialEntity.TutorialEntityRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = TutorialMod.MOD_ID,
                value = {Dist.CLIENT},
                bus = Mod.EventBusSubscriber.Bus.MOD
)

public class ModEntityRenderers{

    public static ModelLayerLocation TUTORIAL_PIG_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_pig"), "tutorial_pig");
    public static ModelLayerLocation TUTORIAL_HORSE_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_horse"), "tutorial_horse");
    public static ModelLayerLocation TUTORIAL_BOAT_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_boat"), "tutorial_boat");
    public static ModelLayerLocation TUTORIAL_CAR_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_car"), "tutorial_car");
    public static ModelLayerLocation TUTORIAL_ZOMNBIE_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_zombie"), "tutorial_zombie");
    public static ModelLayerLocation TUTORIAL_WITCH_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_witch"), "tutorial_witch");
    public static ModelLayerLocation TUTORIAL_ENTITY_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_entity"), "tutorial_entity");

    public static ModelLayerLocation createBoatModelName(TutorialBoat.Type p_171290_) {
        return createLocation("boat/" + p_171290_.getName(), "main");
    }

    private static ModelLayerLocation createLocation(String p_171301_, String p_171302_) {
        return new ModelLayerLocation(new ResourceLocation("minecraft", p_171301_), p_171302_);
    }
    public static void init() {
    }
    //registry list
    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityType.TUTORIAL_PIG.get(), TutorialPigRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_HORSE.get(), TutorialHorseRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_BOAT.get(), TutorialBoatRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_CAR.get(), TutorialCarRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_ENTITY.get() , TutorialEntityRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_ZOMBIE.get(), TutorialZombieRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_WITCH.get(), TutorialWitchRenderer::new);


    }
    //renderer list
    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(TUTORIAL_PIG_LAYER, TutorialPigModel::createBodyLayer);
        event.registerLayerDefinition(TUTORIAL_HORSE_LAYER,  TutorialHorseModel::createBodyLayer);
        event.registerLayerDefinition(TUTORIAL_BOAT_LAYER,  TutorialBoatModel::createBodyModel);
        event.registerLayerDefinition(TUTORIAL_CAR_LAYER,  TutorialCarModel::createBodyLayer);
        event.registerLayerDefinition(TUTORIAL_ENTITY_LAYER,  TutorialEntityModel::createBodyLayer);
        event.registerLayerDefinition(TUTORIAL_ZOMNBIE_LAYER,  TutorialZombieModel::createBodyLayer);
        event.registerLayerDefinition(TUTORIAL_WITCH_LAYER,  TutorialWitchModel::createBodyLayer);
    }
}
