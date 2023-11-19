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

public class ModItemGroups {

    public static final ItemGroup DEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OverhaulEquipmentsMod.MOD_ID, "dest"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dest"))
                    .icon(() -> new ItemStack(ModItems.RAW_DEST_IRON)).entries((displayContext, entries) -> {
                       entries.add(ModItems.RAW_DEST_IRON);

                       entries.add(Items.RAW_IRON);
                    }).build());
    public static void registerItemGroups() {
        OverhaulEquipmentsMod.LOGGER.info("Registering Item Groups for " + OverhaulEquipmentsMod.MOD_ID);
    }
}
