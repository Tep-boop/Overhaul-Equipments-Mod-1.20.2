package net.tepb.overhaulequipments.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.tepb.overhaulequipments.OverhaulEquipmentsMod;
public class ModItems {

    public static final Item RAW_DEST_IRON = registerItem("raw_dest_iron", new Item(new FabricItemSettings()));
    public static final Item SPRUCE_STICK = registerItem("spruce_stick", new Item(new FabricItemSettings()));
    public static final Item BIRCH_STICK = registerItem("birch_stickk", new Item(new FabricItemSettings()));
    public static final Item JUNGLE_STICK = registerItem("jungle_stick", new Item(new FabricItemSettings()));
    public static final Item ACACIA_STICK = registerItem("acacia_stick", new Item (new FabricItemSettings()));
    public static final Item DARK_OAK_STICK = registerItem("dark_oak_stick", new Item (new FabricItemSettings()));
    public static final Item MANGROVE_STICK = registerItem("mangrove_stick", new Item (new FabricItemSettings()));
    public static final Item CHERRY_STICK = registerItem("cherry_stick", new Item (new FabricItemSettings()));
    public static final Item BAMBOO_STICK = registerItem("bamboo_stick", new Item (new FabricItemSettings()));
    public static final Item CRIMSON_STICK = registerItem("crimson_stick", new Item (new FabricItemSettings()));
    public static final Item WARPED_STICK = registerItem("warped_stick", new Item (new FabricItemSettings()));

    public static final Item GRANITE_SWORD = registerItem("granite_sword",
            new SwordItem(ModToolMaterial.GRANITE_SWORD_MATERIAL,3, -2.4f, new FabricItemSettings()));
    public static final Item GRANITE_AXE = registerItem("granite_axe",
            new AxeItem(ModToolMaterial.GRANITE_AXE_MATERIAL, 3,-3.2f, new FabricItemSettings()));
    public static final Item GRANITE_PICKAXE = registerItem("granite_pickaxe",
            new PickaxeItem(ModToolMaterial.GRANITE_PICKAXE_MATERIAL, 3, -2.9f, new FabricItemSettings()));
    public static final Item GRANITE_SHOVEL = registerItem("granite_shovel",
            new ShovelItem(ModToolMaterial.GRANITE_SHOVEL_MATERIAL, 3, -3.1f, new FabricItemSettings()));
    public static final Item GRANITE_HOE = registerItem("granite_hoe",
            new HoeItem(ModToolMaterial.GRANITE_HOE_MATERIAL, 3, -2.2f, new FabricItemSettings()));
    public static final Item DIORITE_SWORD = registerItem("diorite_sword",
            new SwordItem(ModToolMaterial.DIORITE_SWORD_MATERIAL, 3, -3.2f, new FabricItemSettings()));
    public static final Item DIORITE_AXE = registerItem("diorite_axe",
            new AxeItem(ModToolMaterial.DIORITE_AXE_MATERIAL, 3, -3.2f, new FabricItemSettings()));
    public static final Item DIORITE_PICKAXE = registerItem("diorite_pickaxe",
            new PickaxeItem(ModToolMaterial.DIORITE_PICKAXE_MATERIAL, 3, -2.8f, new FabricItemSettings()));
    public static final Item DIORITE_SHOVEL = registerItem("diorite_shovel",
            new ShovelItem(ModToolMaterial.DIORITE_SHOVEL_MATERIAL, 3, -3.0f, new FabricItemSettings()));
    public static final Item DIORITE_HOE = registerItem("diorite_hoe",
            new HoeItem(ModToolMaterial.DIORITE_HOE_MATERIAL, 3, -2.0f, new FabricItemSettings()));
    public static final Item ANDESITE_SWORD = registerItem("andesite_sword",
            new SwordItem(ModToolMaterial.ANDESITE_SWORD_MATERIAL, 3, -3.1f, new FabricItemSettings()));
    public static final Item ANDESITE_AXE = registerItem("andesite_axe",
            new AxeItem(ModToolMaterial.ANDESITE_AXE_MATERIAL, 3, -3.4f, new FabricItemSettings()));
    public static final Item ANDESITE_PICKAXE = registerItem("andesite_pickaxe",
            new PickaxeItem(ModToolMaterial.ANDESITE_PICKAXE_MATERIAL, 3, -3.0f, new FabricItemSettings()));
    public static final Item ANDESITE_SHOVEL = registerItem("andesite_shovel",
            new ShovelItem(ModToolMaterial.ANDESITE_SHOVEL_MATERIAL, 3, -3.3f, new FabricItemSettings()));
    public static final Item ANDESITE_HOE = registerItem("andesite_hoe",
            new HoeItem(ModToolMaterial.ANDESITE_HOE_MATERIAL, 3, -2.4f, new FabricItemSettings()));
    public static final Item FLINT_KNIFE = registerItem("flint_knife",
            new SwordItem(ModToolMaterial.FLINT, 0, -0.6f, new FabricItemSettings()));
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

        entries.add(GRANITE_SWORD);
        entries.add(GRANITE_AXE);
        entries.add(GRANITE_PICKAXE);
        entries.add(GRANITE_SHOVEL);
        entries.add(GRANITE_HOE);
        entries.add(DIORITE_SWORD);
        entries.add(DIORITE_AXE);
        entries.add(DIORITE_PICKAXE);
        entries.add(DIORITE_SHOVEL);
        entries.add(DIORITE_HOE);
        entries.add(ANDESITE_SWORD);
        entries.add(ANDESITE_AXE);
        entries.add(ANDESITE_PICKAXE);
        entries.add(ANDESITE_SHOVEL);
        entries.add(ANDESITE_HOE);


        entries.add(FLINT_KNIFE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OverhaulEquipmentsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OverhaulEquipmentsMod.LOGGER.info("Registering Mod Items for " + OverhaulEquipmentsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
