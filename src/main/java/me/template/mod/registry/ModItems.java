package me.template.mod.registry;

import me.template.mod.TemplateMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public abstract class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TemplateMod.MODID);

    protected static DeferredItem<Item> registerItem(String name, Item.Properties properties) {
        return ITEMS.registerSimpleItem(name, properties);
    }

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}