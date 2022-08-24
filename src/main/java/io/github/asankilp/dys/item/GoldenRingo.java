package io.github.asankilp.dys.item;

import io.github.asankilp.dys.effect.EffectReg;
import io.github.asankilp.dys.sound.SoundReg;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class GoldenRingo extends Item {
    private static final FoodProperties ringo = (new FoodProperties.Builder())
            .saturationMod(1.2F)
            .nutrition(4)
            .effect((new MobEffectInstance(MobEffects.CONFUSION, 114, 514, true, false)), 1)
//            .effect((new MobEffectInstance(MobEffects.DARKNESS, 114, 514, true, false)), 1)

            .build();

    public GoldenRingo() {
        super(new Properties().food(ringo).tab(CreativeModeTab.TAB_FOOD));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemIn, Level levelIn, LivingEntity entityIn) {
        // entityIn.getEffect(EffectReg.SENPAI.get()).getAmplifier()
        // entityIn.addEffect(new MobEffectInstance(EffectReg.SENPAI.get(), 1000, 1, true, false), entityIn);
        if (entityIn.hasEffect(EffectReg.SENPAI.get())) {
            int level = entityIn.getEffect(EffectReg.SENPAI.get()).getAmplifier();
            if (level < 1) {
                entityIn.addEffect(new MobEffectInstance(EffectReg.SENPAI.get(), 1000, level + 1, true, true), entityIn);
            }
            if (level == 0) {
                levelIn.playSound((Player) null, entityIn.getX(), entityIn.getY(), entityIn.getZ(), SoundReg.gabaGoldSound.get(), SoundSource.AMBIENT, 0.5f, 1f);
            }
            if (level >= 1) {
                levelIn.playSound((Player) null, entityIn.getX(), entityIn.getY(), entityIn.getZ(), SoundReg.dededonSound.get(), SoundSource.AMBIENT, 0.5f, 1f);
                entityIn.removeEffect(EffectReg.SENPAI.get());
                entityIn.addEffect((new MobEffectInstance(MobEffects.DARKNESS, 114, 514, true, false)));
            }
        } else {
            entityIn.addEffect(new MobEffectInstance(EffectReg.SENPAI.get(), 1000, 0, true, true), entityIn);
            levelIn.playSound((Player) null, entityIn.getX(), entityIn.getY(), entityIn.getZ(), SoundReg.tokugawaShoutSound.get(), SoundSource.AMBIENT, 0.5f, 1f);
        }
        return super.finishUsingItem(itemIn, levelIn, entityIn);
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level levelIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.translatable("item.golden_ringo.tip1"));
        tooltip.add(Component.translatable("item.golden_ringo.tip2"));
    }
}