package me.template.mod.registry.blocks;

import me.template.mod.registry.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.RegisterEvent;

import static me.template.mod.TemplateMod.MODID;

@Mod(MODID)
public class ExampleBlock extends ModBlocks {

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock(
            "example_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void RegisterEvent(RegisterEvent event) {
        // testing
    }
}