package com.pokecraftia.pokemod.init;

import java.util.ArrayList;
import java.util.List;

import com.pokecraftia.pokemod.blocks.BlackBlock;
import com.pokecraftia.pokemod.blocks.BlackOre;
import com.pokecraftia.pokemod.blocks.BlueBlock;
import com.pokecraftia.pokemod.blocks.BlueOre;
import com.pokecraftia.pokemod.blocks.BrownBlock;
import com.pokecraftia.pokemod.blocks.BrownOre;
import com.pokecraftia.pokemod.blocks.GreenBlock;
import com.pokecraftia.pokemod.blocks.GreenOre;
import com.pokecraftia.pokemod.blocks.RedBlock;
import com.pokecraftia.pokemod.blocks.RedOre;
import com.pokecraftia.pokemod.blocks.WhiteBlock;
import com.pokecraftia.pokemod.blocks.WhiteOre;
import com.pokecraftia.pokemod.blocks.YellowBlock;
import com.pokecraftia.pokemod.blocks.YellowOre;
import com.pokecraftia.pokemod.blocks.OrangeBlock;
import com.pokecraftia.pokemod.blocks.OrangeOre;
import com.pokecraftia.pokemod.blocks.PurpleBlock;
import com.pokecraftia.pokemod.blocks.PurpleOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	  //Blocks
		//ORES
		public static final Block RED_ORE 		= new RedOre	("red_ore", 	Material.ROCK);
		public static final Block ORANGE_ORE 	= new OrangeOre	("orange_ore", 	Material.ROCK);
		public static final Block YELLOW_ORE	= new YellowOre	("yellow_ore", 	Material.ROCK);
		public static final Block BLUE_ORE 		= new BlueOre	("blue_ore", 	Material.ROCK);
		public static final Block GREEN_ORE 	= new GreenOre	("green_ore", 	Material.ROCK);	
		public static final Block PURPLE_ORE 	= new PurpleOre	("purple_ore",	Material.ROCK);
		public static final Block BROWN_ORE		= new BrownOre	("brown_ore", 	Material.ROCK);
		public static final Block BLACK_ORE 	= new BlackOre	("black_ore", 	Material.ROCK);
		public static final Block WHITE_ORE 	= new WhiteOre	("white_ore", 	Material.ROCK);	
		//BLOCKS
		public static final Block RED_BLOCK 	= new RedBlock(		"red_block", 	Material.IRON);
		public static final Block ORANGE_BLOCK 	= new OrangeBlock(	"orange_block", Material.IRON);
		public static final Block YELLOW_BLOCK 	= new YellowBlock(	"yellow_block", Material.IRON);
		public static final Block BLUE_BLOCK 	= new BlueBlock(	"blue_block", 	Material.IRON);
		public static final Block GREEN_BLOCK 	= new GreenBlock(	"green_block", 	Material.IRON);
		public static final Block PURPLE_BLOCK 	= new PurpleBlock(	"purple_block", Material.IRON);
		public static final Block BROWN_BLOCK 	= new BrownBlock(	"brown_block", 	Material.IRON);
		public static final Block BLACK_BLOCK 	= new BlackBlock(	"black_block", 	Material.IRON);
		public static final Block WHITE_BLOCK 	= new WhiteBlock(	"white_block", 	Material.IRON);
		
		


}
