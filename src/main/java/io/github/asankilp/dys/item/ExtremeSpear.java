package io.github.asankilp.dys.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ExtremeSpear extends TridentItem {
    public ExtremeSpear() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
    @Override
    public void releaseUsing(ItemStack itemStack, Level level, LivingEntity livingEntity, int i) {
        if (livingEntity instanceof Player player) {
            int j = this.getUseDuration(itemStack) - i;
            if (j >= 10) {
                int k = EnchantmentHelper.getRiptide(itemStack);
                if (k <= 0 || player.isInWaterOrRain()) {
                    if (!level.isClientSide) {
                        itemStack.hurtAndBreak(1, player, (playerx) -> {
                            playerx.broadcastBreakEvent(livingEntity.getUsedItemHand());
                        });
                        if (k == 0) {
                            ThrownTrident thrownTrident = new ThrownTrident(level, player, itemStack);
                            thrownTrident.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 2.5F + (float) k * 0.5F, 1.0F);
                            if (player.getAbilities().instabuild) {
                                thrownTrident.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                            }

                            level.addFreshEntity(thrownTrident);
                            level.playSound((Player) null, thrownTrident, SoundEvents.TRIDENT_THROW, SoundSource.PLAYERS, 1.0F, 1.0F);
                            if (!player.getAbilities().instabuild) {
                                player.getInventory().removeItem(itemStack);
                            }
                        }
                    }

                    player.awardStat(Stats.ITEM_USED.get(this));
                    if (k > 0) {
                        float f = player.getYRot();
                        float g = player.getXRot();
                        float h = -Mth.sin(f * 0.017453292F) * Mth.cos(g * 0.017453292F);
                        float l = -Mth.sin(g * 0.017453292F);
                        float m = Mth.cos(f * 0.017453292F) * Mth.cos(g * 0.017453292F);
                        float n = Mth.sqrt(h * h + l * l + m * m);
                        float o = 3.0F * ((1.0F + (float) k) / 4.0F);
                        h *= o / n;
                        l *= o / n;
                        m *= o / n;
                        player.push((double) h, (double) l, (double) m);
                        player.startAutoSpinAttack(20);
                        if (player.isOnGround()) {
                            float p = 1.1999999F;
                            player.move(MoverType.SELF, new Vec3(0.0, 1.1999999284744263, 0.0));
                        }

                        SoundEvent soundEvent;
                        if (k >= 3) {
                            soundEvent = SoundEvents.TRIDENT_RIPTIDE_3;
                        } else if (k == 2) {
                            soundEvent = SoundEvents.TRIDENT_RIPTIDE_2;
                        } else {
                            soundEvent = SoundEvents.TRIDENT_RIPTIDE_1;
                        }

                        level.playSound((Player) null, player, soundEvent, SoundSource.PLAYERS, 1.0F, 1.0F);
                    }

                }
            }
        }
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (itemStack.getDamageValue() >= itemStack.getMaxDamage() - 1) {
            return InteractionResultHolder.fail(itemStack);
        } else if (EnchantmentHelper.getRiptide(itemStack) > 0 && !player.isInWaterOrRain()) {
            return InteractionResultHolder.fail(itemStack);
        } else {
            player.startUsingItem(interactionHand);
            return InteractionResultHolder.consume(itemStack);
        }
    }
}
