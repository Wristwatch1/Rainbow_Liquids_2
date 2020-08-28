
package net.mcreator.rainbowliquidsmodreborn.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.rainbowliquidsmodreborn.RainbowLiquidsModRebornModElements;

@RainbowLiquidsModRebornModElements.ModElement.Tag
public class RainbowLiquidsItemGroup extends RainbowLiquidsModRebornModElements.ModElement {
	public RainbowLiquidsItemGroup(RainbowLiquidsModRebornModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrainbow_liquids") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.MILK_BUCKET, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
