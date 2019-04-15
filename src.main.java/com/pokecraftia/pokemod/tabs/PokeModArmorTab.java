package com.pokecraftia.pokemod.tabs;

import com.pokecraftia.pokemod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PokeModArmorTab extends CreativeTabs {

	public PokeModArmorTab(String label) 
	{
		super("PokeModArmorTab");
		this.setBackgroundImageName("pokemod.png");}
		public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLUE_CHESTPLATE);
	}
		
		
}
