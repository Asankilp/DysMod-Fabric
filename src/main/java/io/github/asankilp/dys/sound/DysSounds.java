package io.github.asankilp.dys.sound;

import io.github.asankilp.dys.Dys;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;


public class DysSounds {
//    public static final LazyRegistrar<SoundEvent> SOUNDS = LazyRegistrar.create(Registry.SOUND_EVENT, Dys.MODID);
//    public static final RegistryObject<SoundEvent> YAJU_SOUND = SOUNDS.register("ambient.yaju.shout", ()
//            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.shout")));
//    public static final RegistryObject<SoundEvent> YAJU_BLOCK_PLACE_SOUND = SOUNDS.register("block.yaju_block.place", ()
//            -> new SoundEvent(new ResourceLocation(Dys.MODID, "block.yaju_block.place")));
//    public static final RegistryObject<SoundEvent> TOKUGAWA_SHOUT_SOUND = SOUNDS.register("ambient.tokugawa.shout", ()
//            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.tokugawa.shout")));
//    public static final RegistryObject<SoundEvent> YAJU_YARIMASU_SOUND = SOUNDS.register("ambient.yaju.yarimasu", ()
//            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.yarimasu")));
//    public static final RegistryObject<SoundEvent> AKARI_AKARIN_SOUND = SOUNDS.register("ambient.akaza_akari.akarin", ()
//            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.akaza_akari.akarin")));
//    public static final RegistryObject<SoundEvent> GABA_GOLD_SOUND = SOUNDS.register("ambient.gaba.gold", ()
//            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.gaba.gold")));
//    public static final RegistryObject<SoundEvent> DEDEDON_SOUND = SOUNDS.register("ambient.dededon", ()
//            -> new SoundEvent(new ResourceLocation(Dys.MODID, "ambient.dededon")));
    public static SoundEvent YAJU_SOUND;
    public static SoundEvent YAJU_BLOCK_PLACE_SOUND;
    public static SoundEvent TOKUGAWA_SHOUT_SOUND;
    public static SoundEvent YAJU_YARIMASU_SOUND;
    public static SoundEvent AKARI_AKARIN_SOUND;
    public static SoundEvent GABA_GOLD_SOUND;
    public static SoundEvent DEDEDON_SOUND;

    public static void register() {
        YAJU_SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(Dys.MODID, "ambient.yaju.shout"), SoundEvent.createVariableRangeEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.shout")));
        YAJU_BLOCK_PLACE_SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(Dys.MODID, "block.yaju_block.place"), SoundEvent.createVariableRangeEvent(new ResourceLocation(Dys.MODID, "block.yaju_block.place")));
        TOKUGAWA_SHOUT_SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT,new ResourceLocation(Dys.MODID, "ambient.tokugawa.shout"), SoundEvent.createVariableRangeEvent(new ResourceLocation(Dys.MODID, "ambient.tokugawa.shout")));
        YAJU_YARIMASU_SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT,new ResourceLocation(Dys.MODID, "ambient.yaju.yarimasu"), SoundEvent.createVariableRangeEvent(new ResourceLocation(Dys.MODID, "ambient.yaju.yarimasu")));
        AKARI_AKARIN_SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT ,new ResourceLocation(Dys.MODID, "ambient.akaza_akari.akarin"), SoundEvent.createVariableRangeEvent(new ResourceLocation(Dys.MODID, "ambient.akaza_akari.akarin")));
        GABA_GOLD_SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT ,new ResourceLocation(Dys.MODID, "ambient.gaba.gold"), SoundEvent.createVariableRangeEvent(new ResourceLocation(Dys.MODID, "ambient.gaba.gold")));
        DEDEDON_SOUND = Registry.register(BuiltInRegistries.SOUND_EVENT ,new ResourceLocation(Dys.MODID, "ambient.dededon"), SoundEvent.createVariableRangeEvent(new ResourceLocation(Dys.MODID, "ambient.dededon")));





    }

}
