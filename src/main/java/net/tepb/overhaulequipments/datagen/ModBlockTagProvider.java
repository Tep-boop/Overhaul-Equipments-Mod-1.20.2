package net.tepb.overhaulequipments.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.tepb.overhaulequipments.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.RAW_CRAFTING_TABLE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_DEST_IRON_BLOCK)
                .add(ModBlocks.DEST_IRON_ORE)
                .add(ModBlocks.DEEPSLATE_DEST_IRON_ORE)
                .add(ModBlocks.RED_GRANITE)
                .add(ModBlocks.DEEPSLATE_FURNACE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RAW_DEST_IRON_BLOCK)
                .add(ModBlocks.DEST_IRON_ORE)
                .add(ModBlocks.DEEPSLATE_DEST_IRON_ORE);
    }
}
