package net.tepb.overhaulequipments.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    GRANITE_SWORD_MATERIAL(MiningLevels.STONE, 147, 4.0f, 1.7f, 5,
            () -> Ingredient.ofItems(Items.GRANITE)),
    GRANITE_AXE_MATERIAL(MiningLevels.STONE, 147, 4.0f, 5.3f, 5,
            () -> Ingredient.ofItems(Items.GRANITE)),
    GRANITE_PICKAXE_MATERIAL(MiningLevels.STONE, 147, 4.0f, -0.7f, 5,
            () -> Ingredient.ofItems(Items.GRANITE)),
    GRANITE_SHOVEL_MATERIAL(MiningLevels.STONE, 147, 4.0f, -0.3f, 5,
            () -> Ingredient.ofItems(Items.GRANITE)),
    GRANITE_HOE_MATERIAL(MiningLevels.STONE, 147, 4.0f, -2.7f, 5,
            () -> Ingredient.ofItems(Items.GRANITE)),

    DIORITE_SWORD_MATERIAL(MiningLevels.STONE, 137, 4.0f, 1.4f, 5,
            () -> Ingredient.ofItems(Items.DIORITE)),
    DIORITE_AXE_MATERIAL(MiningLevels.STONE, 137, 4.0f, 5.2f, 5,
            () -> Ingredient.ofItems(Items.DIORITE)),
    DIORITE_PICKAXE_MATERIAL(MiningLevels.STONE, 137, 4.0f, -0.8f, 5,
            () -> Ingredient.ofItems(Items.DIORITE)),
    DIORITE_SHOVEL_MATERIAL(MiningLevels.STONE, 137, 4.0f, -0.5f, 5,
            () -> Ingredient.ofItems(Items.DIORITE)),
    DIORITE_HOE_MATERIAL(MiningLevels.STONE, 137, 4.0f, -3.0f, 5,
            () -> Ingredient.ofItems(Items.DIORITE)),
   ANDESITE_SWORD_MATERIAL(MiningLevels.STONE, 151, 4.0f, 1.0f, 5,
            () -> Ingredient.ofItems(Items.ANDESITE)),
    ANDESITE_AXE_MATERIAL(MiningLevels.STONE, 151, 4.0f, 5.0f, 5,
            () -> Ingredient.ofItems(Items.ANDESITE)),
    ANDESITE_PICKAXE_MATERIAL(MiningLevels.STONE, 151, 4.0f, -1.0f, 5,
            () -> Ingredient.ofItems(Items.ANDESITE)),
    ANDESITE_SHOVEL_MATERIAL(MiningLevels.STONE, 151, 4.0f, -0.5f, 5,
            () -> Ingredient.ofItems(Items.ANDESITE)),
    ANDESITE_HOE_MATERIAL(MiningLevels.STONE, 151, 4.0f, -3.0f, 5,
            () -> Ingredient.ofItems(Items.ANDESITE)),
    FLINT(0, 61, 1.0f, 0.7f, 5,
    () -> Ingredient.ofItems(Items.FLINT));
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
