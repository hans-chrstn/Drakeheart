package dev.hanschrstn.drakeheart.platform.services;

import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public interface IRegistryHelper {

    <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item);

    void buildCreativeTab();
}
