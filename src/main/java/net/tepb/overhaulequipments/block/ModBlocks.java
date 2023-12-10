package net.tepb.overhaulequipments.block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tepb.overhaulequipments.OverhaulEquipmentsMod;

public class ModBlocks {

    public static final Block RAW_DEST_IRON_BLOCK = registerBlock("raw_dest_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block DEST_IRON_ORE = registerBlock("dest_iron_ore",
            new Block(FabricBlockSettings.copy(Blocks.IRON_ORE)));
    public static final Block RAW_CRAFTING_TABLE = registerBlock("raw_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OverhaulEquipmentsMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OverhaulEquipmentsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        OverhaulEquipmentsMod.LOGGER.info("Registering ModBlocks for " + OverhaulEquipmentsMod.MOD_ID);
    }

}