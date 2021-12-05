package com.tutorial.tutorialmod.main;


import com.tutorial.tutorialmod.mobdata.TutorialPig.TutorialPigModel;
import com.tutorial.tutorialmod.mobdata.TutorialPig.TutorialPigRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
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

    public static void init() {
    }
    //registry list
    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityType.TUTORIAL_PIG, TutorialPigRenderer::new);

    }
    //renderer list
    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(TUTORIAL_PIG_LAYER, TutorialPigModel::createBodyLayer);

    }
}
