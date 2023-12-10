package net.tepb.overhaulequipments.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.tepb.overhaulequipments.block.ModBlocks;
import net.tepb.overhaulequipments.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_DEST_IRON_BLOCK);
        addDrop(ModBlocks.RAW_CRAFTING_TABLE);

        addDrop(ModBlocks.DEST_IRON_ORE, oreDrops(ModBlocks.DEST_IRON_ORE, ModItems.RAW_DEST_IRON));
    }
}
