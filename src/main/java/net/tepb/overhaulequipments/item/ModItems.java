package net.tepb.overhaulequipments.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.tepb.overhaulequipments.OverhaulEquipmentsMod;

public class ModItems {

    public static final Item RAW_DEST_IRON = registerItem("raw_dest_iron", new Item(new FabricItemSettings()));
    public static final Item SPRUCE_STICK = registerItem("spruce_stick", new Item(new FabricItemSettings()));
    public static final Item BIRCH_STICK = registerItem("birch_stick", new Item(new FabricItemSettings()));
    public static final Item JUNGLE_STICK = registerItem("jungle_stick", new Item(new FabricItemSettings()));
    public static final Item ACACIA_STICK = registerItem("acacia_stick", new Item (new FabricItemSettings()));
    public static final Item DARK_OAK_STICK = registerItem("dark_oak_stick", new Item (new FabricItemSettings()));
    public static final Item MANGROVE_STICK = registerItem("mangrove_stick", new Item (new FabricItemSettings()));
    public static final Item CHERRY_STICK = registerItem("cherry_stick", new Item (new FabricItemSettings()));
    public static final Item BAMBOO_STICK = registerItem("bamboo_stick", new Item (new FabricItemSettings()));
    public static final Item CRIMSON_STICK = registerItem("crimson_stick", new Item (new FabricItemSettings()));
    public static final Item WARPED_STICK = registerItem("warped_stick", new Item (new FabricItemSettings()));
    
    private static  void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_DEST_IRON);
        entries.add(SPRUCE_STICK);
        entries.add(BIRCH_STICK);
        entries.add(JUNGLE_STICK);
        entries.add(ACACIA_STICK);
        entries.add(DARK_OAK_STICK);
        entries.add(MANGROVE_STICK);
        entries.add(CHERRY_STICK);
        entries.add(BAMBOO_STICK);
        entries.add(CRIMSON_STICK);
        entries.add(WARPED_STICK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OverhaulEquipmentsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OverhaulEquipmentsMod.LOGGER.info("Registering Mod Items for " + OverhaulEquipmentsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
