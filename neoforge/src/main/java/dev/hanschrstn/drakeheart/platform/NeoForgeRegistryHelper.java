package dev.hanschrstn.drakeheart.platform;

import dev.hanschrstn.drakeheart.CommonClass;
import dev.hanschrstn.drakeheart.Constants;
import dev.hanschrstn.drakeheart.DrakeheartNeoforge;
import dev.hanschrstn.drakeheart.platform.services.IRegistryHelper;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class NeoForgeRegistryHelper implements IRegistryHelper {
    @Override
    public <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        return DrakeheartNeoforge.ITEMS.register(name, item);
    }

    @Override
    public void buildCreativeTab() {
        DrakeheartNeoforge.CREATIVE_MODE_TABS.register("drakeheart_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".drakeheart_tab"))
                .icon(() -> new ItemStack(CommonClass.ITEMS.get(0).get()))
                .displayItems((params, output) -> {
                    CommonClass.ITEMS.forEach(item -> output.accept(item.get()));
                })
                .build()
        );
    }
}
