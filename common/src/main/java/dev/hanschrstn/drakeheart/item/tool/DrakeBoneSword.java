package dev.hanschrstn.drakeheart.item.tool;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class DrakeBoneSword extends SwordItem {
    public DrakeBoneSword() {
        super(ModTiers.DRAKE_BONE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.DRAKE_BONE, 3, -2.4f)));
    }
}
