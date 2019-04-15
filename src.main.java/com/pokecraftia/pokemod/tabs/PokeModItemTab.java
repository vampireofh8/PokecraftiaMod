package com.pokecraftia.pokemod.tabs;

import com.pokecraftia.pokemod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PokeModItemTab extends CreativeTabs {

	public PokeModItemTab(String label) 
	{
		super("PokeModItemTab");
		this.setBackgroundImageName("pokemod.png");}
		public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLUE_INGOT);
	}
		
		
}
