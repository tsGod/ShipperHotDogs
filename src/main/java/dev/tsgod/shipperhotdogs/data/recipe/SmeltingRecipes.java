package dev.tsgod.shipperhotdogs.data.recipe;

import java.util.function.Consumer;

import dev.tsgod.shipperhotdogs.ShipperHotDogs;
import dev.tsgod.shipperhotdogs.common.registry.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;

public class SmeltingRecipes {

    public static void register(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_LINK.get()),
                ModItems.COOKED_LINK.get(), 0.35F, 200)
                .unlockedBy("has_raw_link", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RAW_LINK.get()))
                .save(consumer,
                        new ResourceLocation(ShipperHotDogs.MODID, "cooked_link").toString() + "_from_smelting");
    }
}
