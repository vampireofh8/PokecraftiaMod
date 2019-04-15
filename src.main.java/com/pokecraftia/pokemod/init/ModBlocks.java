package com.pokecraftia.pokemod.init;

import java.util.ArrayList;
import java.util.List;

import com.pokecraftia.pokemod.blocks.BlueBlock;
import com.pokecraftia.pokemod.blocks.BlueOre;
import com.pokecraftia.pokemod.blocks.GreenBlock;
import com.pokecraftia.pokemod.blocks.GreenOre;
import com.pokecraftia.pokemod.blocks.RedBlock;
import com.pokecraftia.pokemod.blocks.RedLeaves;
import com.pokecraftia.pokemod.blocks.RedLog;
import com.pokecraftia.pokemod.blocks.RedOre;
import com.pokecraftia.pokemod.blocks.RedPlank;
import com.pokecraftia.pokemod.blocks.RedSapling;
import com.pokecraftia.pokemod.blocks.YellowBlock;
import com.pokecraftia.pokemod.blocks.YellowOre;
import com.pokecraftia.pokemod.blocks.OrangeBlock;
import com.pokecraftia.pokemod.blocks.OrangeOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	  //Blocks
		//Red
		public static final Block RED_BLOCK 	= new RedBlock(		"red_block", 	Material.IRON);
		public static final Block RED_ORE 		= new RedOre(		"red_ore", 		Material.ROCK);
		//Orange
		public static final Block ORANGE_BLOCK 	= new OrangeBlock(	"orange_block", Material.IRON);
		public static final Block ORANGE_ORE 	= new OrangeOre(	"orange_ore", 	Material.ROCK);
		//Yellow
		public static final Block YELLOW_BLOCK 	= new YellowBlock(	"yellow_block", Material.IRON);
		public static final Block YELLOW_ORE	= new YellowOre(	"yellow_ore", 	Material.ROCK);
		//Blue
		public static final Block BLUE_BLOCK 	= new BlueBlock(	"blue_block", 	Material.IRON);
		public static final Block BLUE_ORE 		= new BlueOre(		"blue_ore", 	Material.ROCK);
		//Green
		public static final Block GREEN_BLOCK 	= new GreenBlock(	"green_block", 	Material.IRON);
		public static final Block GREEN_ORE 	= new GreenOre(		"green_ore", 	Material.ROCK);
		//RedWood
		public static final Block RED_LOG		= new RedLog(		"red_log",		Material.WOOD);
		public static final Block RED_LEAVES	= new RedLeaves(	"red_leaves",	Material.WOOD);
		public static final Block RED_PLANK		= new RedPlank(		"red_plank",	Material.WOOD);
		public static final Block RED_SAPLING	= new RedSapling(	"red_sapling",	Material.WOOD);	
}
