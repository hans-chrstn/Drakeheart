package dev.hanschrstn.drakeheart.platform;

import dev.hanschrstn.drakeheart.CommonClass;
import dev.hanschrstn.drakeheart.Constants;
import dev.hanschrstn.drakeheart.platform.services.IRegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class FabricRegistryHelper implements IRegistryHelper {
    @Override
    public <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        T registeredItem = Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item.get());
        return () -> registeredItem;
    }

    @Override
    public void buildCreativeTab() {
        ResourceKey<CreativeModeTab> itemGroupKey = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "drakeheart_tab"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, itemGroupKey, FabricItemGroup.builder()
                .icon(() -> new ItemStack(CommonClass.ITEMS.get(0).get()))
                .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".drakeheart_tab"))
                .build());

        ItemGroupEvents.modifyEntriesEvent(itemGroupKey).register(content -> {
            CommonClass.ITEMS.forEach(item -> content.accept(item.get()));
        });
    }
}
