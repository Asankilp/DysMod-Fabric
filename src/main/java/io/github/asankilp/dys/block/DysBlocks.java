package io.github.asankilp.dys.block;

import io.github.asankilp.dys.Dys;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class DysBlocks {
    public static Block YAJU_BLOCK;
    public static void register() {
        YAJU_BLOCK = BuiltinRegistries.register(Registry.BLOCK, new ResourceLocation(Dys.MODID, "yaju_block"), new YajuBlock()).value();

    }
}
