package dev.hanschrstn.drakeheart.item.tool;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class FireInfusedDrakeSword extends SwordItem {
    public FireInfusedDrakeSword() {
        super(ModTiers.FIRE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.FIRE, 3, -2.4f)));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.igniteForTicks(100);
        return super.hurtEnemy(stack, target, attacker);
    }
}
