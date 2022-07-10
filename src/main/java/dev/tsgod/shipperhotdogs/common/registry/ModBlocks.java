package dev.tsgod.shipperhotdogs.common.registry;

import dev.tsgod.shipperhotdogs.ShipperHotDogs;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ShipperHotDogs.MODID);

    // public static final RegistryObject<Block> STOVE = BLOCKS.register("stove",
    // () -> new
    // MeatGrinderBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).lightLevel(litBlockEmission(13))));

}
