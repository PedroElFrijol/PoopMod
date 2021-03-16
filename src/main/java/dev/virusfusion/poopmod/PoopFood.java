package dev.virusfusion.poopmod;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class PoopFood {

    public static final FoodComponent BurntPoop = (new FoodComponent.Builder().hunger(1).saturationModifier(0).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 0), 1F).snack().build());
    
}
