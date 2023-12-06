package net.tepb.overhaulequipments.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.advancement.criterion.ItemDurabilityChangedCriterion;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.tepb.overhaulequipments.OverhaulEquipmentsMod;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    GRANITE(MiningLevels.STONE, 147, 4.0f, 1.7f, 5,
            () -> Ingredient.ofItems(Items.GRANITE)),
    DIORITE(MiningLevels.STONE, 137, 4.0f, 1.4f, 5,
            () -> Ingredient.ofItems(Items.DIORITE)),
    ANDESITE(MiningLevels.STONE, 151, 4.0f, 1.0f, 5,
            () -> Ingredient.ofItems(Items.ANDESITE));
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;
    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
