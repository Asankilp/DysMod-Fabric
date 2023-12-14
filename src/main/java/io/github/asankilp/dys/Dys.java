package io.github.asankilp.dys;
import io.github.asankilp.dys.block.DysBlocks;
import io.github.asankilp.dys.effect.DysEffects;
import io.github.asankilp.dys.item.DysItems;
import io.github.asankilp.dys.sound.DysSounds;
import net.fabricmc.api.ModInitializer;

public class Dys implements ModInitializer {
    public static final String MODID = "dys";
    
    @Override
    public void onInitialize() {
//        ItemReg.ITEMS.register();
        DysSounds.register();
        DysBlocks.register();
        DysEffects.register();
        DysItems.register();
    }
}
