package io.github.asankilp.dys;
import io.github.asankilp.dys.effect.EffectReg;
import io.github.asankilp.dys.item.ItemReg;
import io.github.asankilp.dys.sound.SoundReg;
import net.fabricmc.api.ModInitializer;

public class Dys implements ModInitializer {
    public static final String MODID = "dys";

    @Override
    public void onInitialize() {
        ItemReg.ITEMS.register();
        SoundReg.SOUNDS.register();
        ItemReg.BLOCKS.register();
        EffectReg.EFFECTS.register();
    }
}
