package net.olavo.ragnarokmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MYSTIC_MEAT = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2000, 1), 1.0f).build();
}
