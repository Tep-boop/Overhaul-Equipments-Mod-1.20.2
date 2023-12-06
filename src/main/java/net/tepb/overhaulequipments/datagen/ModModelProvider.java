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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GRANITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIORITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANDESITE_SWORD, Models.HANDHELD);

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