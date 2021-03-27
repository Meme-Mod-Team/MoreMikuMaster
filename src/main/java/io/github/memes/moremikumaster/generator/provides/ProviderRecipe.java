package io.github.memes.moremikumaster.generator.provides;

import io.github.memes.moremikumaster.item.ModItems;
import net.minecraft.advancements.criterion.CriterionInstance;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

public class ProviderRecipe extends ProviderBaseRecipe {
    public ProviderRecipe(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        registerShapedRecipes(consumer);
        registerShapelessRecipes(consumer);
        registerFurnaceRecipes(consumer);
    }

    private void registerShapedRecipes(Consumer<IFinishedRecipe> consumer) {
    }

    private void registerShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.GRASS_MIKUMASTER.get())
                .addIngredient(ModItems.MIKUMASTER.get())
                .addIngredient(Items.GRASS)
                .addCriterion("has_mikumaster", hasItem(ModItems.MIKUMASTER.get()))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.WOOD_MIKUMASTER.get())
                .addIngredient(ModItems.MIKUMASTER.get())
                .addIngredient(ItemTags.LOGS)
                .addCriterion("has_mikumaster", hasItem(ModItems.MIKUMASTER.get()))
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.STONE_MIKUMASTER.get())
                .addIngredient(ModItems.MIKUMASTER.get())
                .addIngredient(Items.STONE)
                .addCriterion("has_mikumaster", hasItem(ModItems.MIKUMASTER.get()))
                .build(consumer);
    }

    private void registerFurnaceRecipes(Consumer<IFinishedRecipe> consumer) {

    }
}
