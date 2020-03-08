package com.pokecraftia.pokemod.init;

import java.util.ArrayList;
import java.util.List;

import com.pokecraftia.pokemod.base.ArmorBase;
import com.pokecraftia.pokemod.base.ItemBase;
import com.pokecraftia.pokemod.items.food.FoodBase;
import com.pokecraftia.pokemod.items.food.FoodEffectBase;
//import com.pokecraftia.pokemod.items.food.FoodEffectBase;
import com.pokecraftia.pokemod.items.tools.ToolAxe;
import com.pokecraftia.pokemod.items.tools.ToolHoe;
import com.pokecraftia.pokemod.items.tools.ToolPickaxe;
import com.pokecraftia.pokemod.items.tools.ToolSpade;
import com.pokecraftia.pokemod.items.tools.ToolSword;
import com.pokecraftia.pokemod.util.Reference;

import net.minecraft.init.MobEffects;
//import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
//import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//Materials
		//tools
		public static final ToolMaterial MATERIAL_RED = 	EnumHelper.addToolMaterial("material_red"	, 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_ORANGE = 	EnumHelper.addToolMaterial("material_orange", 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_YELLOW = 	EnumHelper.addToolMaterial("material_yellow", 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_BLUE = 	EnumHelper.addToolMaterial("material_blue"	, 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_GREEN = 	EnumHelper.addToolMaterial("material_green"	, 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_PURPLE = 	EnumHelper.addToolMaterial("material_purple", 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_BROWN = 	EnumHelper.addToolMaterial("material_brown"	, 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_BLACK = 	EnumHelper.addToolMaterial("material_black"	, 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_WHITE = 	EnumHelper.addToolMaterial("material_white"	, 3, 250, 8.0F, 3.0F, 10);
		//armor
		public static final ArmorMaterial ARMOR_MATERIAL_RED = EnumHelper.addArmorMaterial("armor_material_red", Reference.MOD_ID + ":red", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		public static final ArmorMaterial ARMOR_MATERIAL_ORANGE = EnumHelper.addArmorMaterial("armor_material_orange", Reference.MOD_ID + ":orange", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);		
		public static final ArmorMaterial ARMOR_MATERIAL_YELLOW = EnumHelper.addArmorMaterial("armor_material_yellow", Reference.MOD_ID + ":yellow", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);		
		public static final ArmorMaterial ARMOR_MATERIAL_BLUE = EnumHelper.addArmorMaterial("armor_material_blue", Reference.MOD_ID + ":blue", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		public static final ArmorMaterial ARMOR_MATERIAL_GREEN = EnumHelper.addArmorMaterial("armor_material_green", Reference.MOD_ID + ":green", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		public static final ArmorMaterial ARMOR_MATERIAL_PURPLE = EnumHelper.addArmorMaterial("armor_material_purple", Reference.MOD_ID + ":purple", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);		
		public static final ArmorMaterial ARMOR_MATERIAL_BROWN = EnumHelper.addArmorMaterial("armor_material_brown", Reference.MOD_ID + ":brown", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);		
		public static final ArmorMaterial ARMOR_MATERIAL_BLACK = EnumHelper.addArmorMaterial("armor_material_black", Reference.MOD_ID + ":black", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		public static final ArmorMaterial ARMOR_MATERIAL_WHITE = EnumHelper.addArmorMaterial("armor_material_white", Reference.MOD_ID + ":white", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		
	//Item list begins ---------------------------------------->
	public static final List<Item> ITEMS = new ArrayList<Item>();
		//Items  ordered -  RED-ORANGE-YELLOW-BLUE-GREEN-PURPLE-BROWN-BLACK-WHITE
			//Ingots 
			public static final Item RED_INGOT = 		new ItemBase("red_ingot");	
			public static final Item ORANGE_INGOT = 	new ItemBase("orange_ingot");
			public static final Item YELLOW_INGOT = 	new ItemBase("yellow_ingot");
			public static final Item BLUE_INGOT = 		new ItemBase("blue_ingot");
			public static final Item GREEN_INGOT = 		new ItemBase("green_ingot");	
			public static final Item PURPLE_INGOT = 	new ItemBase("purple_ingot");
			public static final Item BROWN_INGOT = 		new ItemBase("brown_ingot");
			public static final Item BLACK_INGOT = 		new ItemBase("black_ingot");
			public static final Item WHITE_INGOT = 		new ItemBase("white_ingot");	
			//Nuggets 
			public static final Item RED_NUGGET = 		new ItemBase("red_nugget");
			public static final Item ORANGE_NUGGET = 	new ItemBase("orange_nugget");
			public static final Item YELLOW_NUGGET = 	new ItemBase("yellow_nugget");
			public static final Item BLUE_NUGGET = 		new ItemBase("blue_nugget");
			public static final Item GREEN_NUGGET = 	new ItemBase("green_nugget");
			public static final Item PURPLE_NUGGET = 	new ItemBase("purple_nugget");
			public static final Item BROWN_NUGGET = 	new ItemBase("brown_nugget");
			public static final Item BLACK_NUGGET = 	new ItemBase("black_nugget");
			public static final Item WHITE_NUGGET = 	new ItemBase("white_nugget");	
			//SWORDS 
			public static final ItemSword 	RED_SWORD = 	new ToolSword	("red_sword", 		MATERIAL_RED);
			public static final ItemSword 	ORANGE_SWORD = 	new ToolSword	("orange_sword",	MATERIAL_ORANGE);
			public static final ItemSword 	YELLOW_SWORD = 	new ToolSword	("yellow_sword", 	MATERIAL_YELLOW);
			public static final ItemSword 	BLUE_SWORD = 	new ToolSword	("blue_sword", 		MATERIAL_BLUE);
			public static final ItemSword 	GREEN_SWORD = 	new ToolSword	("green_sword", 	MATERIAL_GREEN);
			public static final ItemSword 	PURPLE_SWORD = 	new ToolSword	("purple_sword", 	MATERIAL_PURPLE);
			public static final ItemSword 	BROWN_SWORD = 	new ToolSword	("brown_sword", 	MATERIAL_BROWN);
			public static final ItemSword 	BLACK_SWORD = 	new ToolSword	("black_sword", 	MATERIAL_BLACK);
			public static final ItemSword 	WHITE_SWORD = 	new ToolSword	("white_sword", 	MATERIAL_WHITE);
			//SHOVELS 
			public static final ItemSpade 	RED_SHOVEL = 	new ToolSpade	("red_shovel", 		MATERIAL_RED);
			public static final ItemSpade 	ORANGE_SHOVEL = new ToolSpade	("orange_shovel", 	MATERIAL_ORANGE);
			public static final ItemSpade 	YELLOW_SHOVEL = new ToolSpade	("yellow_shovel", 	MATERIAL_YELLOW);
			public static final ItemSpade 	BLUE_SHOVEL = 	new ToolSpade	("blue_shovel", 	MATERIAL_BLUE);
			public static final ItemSpade 	GREEN_SHOVEL = 	new ToolSpade	("green_shovel", 	MATERIAL_GREEN);
			public static final ItemSpade 	PURPLE_SHOVEL = new ToolSpade	("purple_shovel", 	MATERIAL_PURPLE);
			public static final ItemSpade 	BROWN_SHOVEL = 	new ToolSpade	("brown_shovel", 	MATERIAL_BROWN);
			public static final ItemSpade 	BLACK_SHOVEL = 	new ToolSpade	("black_shovel", 	MATERIAL_BLACK);
			public static final ItemSpade 	WHITE_SHOVEL = 	new ToolSpade	("white_shovel", 	MATERIAL_WHITE);			
			//PICKAXE 
			public static final ItemPickaxe RED_PICKAXE = 	new ToolPickaxe	("red_pickaxe", 	MATERIAL_RED);
			public static final ItemPickaxe ORANGE_PICKAXE =new ToolPickaxe	("orange_pickaxe", 	MATERIAL_ORANGE);
			public static final ItemPickaxe YELLOW_PICKAXE =new ToolPickaxe	("yellow_pickaxe", 	MATERIAL_YELLOW);
			public static final ItemPickaxe BLUE_PICKAXE = 	new ToolPickaxe	("blue_pickaxe",	MATERIAL_BLUE);
			public static final ItemPickaxe GREEN_PICKAXE = new ToolPickaxe	("green_pickaxe", 	MATERIAL_GREEN);
			public static final ItemPickaxe PURPLE_PICKAXE =new ToolPickaxe	("purple_pickaxe", 	MATERIAL_PURPLE);
			public static final ItemPickaxe BROWN_PICKAXE = new ToolPickaxe	("brown_pickaxe", 	MATERIAL_BROWN);
			public static final ItemPickaxe BLACK_PICKAXE = new ToolPickaxe	("black_pickaxe", 	MATERIAL_BLACK);
			public static final ItemPickaxe WHITE_PICKAXE = new ToolPickaxe	("white_pickaxe", 	MATERIAL_WHITE);
			//AXE
			public static final ItemAxe 	RED_AXE = 		new ToolAxe		("red_axe", 		MATERIAL_RED);
			public static final ItemAxe 	ORANGE_AXE = 	new ToolAxe		("orange_axe", 		MATERIAL_ORANGE);
			public static final ItemAxe 	YELLOW_AXE = 	new ToolAxe		("yellow_axe", 		MATERIAL_YELLOW);
			public static final ItemAxe 	BLUE_AXE = 		new ToolAxe		("blue_axe", 		MATERIAL_BLUE);
			public static final ItemAxe 	GREEN_AXE = 	new ToolAxe		("green_axe", 		MATERIAL_GREEN);
			public static final ItemAxe 	PURPLE_AXE = 	new ToolAxe		("purple_axe", 		MATERIAL_PURPLE);
			public static final ItemAxe 	BROWN_AXE = 	new ToolAxe		("brown_axe", 		MATERIAL_BROWN);
			public static final ItemAxe 	BLACK_AXE = 	new ToolAxe		("black_axe", 		MATERIAL_BLACK);
			public static final ItemAxe 	WHITE_AXE = 	new ToolAxe		("white_axe", 		MATERIAL_WHITE);
			//HOE 
			public static final ItemHoe 	RED_HOE = 		new ToolHoe		("red_hoe", 		MATERIAL_RED);
			public static final ItemHoe 	ORANGE_HOE = 	new ToolHoe		("orange_hoe", 		MATERIAL_ORANGE);
			public static final ItemHoe 	YELLOW_HOE = 	new ToolHoe		("yellow_hoe", 		MATERIAL_YELLOW);
			public static final ItemHoe 	BLUE_HOE = 		new ToolHoe		("blue_hoe", 		MATERIAL_BLUE);
			public static final ItemHoe 	GREEN_HOE = 	new ToolHoe		("green_hoe", 		MATERIAL_GREEN);
			public static final ItemHoe 	PURPLE_HOE = 	new ToolHoe		("purple_hoe", 		MATERIAL_PURPLE);
			public static final ItemHoe 	BROWN_HOE = 	new ToolHoe		("brown_hoe", 		MATERIAL_BROWN);
			public static final ItemHoe 	BLACK_HOE = 	new ToolHoe		("black_hoe", 		MATERIAL_BLACK);
			public static final ItemHoe 	WHITE_HOE = 	new ToolHoe		("white_hoe", 		MATERIAL_WHITE);
			//HELMET 
			public static final Item RED_HELMET = 		new ArmorBase	("red_helmet",		ARMOR_MATERIAL_RED, 	1, EntityEquipmentSlot.HEAD);
			public static final Item ORANGE_HELMET = 	new ArmorBase	("orange_helmet",	ARMOR_MATERIAL_ORANGE, 	1, EntityEquipmentSlot.HEAD);
			public static final Item YELLOW_HELMET = 	new ArmorBase	("yellow_helmet",	ARMOR_MATERIAL_YELLOW, 	1, EntityEquipmentSlot.HEAD);
			public static final Item BLUE_HELMET = 		new ArmorBase	("blue_helmet",		ARMOR_MATERIAL_BLUE, 	1, EntityEquipmentSlot.HEAD);
			public static final Item GREEN_HELMET = 	new ArmorBase	("green_helmet",	ARMOR_MATERIAL_GREEN, 	1, EntityEquipmentSlot.HEAD);
			public static final Item PURPLE_HELMET = 	new ArmorBase	("purple_helmet",	ARMOR_MATERIAL_PURPLE, 	1, EntityEquipmentSlot.HEAD);
			public static final Item BROWN_HELMET = 	new ArmorBase	("brown_helmet",	ARMOR_MATERIAL_BROWN, 	1, EntityEquipmentSlot.HEAD);
			public static final Item BLACK_HELMET = 	new ArmorBase	("black_helmet",	ARMOR_MATERIAL_BLACK, 	1, EntityEquipmentSlot.HEAD);
			public static final Item WHITE_HELMET = 	new ArmorBase	("white_helmet",	ARMOR_MATERIAL_WHITE, 	1, EntityEquipmentSlot.HEAD);
			//CHESTPLATE
			public static final Item RED_CHESTPLATE = 	new ArmorBase	("red_chestplate",		ARMOR_MATERIAL_RED, 	1, EntityEquipmentSlot.CHEST);
			public static final Item ORANGE_CHESTPLATE =new ArmorBase	("orange_chestplate",	ARMOR_MATERIAL_ORANGE, 	1, EntityEquipmentSlot.CHEST);
			public static final Item YELLOW_CHESTPLATE =new ArmorBase	("yellow_chestplate",	ARMOR_MATERIAL_YELLOW, 	1, EntityEquipmentSlot.CHEST);
			public static final Item BLUE_CHESTPLATE = 	new ArmorBase	("blue_chestplate",		ARMOR_MATERIAL_BLUE, 	1, EntityEquipmentSlot.CHEST);
			public static final Item GREEN_CHESTPLATE = new ArmorBase	("green_chestplate",	ARMOR_MATERIAL_GREEN, 	1, EntityEquipmentSlot.CHEST);
			public static final Item PURPLE_CHESTPLATE =new ArmorBase	("purple_chestplate",	ARMOR_MATERIAL_PURPLE, 	1, EntityEquipmentSlot.CHEST);
			public static final Item BROWN_CHESTPLATE =	new ArmorBase	("brown_chestplate",	ARMOR_MATERIAL_BROWN, 	1, EntityEquipmentSlot.CHEST);
			public static final Item BLACK_CHESTPLATE =	new ArmorBase	("black_chestplate",	ARMOR_MATERIAL_BLACK, 	1, EntityEquipmentSlot.CHEST);
			public static final Item WHITE_CHESTPLATE = new ArmorBase	("white_chestplate",	ARMOR_MATERIAL_WHITE, 	1, EntityEquipmentSlot.CHEST);
			//LEGGINGS
			public static final Item RED_LEGGINGS = 	new ArmorBase	("red_leggings",	ARMOR_MATERIAL_RED, 	2, EntityEquipmentSlot.LEGS);
			public static final Item ORANGE_LEGGINGS = 	new ArmorBase	("orange_leggings",	ARMOR_MATERIAL_ORANGE, 	2, EntityEquipmentSlot.LEGS);
			public static final Item YELLOW_LEGGINGS = 	new ArmorBase	("yellow_leggings",	ARMOR_MATERIAL_YELLOW, 	2, EntityEquipmentSlot.LEGS);
			public static final Item BLUE_LEGGINGS = 	new ArmorBase	("blue_leggings",	ARMOR_MATERIAL_BLUE, 	2, EntityEquipmentSlot.LEGS);
			public static final Item GREEN_LEGGINGS = 	new ArmorBase	("green_leggings",	ARMOR_MATERIAL_GREEN, 	2, EntityEquipmentSlot.LEGS);
			public static final Item PURPLE_LEGGINGS = 	new ArmorBase	("purple_leggings",	ARMOR_MATERIAL_PURPLE, 	2, EntityEquipmentSlot.LEGS);
			public static final Item BROWN_LEGGINGS = 	new ArmorBase	("brown_leggings",	ARMOR_MATERIAL_BROWN, 	2, EntityEquipmentSlot.LEGS);
			public static final Item BLACK_LEGGINGS = 	new ArmorBase	("black_leggings",	ARMOR_MATERIAL_BLACK, 	2, EntityEquipmentSlot.LEGS);
			public static final Item WHITE_LEGGINGS = 	new ArmorBase	("white_leggings",	ARMOR_MATERIAL_WHITE, 	2, EntityEquipmentSlot.LEGS);
			//BOOTS
			public static final Item RED_BOOTS = 		new ArmorBase	("red_boots",		ARMOR_MATERIAL_RED, 	1, EntityEquipmentSlot.FEET);
			public static final Item ORANGE_BOOTS = 	new ArmorBase	("orange_boots",	ARMOR_MATERIAL_ORANGE, 	1, EntityEquipmentSlot.FEET);		
			public static final Item YELLOW_BOOTS = 	new ArmorBase	("yellow_boots",	ARMOR_MATERIAL_YELLOW, 	1, EntityEquipmentSlot.FEET);
			public static final Item BLUE_BOOTS = 		new ArmorBase	("blue_boots",		ARMOR_MATERIAL_BLUE, 	1, EntityEquipmentSlot.FEET);
			public static final Item GREEN_BOOTS = 		new ArmorBase	("green_boots",		ARMOR_MATERIAL_GREEN, 	1, EntityEquipmentSlot.FEET);
			public static final Item PURPLE_BOOTS = 	new ArmorBase	("purple_boots",	ARMOR_MATERIAL_PURPLE, 	1, EntityEquipmentSlot.FEET);		
			public static final Item BROWN_BOOTS = 		new ArmorBase	("brown_boots",		ARMOR_MATERIAL_BROWN, 	1, EntityEquipmentSlot.FEET);
			public static final Item BLACK_BOOTS = 		new ArmorBase	("black_boots",		ARMOR_MATERIAL_BLACK, 	1, EntityEquipmentSlot.FEET);
			public static final Item WHITE_BOOTS = 		new ArmorBase	("white_boots",		ARMOR_MATERIAL_WHITE, 	1, EntityEquipmentSlot.FEET);			
			//Food
			public static final Item GOOD_APPLE = 		new FoodBase	("good_apple", 	8, 4.5f, false);
			public static final Item EVIL_APPLE = 		new FoodEffectBase	("evil_apple", 	4, 2.4f, false, new PotionEffect(MobEffects.POISON, (60*20), 0, false, true));
}
