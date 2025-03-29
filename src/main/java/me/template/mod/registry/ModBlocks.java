package me.template.mod.registry;

import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static me.template.mod.TemplateMod.MODID;

public abstract class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static DeferredBlock<Block> BLOCKSITEM;

    protected static DeferredBlock<Block> registerBlock(String name, Block.Properties properties) {
        BLOCKSITEM = BLOCKS.registerSimpleBlock(name, properties);
        ITEMS.registerSimpleBlockItem(name, BLOCKSITEM);
        return BLOCKSITEM;
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }
}
