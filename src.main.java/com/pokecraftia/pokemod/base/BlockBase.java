package com.pokecraftia.pokemod.base;

import com.pokecraftia.pokemod.PokeMod;
import com.pokecraftia.pokemod.init.ModBlocks;
import com.pokecraftia.pokemod.init.ModItems;
import com.pokecraftia.pokemod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(PokeMod.pokemodblocktab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		PokeMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
