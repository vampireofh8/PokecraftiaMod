package com.pokecraftia.pokemod.items.food;

import com.pokecraftia.pokemod.PokeMod;
import com.pokecraftia.pokemod.init.ModItems;
import com.pokecraftia.pokemod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel 
{
	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		PokeMod.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
