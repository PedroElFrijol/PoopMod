package dev.virusfusion.poopmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Poop implements ModInitializer {

	public static final Item poop = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block poopblock = new Block(FabricBlockSettings.of(Material.SOIL).strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS));

	public static final Item BurntPoop = new Item(new Item.Settings().group(ItemGroup.FOOD).food(PoopFood.BurntPoop));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier("poopmod", "poop"), poop);

		Registry.register(Registry.BLOCK, new Identifier("poopmod", "poopblock"), poopblock);

		Registry.register(Registry.ITEM, new Identifier("poopmod", "poopblock"), new BlockItem(poopblock, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.ITEM, new Identifier("poopmod", "burntpoop"), BurntPoop);

	}
}
