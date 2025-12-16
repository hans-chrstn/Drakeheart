package dev.hanschrstn.drakeheart.item.tool;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class ModTiers {
    public static final Tier DRAKE_BONE = new Tier() {
        @Override public int getUses() { return 300; }
        @Override public float getSpeed() { return 6.0f; }
        @Override public float getAttackDamageBonus() { return 2.5f; }
        @Override public int getEnchantmentValue() { return 18; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.BONE); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_IRON_TOOL; }
    };

    public static final Tier FIRE = new Tier() {
        @Override public int getUses() { return 1800; }
        @Override public float getSpeed() { return 8.0f; }
        @Override public float getAttackDamageBonus() { return 4.0f; }
        @Override public int getEnchantmentValue() { return 15; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.BLAZE_ROD); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_DIAMOND_TOOL; }
    };

    public static final Tier ICE = new Tier() {
        @Override public int getUses() { return 1600; }
        @Override public float getSpeed() { return 7.0f; }
        @Override public float getAttackDamageBonus() { return 3.5f; }
        @Override public int getEnchantmentValue() { return 12; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.ICE); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_DIAMOND_TOOL; }
    };

    public static final Tier EVOCATION = new Tier() {
        @Override public int getUses() { return 100; }
        @Override public float getSpeed() { return 6.0f; }
        @Override public float getAttackDamageBonus() { return 1.0f; }
        @Override public int getEnchantmentValue() { return 25; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.LAPIS_LAZULI); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_STONE_TOOL; }
    };

    public static final Tier NATURE = new Tier() {
        @Override public int getUses() { return 2200; }
        @Override public float getSpeed() { return 5.0f; }
        @Override public float getAttackDamageBonus() { return 5.0f; }
        @Override public int getEnchantmentValue() { return 10; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.MOSS_BLOCK); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_DIAMOND_TOOL; }
    };

    public static final Tier ENDER = new Tier() {
        @Override public int getUses() { return 1300; }
        @Override public float getSpeed() { return 9.0f; }
        @Override public float getAttackDamageBonus() { return 4.5f; }
        @Override public int getEnchantmentValue() { return 20; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.ENDER_PEARL); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_DIAMOND_TOOL; }
    };

    public static final Tier BLOOD = new Tier() {
        @Override public int getUses() { return 1500; }
        @Override public float getSpeed() { return 7.0f; }
        @Override public float getAttackDamageBonus() { return 3.0f; }
        @Override public int getEnchantmentValue() { return 14; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.NETHER_WART); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_DIAMOND_TOOL; }
    };

    public static final Tier WIND = new Tier() {
        @Override public int getUses() { return 500; }
        @Override public float getSpeed() { return 12.0f; }
        @Override public float getAttackDamageBonus() { return 2.0f; }
        @Override public int getEnchantmentValue() { return 16; }
        @Override public Ingredient getRepairIngredient() { return Ingredient.of(Items.FEATHER); }
        @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_IRON_TOOL; }
    };
}
