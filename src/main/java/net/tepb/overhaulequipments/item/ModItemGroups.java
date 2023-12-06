package net.tepb.overhaulequipments.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tepb.overhaulequipments.OverhaulEquipmentsMod;
import net.tepb.overhaulequipments.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup DEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OverhaulEquipmentsMod.MOD_ID, "dest"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dest"))
                    .icon(() -> new ItemStack(ModItems.RAW_DEST_IRON)).entries((displayContext, entries) -> {
                       entries.add(ModItems.RAW_DEST_IRON);
                       entries.add(ModBlocks.RAW_DEST_IRON_BLOCK);

                       entries.add(ModItems.SPRUCE_STICK);
                       entries.add(ModItems.BIRCH_STICK);
                       entries.add(ModItems.JUNGLE_STICK);
                       entries.add(ModItems.ACACIA_STICK);
                       entries.add(ModItems.DARK_OAK_STICK);
                       entries.add(ModItems.MANGROVE_STICK);
                       entries.add(ModItems.CHERRY_STICK);
                       entries.add(ModItems.BAMBOO_STICK);
                       entries.add(ModItems.CRIMSON_STICK);
                       entries.add(ModItems.WARPED_STICK);

                       entries.add(ModItems.GRANITE_SWORD);
                       entries.add(ModItems.DIORITE_SWORD);
                       entries.add(ModItems.ANDESITE_SWORD);
                    }).build());
    public static void registerItemGroups() {
        OverhaulEquipmentsMod.LOGGER.info("Registering Item Groups for " + OverhaulEquipmentsMod.MOD_ID);
    }
}
