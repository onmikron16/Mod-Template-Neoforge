package me.template.mod.registry.Items;

import me.template.mod.registry.ModItems;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.RegisterEvent;

import static me.template.mod.TemplateMod.MODID;

@Mod(MODID)
public class ExampleItem extends ModItems {

    public static final DeferredItem<Item> EXAMPLE_ITEM =
            registerItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void RegisterEvent(RegisterEvent event) {
    }
}