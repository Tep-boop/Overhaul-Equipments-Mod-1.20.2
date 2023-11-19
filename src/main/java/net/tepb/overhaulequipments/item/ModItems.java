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
    private static String name;

    private static  void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_DEST_IRON);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OverhaulEquipmentsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OverhaulEquipmentsMod.LOGGER.info("Registering Mod Items for " + OverhaulEquipmentsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
