package com.pokecraftia.pokemod.items.tools;

import com.pokecraftia.pokemod.PokeMod;
import com.pokecraftia.pokemod.init.ModItems;
import com.pokecraftia.pokemod.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material)
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
