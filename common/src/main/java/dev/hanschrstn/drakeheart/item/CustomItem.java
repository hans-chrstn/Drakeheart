package dev.hanschrstn.drakeheart.item;

import dev.hanschrstn.drakeheart.Constants;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomItem extends Item {
    public CustomItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            Constants.LOG.info("Custom item used!");
        }
        return super.use(level, player, hand);
    }
}
