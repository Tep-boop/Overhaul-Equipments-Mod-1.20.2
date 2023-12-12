package net.tepb.overhaulequipments.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.tepb.overhaulequipments.block.ModBlocks;
import net.tepb.overhaulequipments.item.ModItems;


public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,
                ModItems.RAW_DEST_IRON, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_DEST_IRON_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_DEST_IRON_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RAW_DEST_IRON)
                .criterion(hasItem(ModItems.RAW_DEST_IRON), conditionsFromItem(ModItems.RAW_DEST_IRON))
                .offerTo(exporter, new Identifier("block_of_raw_dest_iron"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_CRAFTING_TABLE, 1)
                .pattern("##")
                .pattern("##")
                .input('#', Items.OAK_PLANKS)
                .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter, new Identifier("raw_crafting_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CRAFTING_TABLE, 1)
                .pattern("@@@")
                .pattern("H#H")
                .input('@', Items.LEATHER)
                .input('#', ModBlocks.RAW_CRAFTING_TABLE)
                .input('H', Items.IRON_INGOT)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModBlocks.RAW_CRAFTING_TABLE), conditionsFromItem(ModBlocks.RAW_CRAFTING_TABLE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.CRAFTING_TABLE)));
    }
}
