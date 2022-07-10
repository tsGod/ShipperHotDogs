package dev.tsgod.shipperhotdogs.data;

import java.util.Set;
import java.util.stream.Collectors;

import dev.tsgod.shipperhotdogs.ShipperHotDogs;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ItemModels extends ItemModelProvider {
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String GENERATED = "item/generated";

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ShipperHotDogs.MODID, existingFileHelper);
    }

    private String itemName(Item item) {
        return item.getRegistryName().getPath();
    }

    public ResourceLocation resourceItem(String path) {
        return new ResourceLocation(ShipperHotDogs.MODID, "item/" + path);
    }

    public void itemGeneratedModel(Item item, ResourceLocation texture) {
        withExistingParent(itemName(item), GENERATED).texture("layer0", texture);
    }

    @Override
    protected void registerModels() {
        Set<Item> items = ForgeRegistries.ITEMS.getValues().stream()
                .filter(i -> ShipperHotDogs.MODID.equals(ForgeRegistries.ITEMS.getKey(i).getNamespace()))
                .collect(Collectors.toSet());

        items.forEach(item -> itemGeneratedModel(item, resourceItem(itemName(item))));
    }

}
