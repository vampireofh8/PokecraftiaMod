package com.pokecraftia.pokemod.items.tools;

import com.pokecraftia.pokemod.PokeMod;
import com.pokecraftia.pokemod.init.ModItems;
import com.pokecraftia.pokemod.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {

	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(PokeMod.pokemodtooltab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		PokeMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
