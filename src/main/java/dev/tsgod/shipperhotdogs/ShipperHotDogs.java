package dev.tsgod.shipperhotdogs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dev.tsgod.shipperhotdogs.common.registry.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dev.tsgod.shipperhotdogs.ShipperHotDogs;

import javax.annotation.Nonnull;

@Mod(ShipperHotDogs.MODID)
public class ShipperHotDogs {
    public static final String MODID = "shipperhotdogs";

    public static final Logger LOGGER = LogManager.getLogger();
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(ShipperHotDogs.MODID) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HOT_DOG.get());
        }
    };

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final GatherDataEvent gatherDataEvent) {
            LOGGER.info("HELLO from gather data");
        }
    }

    public ShipperHotDogs() {
        LOGGER.info("HELLO I HAVE INITIALIZED");
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // modEventBus.addListener(CommonSetup::init);
        // modEventBus.addListener(ClientSetup::init);

        // ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,
        // Configuration.COMMON_CONFIG);
        // ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT,
        // Configuration.CLIENT_CONFIG);

        // ModParticleTypes.PARTICLE_TYPES.register(modEventBus);
        // ModEnchantments.ENCHANTMENTS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        // ModBlocks.BLOCKS.register(modEventBus);
        // ModEffects.EFFECTS.register(modEventBus);
        // ModBiomeFeatures.FEATURES.register(modEventBus);
        // ModSounds.SOUNDS.register(modEventBus);
        // ModBlockEntityTypes.TILES.register(modEventBus);
        // ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
        ModRecipeSerializers.RECIPE_SERIALIZERS.register(modEventBus);
        // ModLootModifiers.LOOT_MODIFIERS.register(modEventBus);
        // ModEntityTypes.ENTITIES.register(modEventBus);
        // MinecraftForge.EVENT_BUS.addListener(VillageStructures::addNewVillageBuilding);

        MinecraftForge.EVENT_BUS.register(this);
    }
}

// import com.mojang.logging.LogUtils;

// import net.minecraft.world.item.Item;
// import net.minecraft.world.level.block.Block;
// import net.minecraft.world.level.block.Blocks;
// import net.minecraftforge.common.MinecraftForge;
// import net.minecraftforge.event.RegistryEvent;
// import net.minecraftforge.eventbus.api.SubscribeEvent;
// import net.minecraftforge.fml.InterModComms;
// import net.minecraftforge.fml.common.Mod;
// import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
// import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
// import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
// import net.minecraftforge.event.server.ServerStartingEvent;
// import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
// import org.slf4j.Logger;

// import java.util.stream.Collectors;

// // The value here should match an entry in the META-INF/mods.toml file
// @Mod(ShipperHotDogs.MODID)
// public class ShipperHotDogs {
// // Directly reference a slf4j logger
// private static final Logger LOGGER = LogUtils.getLogger();
// public static final String MODID = "shipperhotdogs";

// public ShipperHotDogs() {
// // Register the setup method for modloading
// FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
// // Register the enqueueIMC method for modloading
// FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
// // Register the processIMC method for modloading
// FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

// // Register ourselves for server and other game events we are interested in
// MinecraftForge.EVENT_BUS.register(this);
// }

// private void setup(final FMLCommonSetupEvent event) {
// // some preinit code
// LOGGER.info("HELLO FROM PREINIT");
// LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
// }

// private void enqueueIMC(final InterModEnqueueEvent event) {
// // Some example code to dispatch IMC to another mod
// InterModComms.sendTo("examplemod", "helloworld", () -> {
// LOGGER.info("Hello world from the MDK");
// return "Hello world";
// });
// }

// private void processIMC(final InterModProcessEvent event) {
// // Some example code to receive and process InterModComms from other mods
// LOGGER.info("Got IMC {}",
// event.getIMCStream().map(m ->
// m.messageSupplier().get()).collect(Collectors.toList()));
// }

// // You can use SubscribeEvent and let the Event Bus discover methods to call
// @SubscribeEvent
// public void onServerStarting(ServerStartingEvent event) {
// // Do something when the server starts
// LOGGER.info("HELLO from server starting");
// }

// // You can
// // use EventBusSubscriber
// // to automatically
// // subscribe events
// // on the contained class(this
// // is subscribing
// // to the
// // MOD
// // Event bus for
// // receiving Registry Events)

// }
