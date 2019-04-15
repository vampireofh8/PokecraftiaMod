package com.pokecraftia.pokemod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RED_ORE,		new ItemStack(ModItems.RED_INGOT, 	1), 0.0f);
		GameRegistry.addSmelting(ModBlocks.ORANGE_ORE,	new ItemStack(ModItems.ORANGE_INGOT,1), 0.0f);
		GameRegistry.addSmelting(ModBlocks.YELLOW_ORE,	new ItemStack(ModItems.YELLOW_INGOT,1), 0.0f);
		GameRegistry.addSmelting(ModBlocks.BLUE_ORE,	new ItemStack(ModItems.BLUE_INGOT, 	1), 0.0f);
		GameRegistry.addSmelting(ModBlocks.GREEN_ORE,	new ItemStack(ModItems.GREEN_INGOT, 1), 0.0f);
	}
}
