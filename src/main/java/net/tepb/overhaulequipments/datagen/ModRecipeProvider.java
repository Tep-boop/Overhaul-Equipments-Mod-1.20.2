package net.tepb.overhaulequipments.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
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
    }
}
