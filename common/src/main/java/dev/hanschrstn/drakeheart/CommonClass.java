package dev.hanschrstn.drakeheart;

import dev.hanschrstn.drakeheart.item.CustomItem;
import dev.hanschrstn.drakeheart.item.tool.DrakeBoneSword;
import dev.hanschrstn.drakeheart.item.tool.FireInfusedDrakeSword;
import dev.hanschrstn.drakeheart.platform.Services;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as Forge events
// however it will be compatible with all supported mod loaders.
public class CommonClass {

    public static final List<Supplier<Item>> ITEMS = new ArrayList<>();

    // The loader specific projects are able to import and use any code from the common project. This allows you to
    // write the majority of your code here and load it from your loader specific projects. This example has some
    // code that gets invoked by the entry point of the loader specific projects.
    public static void init() {

        ITEMS.add(Services.REGISTRY.registerItem("drake_bone_sword", DrakeBoneSword::new));
        ITEMS.add(Services.REGISTRY.registerItem("fire_infused_drake_sword", FireInfusedDrakeSword::new));

        Services.REGISTRY.buildCreativeTab();
    }
}