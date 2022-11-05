package net.alexatorv13.testmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {



    public static final FoodProperties COCA = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).alwaysEat().effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4400, 3), 1.0F).alwaysEat().build();


}
