package com.pokecraftia.pokemod.init;

import java.util.ArrayList;
import java.util.List;

import com.pokecraftia.pokemod.blocks.BlueBlock;
import com.pokecraftia.pokemod.blocks.BlueOre;
import com.pokecraftia.pokemod.blocks.GreenBlock;
import com.pokecraftia.pokemod.blocks.GreenOre;
import com.pokecraftia.pokemod.blocks.RedBlock;
import com.pokecraftia.pokemod.blocks.RedOre;
import com.pokecraftia.pokemod.blocks.RubyBlock;
import com.pokecraftia.pokemod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	  //Blocks
		//Ruby
		public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
		public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
		//Red
		public static final Block RED_BLOCK = new RedBlock("red_block", Material.IRON);
		public static final Block RED_ORE = new RedOre("red_ore", Material.ROCK);
		//Blue
		public static final Block BLUE_BLOCK = new BlueBlock("blue_block", Material.IRON);
		public static final Block BLUE_ORE = new BlueOre("blue_ore", Material.ROCK);
		//Green
		public static final Block GREEN_BLOCK = new GreenBlock("green_block", Material.IRON);
		public static final Block GREEN_ORE = new GreenOre("green_ore", Material.ROCK);
	
	
	
}
