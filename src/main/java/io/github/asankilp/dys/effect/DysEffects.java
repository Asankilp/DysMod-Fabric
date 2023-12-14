package io.github.asankilp.dys.effect;

import io.github.asankilp.dys.Dys;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;

public class DysEffects {
//    public static final LazyRegistrar<MobEffect> EFFECTS = LazyRegistrar.create(Registry.MOB_EFFECT, Dys.MODID);
//    public static final RegistryObject<MobEffect> SENPAI = EFFECTS.register("senpai_stare", SenpaiEffect::new);
//
    public static MobEffect SENPAI_STARE;

    public static void register() {
        SENPAI_STARE = BuiltinRegistries.register(Registry.MOB_EFFECT, new ResourceLocation(Dys.MODID, "senpai_stare"), new SenpaiEffect()).value();
    }
}
