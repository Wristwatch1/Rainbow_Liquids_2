package net.mcreator.rainbowliquidsmodreborn.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rainbowliquidsmodreborn.RainbowLiquidsModRebornModElements;

import java.util.Map;

@RainbowLiquidsModRebornModElements.ModElement.Tag
public class WhiteSpectraMobplayerCollidesBlockProcedure extends RainbowLiquidsModRebornModElements.ModElement {
	public WhiteSpectraMobplayerCollidesBlockProcedure(RainbowLiquidsModRebornModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WhiteSpectraMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 1, (false), (true)));
	}
}
