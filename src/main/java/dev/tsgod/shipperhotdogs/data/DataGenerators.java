package dev.tsgod.shipperhotdogs.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.tsgod.shipperhotdogs.ShipperHotDogs;;

@Mod.EventBusSubscriber(modid = ShipperHotDogs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    public static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        if (event.includeServer()) {
            // BlockTags blockTags = new BlockTags(generator, ShipperHotDogs.MODID, helper);
            // generator.addProvider(blockTags);
            // generator.addProvider(new ItemTags(generator, blockTags,
            // ShipperHotDogs.MODID, helper));
            // generator.addProvider(new EntityTags(generator, ShipperHotDogs.MODID,
            // helper));
            generator.addProvider(new Recipes(generator));
            // generator.addProvider(new Advancements(generator));
        }
        if (event.includeClient()) {
            BlockStates blockStates = new BlockStates(generator, helper);
            generator.addProvider(blockStates);
            generator.addProvider(new ItemModels(generator, blockStates.models().existingFileHelper));
        }
    }

}