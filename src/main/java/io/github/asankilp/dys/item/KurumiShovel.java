package io.github.asankilp.dys.item;


import net.minecraft.core.RegistryAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class KurumiShovel extends ShovelItem {

    public KurumiShovel() {
        super(Tiers.IRON,  (new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.IRON, 6, -3f))));
    }
    /*
     * This method refer to the Botania Mod.
     * Get the Source Code in github:
     * https://github.com/Vazkii/Botania
     *
     * Botania is Open Source and distributed under the
     * Botania License: http://botaniamod.net/license.php
     */
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (true) {
//            attacker.sendSystemMessage(Component.literal(target.get));
            attacker.level().playSound(null, attacker.getX(), attacker.getY(), attacker.getZ(), SoundEvents.ITEM_BREAK, attacker.getSoundSource(), 1F, 0.5F);
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 10, true, true));
//            target.addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 1,4));
            if (attacker instanceof Player) {
                target.hurt(attacker.level().damageSources().playerAttack((Player) attacker), stack.getDamageValue() * 5);
            } else {
                target.hurt(attacker.level().damageSources().mobAttack(attacker), stack.getDamageValue() * 5);

            }

        }
        return super.hurtEnemy(stack, target, attacker);
    }
//    @Override
//    public void appendHoverText(ItemStack stack, @Nullable Level levelIn, List<Component> tooltip, TooltipFlag flagIn) {
//        tooltip.add(Component.translatable("item.kurumi_shovel.tip1"));
//        tooltip.add(Component.translatable("item.kurumi_shovel.tip2"));
//    }

}
