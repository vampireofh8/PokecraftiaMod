package com.pokecraftia.pokemod.tabs;

import com.pokecraftia.pokemod.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PokeModBlockTab extends CreativeTabs {

	public PokeModBlockTab(String label) 
	{
		super("PokeModBlockTab");
		this.setBackgroundImageName("pokemod.png");}
		public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.BLUE_BLOCK);
	}
		
		
}
