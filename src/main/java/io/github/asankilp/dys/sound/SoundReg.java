package io.github.asankilp.dys.sound;

import io.github.asankilp.dys.Dys;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;


public class SoundReg {
    public static final LazyRegistrar<SoundEvent> SOUNDS = LazyRegistrar.create(Registry.SOUND_EVENT, Dys.MODID);
    public static final RegistryObject<SoundEvent> yajuSound = SOUNDS.register("ambient.yaju.shout", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.shout")));
    public static final RegistryObject<SoundEvent> yaju_block_placeSound = SOUNDS.register("block.yaju_block.place", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "block.yaju_block.place")));
    public static final RegistryObject<SoundEvent> tokugawaShoutSound = SOUNDS.register("ambient.tokugawa.shout", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.tokugawa.shout")));
    public static final RegistryObject<SoundEvent> yajuYarimasuSound = SOUNDS.register("ambient.yaju.yarimasu", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.yarimasu")));
    public static final RegistryObject<SoundEvent> akariakarinSound = SOUNDS.register("ambient.akaza_akari.akarin", ()
            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.akaza_akari.akarin")));
}
