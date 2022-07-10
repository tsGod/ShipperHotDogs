package dev.tsgod.shipperhotdogs.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.minecraft.world.food.FoodProperties;

public class FoodValues {

        public static final FoodProperties HOT_DOG = (new FoodProperties.Builder())
                        .nutrition(10).saturationMod(0.4f).build();

        public static final FoodProperties SHIPPER_HOT_DOG = (new FoodProperties.Builder())
                        .nutrition(200).saturationMod(2f)
                        .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0F)
                        .build();

        public static final FoodProperties BITCHER_HOT_DOG = (new FoodProperties.Builder())
                        .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1200, 0), 1.0F)
                        .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 1200, 0), 1.0F)
                        .nutrition(0).saturationMod(0.1f).build();

}
