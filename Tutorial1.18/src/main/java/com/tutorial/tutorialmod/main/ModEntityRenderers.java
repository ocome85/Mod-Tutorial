package com.tutorial.tutorialmod.main;



import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.tutorial.tutorialmod.mobdata.TutorialBoat.TutorialBoat;
import com.tutorial.tutorialmod.mobdata.TutorialBoat.TutorialBoatModel;
import com.tutorial.tutorialmod.mobdata.TutorialBoat.TutorialBoatRenderer;
import com.tutorial.tutorialmod.mobdata.TutorialHorse.TutorialHorseModel;
import com.tutorial.tutorialmod.mobdata.TutorialHorse.TutorialHorseRenderer;
import com.tutorial.tutorialmod.mobdata.TutorialPig.TutorialPigModel;
import com.tutorial.tutorialmod.mobdata.TutorialPig.TutorialPigRenderer;
import net.minecraft.client.model.AbstractZombieModel;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Set;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(
        modid = TutorialMod.MOD_ID,
                value = {Dist.CLIENT},
                bus = Mod.EventBusSubscriber.Bus.MOD
)

public class ModEntityRenderers{

    public static ModelLayerLocation TUTORIAL_PIG_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_pig"), "tutorial_pig");
    public static ModelLayerLocation TUTORIAL_HORSE_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_horse"), "tutorial_horse");
    public static ModelLayerLocation TUTORIAL_BOAT_LAYER = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "tutorial_boat"), "tutorial_boat");

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
        event.registerEntityRenderer(ModEntityType.TUTORIAL_PIG, TutorialPigRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_HORSE, TutorialHorseRenderer::new);
        event.registerEntityRenderer(ModEntityType.TUTORIAL_BOAT, TutorialBoatRenderer::new);


    }
    //renderer list
    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(TUTORIAL_PIG_LAYER, TutorialPigModel::createBodyLayer);
        event.registerLayerDefinition(TUTORIAL_HORSE_LAYER,  TutorialHorseModel::createBodyLayer);
        event.registerLayerDefinition(TUTORIAL_BOAT_LAYER,  TutorialBoatModel::createBodyModel);
    }
}
