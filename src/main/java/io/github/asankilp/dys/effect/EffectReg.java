package io.github.asankilp.dys.effect;

import io.github.asankilp.dys.Dys;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.world.effect.MobEffect;

public class EffectReg {
    public static final LazyRegistrar<MobEffect> EFFECTS = LazyRegistrar.create(Registry.MOB_EFFECT, Dys.MODID);
    public static final RegistryObject<MobEffect> SENPAI = EFFECTS.register("senpai_stare", SenpaiEffect::new);


}
