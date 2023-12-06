package net.tepb.overhaulequipments.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.tepb.overhaulequipments.OverhaulEquipmentsMod;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag (String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(OverhaulEquipmentsMod.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createTag (String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(OverhaulEquipmentsMod.MOD_ID, name));
        }
    }
}
