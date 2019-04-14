package com.pokecraftia.pokemod.items;


import com.pokecraftia.pokemod.PokeMod;
import com.pokecraftia.pokemod.init.ModItems;
import com.pokecraftia.pokemod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		PokeMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
