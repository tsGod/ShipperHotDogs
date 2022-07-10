package dev.tsgod.shipperhotdogs.data;

import dev.tsgod.shipperhotdogs.ShipperHotDogs;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ShipperHotDogs.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        System.out.println("We probably don't need this but we will see");
    }
}
