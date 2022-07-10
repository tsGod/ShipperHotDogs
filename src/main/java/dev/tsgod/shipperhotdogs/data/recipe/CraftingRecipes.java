package dev.tsgod.shipperhotdogs.data.recipe;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import dev.tsgod.shipperhotdogs.common.registry.ModItems;

public class CraftingRecipes {

    public static void register(Consumer<FinishedRecipe> consumer) {
        recipesFoodstuffs(consumer);
    }

    private static void recipesFoodstuffs(Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.BUN.get(), 1)
                .requires(Items.BREAD)
                .requires(Items.BREAD)
                .unlockedBy("has_bread", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BREAD))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.RAW_LINK.get(), 1)
                .requires(Items.PORKCHOP)
                .unlockedBy("has_porkchop", InventoryChangeTrigger.TriggerInstance.hasItems(Items.PORKCHOP))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.HOT_DOG.get(), 1)
                .requires(ModItems.BUN.get())
                .requires(ModItems.COOKED_LINK.get())
                .unlockedBy("has_bun", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BUN.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.SHIPPER_HOT_DOG.get(), 1)
                .pattern("ddd")
                .pattern("ghg")
                .pattern("ddd")
                .define('d', Items.DIAMOND)
                .define('g', Items.GOLD_INGOT)
                .define('h', ModItems.HOT_DOG.get())
                .unlockedBy("has_hot_dog", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.HOT_DOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.BITCHER_HOT_DOG.get(), 1)
                .pattern("ddd")
                .pattern("ghg")
                .pattern("ddd")
                .define('d', Items.ROTTEN_FLESH)
                .define('g', Items.SPIDER_EYE)
                .define('h', ModItems.HOT_DOG.get())
                .unlockedBy("has_hot_dog", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.HOT_DOG.get()))
                .save(consumer);
    }

}
