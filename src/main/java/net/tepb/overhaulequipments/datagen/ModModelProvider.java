package net.tepb.overhaulequipments.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.tepb.overhaulequipments.block.ModBlocks;
import net.tepb.overhaulequipments.item.ModItems;
public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DEST_IRON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEST_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_CRAFTING_TABLE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GRANITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GRANITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_KNIFE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RAW_DEST_IRON, Models.GENERATED);

        itemModelGenerator.register(ModItems.ACACIA_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAMBOO_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRCH_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_OAK_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGROVE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRUCE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_STICK, Models.GENERATED);


    }
}
