package com.pokecraftia.pokemod.tabs;

import com.pokecraftia.pokemod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PokeModToolTab extends CreativeTabs {

	public PokeModToolTab(String label) 
	{
		super("PokeModToolTab");
		this.setBackgroundImageName("pokemod.png");}
		public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLUE_PICKAXE);
	}
		
		
}
