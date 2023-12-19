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
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,
                ModItems.DEST_IRON_NUGGET, RecipeCategory.MISC, ModItems.DEST_IRON_INGOT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_DEST_IRON_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RAW_DEST_IRON)
                .criterion(hasItem(ModItems.RAW_DEST_IRON), conditionsFromItem(ModItems.RAW_DEST_IRON))
                .offerTo(exporter, new Identifier("block_of_raw_dest_iron"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEST_IRON_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.DEST_IRON_INGOT)
                .criterion(hasItem(ModItems.DEST_IRON_INGOT), conditionsFromItem(ModItems.DEST_IRON_INGOT))
                .offerTo(exporter, new Identifier("dest_iron_block"));
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEPSLATE_FURNACE, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#', Items.COBBLED_DEEPSLATE)
                .criterion(hasItem(Items.COBBLED_DEEPSLATE), conditionsFromItem(Items.COBBLED_DEEPSLATE))
                .offerTo(exporter, new Identifier("deepslate_furnace"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .input('#', Items.GRANITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.GRANITE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_AXE, 1)
                .pattern("## ")
                .pattern("#/ ")
                .pattern(" / ")
                .input('#', Items.GRANITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.GRANITE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_PICKAXE, 1)
                .pattern("###")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', Items.GRANITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.GRANITE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_SHOVEL, 1)
                .pattern("#")
                .pattern("/")
                .pattern("/")
                .input('#', Items.GRANITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.GRANITE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRANITE_HOE, 1)
                .pattern("##")
                .pattern(" /")
                .pattern(" /")
                .input('#', Items.GRANITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.GRANITE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .input('#', Items.DIORITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DIORITE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_AXE, 1)
                .pattern("## ")
                .pattern("#/ ")
                .pattern(" / ")
                .input('#', Items.DIORITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DIORITE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_PICKAXE, 1)
                .pattern("###")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', Items.DIORITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DIORITE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_SHOVEL, 1)
                .pattern("#")
                .pattern("/")
                .pattern("/")
                .input('#', Items.DIORITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DIORITE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIORITE_HOE, 1)
                .pattern("##")
                .pattern(" /")
                .pattern(" /")
                .input('#', Items.DIORITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DIORITE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .input('#', Items.ANDESITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ANDESITE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_AXE, 1)
                .pattern("## ")
                .pattern("#/ ")
                .pattern(" / ")
                .input('#', Items.ANDESITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ANDESITE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_PICKAXE, 1)
                .pattern("###")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', Items.ANDESITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ANDESITE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_SHOVEL, 1)
                .pattern("#")
                .pattern("/")
                .pattern("/")
                .input('#', Items.ANDESITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ANDESITE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANDESITE_HOE, 1)
                .pattern("##")
                .pattern(" /")
                .pattern(" /")
                .input('#', Items.ANDESITE)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ANDESITE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_KNIFE, 1)
                .pattern(" #")
                .pattern("S/")
                .input('#', Items.FLINT)
                .input('S', Items.STRING)
                .input('/', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.FLINT_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ACACIA_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.ACACIA_PLANKS)
                .criterion(hasItem(Items.ACACIA_PLANKS), conditionsFromItem(Items.ACACIA_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ACACIA_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BAMBOO_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.BAMBOO_PLANKS)
                .criterion(hasItem(Items.BAMBOO_PLANKS), conditionsFromItem(Items.BAMBOO_PLANKS))
                .offerTo(exporter, new Identifier("bamboo_stick_from_bamboo_planks"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BAMBOO_STICK, 1)
                .pattern("/")
                .pattern("/")
                .input('/', Items.BAMBOO)
                .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                .offerTo(exporter, new Identifier("bamboo_stick_from_bamboo"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BIRCH_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.BIRCH_PLANKS)
                .criterion(hasItem(Items.BIRCH_PLANKS), conditionsFromItem(Items.BIRCH_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.BIRCH_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHERRY_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.CHERRY_PLANKS)
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.CHERRY_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CRIMSON_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.CRIMSON_PLANKS)
                .criterion(hasItem(Items.CRIMSON_PLANKS), conditionsFromItem(Items.CRIMSON_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.CRIMSON_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_OAK_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.DARK_OAK_PLANKS)
                .criterion(hasItem(Items.DARK_OAK_PLANKS), conditionsFromItem(Items.DARK_OAK_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DARK_OAK_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JUNGLE_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.JUNGLE_PLANKS)
                .criterion(hasItem(Items.JUNGLE_PLANKS), conditionsFromItem(Items.JUNGLE_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.JUNGLE_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MANGROVE_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.MANGROVE_PLANKS)
                .criterion(hasItem(Items.MANGROVE_PLANKS), conditionsFromItem(Items.MANGROVE_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.MANGROVE_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPRUCE_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.SPRUCE_PLANKS)
                .criterion(hasItem(Items.SPRUCE_PLANKS), conditionsFromItem(Items.SPRUCE_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.SPRUCE_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARPED_STICK, 4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.WARPED_PLANKS)
                .criterion(hasItem(Items.WARPED_PLANKS), conditionsFromItem(Items.WARPED_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.WARPED_STICK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEST_IRON_INGOT, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.DEST_IRON_NUGGET)
                .criterion(hasItem(ModItems.DEST_IRON_INGOT), conditionsFromItem(ModItems.DEST_IRON_NUGGET))
                .offerTo(exporter, new Identifier("dest_iron_ingot_from_dest_iron_nugget"));
    }
}
