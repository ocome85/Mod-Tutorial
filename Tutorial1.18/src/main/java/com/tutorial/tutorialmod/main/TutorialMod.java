package com.tutorial.tutorialmod.main;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.minecraftforge.fml.common.Mod("tutorialmod")
public class TutorialMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static  final CreativeModeTab MOD_TAB = new CreativeTab("tutorialmod");
    public static final String MOD_ID = "tutorialmod";

    public TutorialMod() {

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, ModGenerate::ModGenerate);
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntityType.ENTITY_TYPES.register(eventBus);
        ModItems.ITEMS.register(eventBus);
        ModSoundEvents.SOUNDS.register(eventBus);
        // Register the setup method for modloading
        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventBus.addListener(this::processIMC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ModEntityRenderers.init();
        // some preinit c   ode
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
   }

    private void processIMC(final InterModProcessEvent event)
    {
   }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    //1.17 public void onServerStarting(FMLServerStartingEvent event) {
    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @net.minecraftforge.fml.common.Mod.EventBusSubscriber(bus= net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}




