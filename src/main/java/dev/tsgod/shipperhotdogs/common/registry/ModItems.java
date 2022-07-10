package dev.tsgod.shipperhotdogs.common.registry;

import dev.tsgod.shipperhotdogs.ShipperHotDogs;
import dev.tsgod.shipperhotdogs.common.FoodValues;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        ShipperHotDogs.MODID);

        public static final RegistryObject<Item> HOT_DOG = ITEMS.register("hot_dog",
                        () -> new Item(new Item.Properties().food(FoodValues.HOT_DOG)
                                        .tab(ShipperHotDogs.CREATIVE_TAB)));

        public static final RegistryObject<Item> SHIPPER_HOT_DOG = ITEMS.register("shipper_hot_dog",
                        () -> new Item(new Item.Properties().food(FoodValues.SHIPPER_HOT_DOG)
                                        .tab(ShipperHotDogs.CREATIVE_TAB)));

        public static final RegistryObject<Item> BITCHER_HOT_DOG = ITEMS.register("bitcher_hot_dog",
                        () -> new Item(new Item.Properties().food(FoodValues.BITCHER_HOT_DOG)
                                        .tab(ShipperHotDogs.CREATIVE_TAB)));

        public static final RegistryObject<Item> BUN = ITEMS.register("bun",
                        () -> new Item(new Item.Properties().tab(ShipperHotDogs.CREATIVE_TAB)));

        public static final RegistryObject<Item> COOKED_LINK = ITEMS.register("cooked_link",
                        () -> new Item(new Item.Properties().tab(ShipperHotDogs.CREATIVE_TAB)));

        public static final RegistryObject<Item> RAW_LINK = ITEMS.register("raw_link",
                        () -> new Item(new Item.Properties().tab(ShipperHotDogs.CREATIVE_TAB)));
}
