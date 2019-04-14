package com.pokecraftia.pokemod.init;

import java.util.ArrayList;
import java.util.List;

import com.pokecraftia.pokemod.base.ItemBase;
import com.pokecraftia.pokemod.items.armor.ArmorBase;
import com.pokecraftia.pokemod.items.food.FoodEffectBase;
import com.pokecraftia.pokemod.items.tools.ToolAxe;
import com.pokecraftia.pokemod.items.tools.ToolHoe;
import com.pokecraftia.pokemod.items.tools.ToolPickaxe;
import com.pokecraftia.pokemod.items.tools.ToolSpade;
import com.pokecraftia.pokemod.items.tools.ToolSword;
import com.pokecraftia.pokemod.util.Reference;

import net.minecraft.init.MobEffects;
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
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//Materials
		public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_RED = EnumHelper.addToolMaterial("material_red", 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_BLUE = EnumHelper.addToolMaterial("material_blue", 3, 250, 8.0F, 3.0F, 10);
		public static final ToolMaterial MATERIAL_GREEN = EnumHelper.addToolMaterial("material_green", 3, 250, 8.0F, 3.0F, 10);
		public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		public static final ArmorMaterial ARMOR_MATERIAL_RED = EnumHelper.addArmorMaterial("armor_material_red", Reference.MOD_ID + ":red", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		public static final ArmorMaterial ARMOR_MATERIAL_BLUE = EnumHelper.addArmorMaterial("armor_material_blue", Reference.MOD_ID + ":blue", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		public static final ArmorMaterial ARMOR_MATERIAL_GREEN = EnumHelper.addArmorMaterial("armor_material_green", Reference.MOD_ID + ":green", 14, 
				new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Item list begins ---------------------------------------->
	public static final List<Item> ITEMS = new ArrayList<Item>();
		//Items
		public static final Item RUBY = new ItemBase("ruby");
		public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
		public static final Item RED_INGOT = new ItemBase("red_ingot");
		public static final Item BLUE_INGOT = new ItemBase("blue_ingot");
		public static final Item GREEN_INGOT = new ItemBase("green_ingot");
		public static final Item RED_NUGGET = new ItemBase("red_nugget");
		public static final Item BLUE_NUGGET = new ItemBase("blue_nugget");
		public static final Item GREEN_NUGGET = new ItemBase("green_nugget");
	  //Tools
		//Ruby
		public static final ItemSword 	RUBY_SWORD = 	new ToolSword	("ruby_sword", 		MATERIAL_RUBY);
		public static final ItemSpade 	RUBY_SHOVEL = 	new ToolSpade	("ruby_shovel", 	MATERIAL_RUBY);
		public static final ItemPickaxe RUBY_PICKAXE = 	new ToolPickaxe	("ruby_pickaxe", 	MATERIAL_RUBY);
		public static final ItemAxe 	RUBY_AXE = 		new ToolAxe		("ruby_axe", 		MATERIAL_RUBY);
		public static final ItemHoe 	RUBY_HOE = 		new ToolHoe		("ruby_hoe", 		MATERIAL_RUBY);
		//Red
		public static final ItemSword 	RED_SWORD = 	new ToolSword	("red_sword", 		MATERIAL_RED);
		public static final ItemSpade 	RED_SHOVEL = 	new ToolSpade	("red_shovel", 		MATERIAL_RED);
		public static final ItemPickaxe RED_PICKAXE = 	new ToolPickaxe	("red_pickaxe", 	MATERIAL_RED);
		public static final ItemAxe 	RED_AXE = 		new ToolAxe		("red_axe", 		MATERIAL_RED);
		public static final ItemHoe 	RED_HOE = 		new ToolHoe		("red_hoe", 		MATERIAL_RED);
		//Blue
		public static final ItemSword 	BLUE_SWORD = 	new ToolSword	("blue_sword", 		MATERIAL_BLUE);
		public static final ItemSpade 	BLUE_SHOVEL = 	new ToolSpade	("blue_shovel", 	MATERIAL_BLUE);
		public static final ItemPickaxe BLUE_PICKAXE = 	new ToolPickaxe	("blue_pickaxe",	MATERIAL_BLUE);
		public static final ItemAxe 	BLUE_AXE = 		new ToolAxe		("blue_axe", 		MATERIAL_BLUE);
		public static final ItemHoe 	BLUE_HOE = 		new ToolHoe		("blue_hoe", 		MATERIAL_BLUE);
		//Green
		public static final ItemSword 	GREEN_SWORD = 	new ToolSword	("green_sword", 	MATERIAL_GREEN);
		public static final ItemSpade 	GREEN_SHOVEL = 	new ToolSpade	("green_shovel", 	MATERIAL_GREEN);
		public static final ItemPickaxe GREEN_PICKAXE = new ToolPickaxe	("green_pickaxe", 	MATERIAL_GREEN);
		public static final ItemAxe 	GREEN_AXE = 	new ToolAxe		("green_axe", 		MATERIAL_GREEN);
		public static final ItemHoe 	GREEN_HOE = 	new ToolHoe		("green_hoe", 		MATERIAL_GREEN);
	  //Armor
		//Ruby
		public static final Item RUBY_HELMET = 		new ArmorBase("ruby_helmet", 		ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
		public static final Item RUBY_CHESTPLATE = 	new ArmorBase("ruby_chestplate", 	ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
		public static final Item RUBY_LEGGINGS = 	new ArmorBase("ruby_leggings", 		ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
		public static final Item RUBY_BOOTS = 		new ArmorBase("ruby_boots", 		ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
		//Red
		public static final Item RED_HELMET = 		new ArmorBase("red_helmet", 		ARMOR_MATERIAL_RED, 1, EntityEquipmentSlot.HEAD);
		public static final Item RED_CHESTPLATE = 	new ArmorBase("red_chestplate", 	ARMOR_MATERIAL_RED, 1, EntityEquipmentSlot.CHEST);
		public static final Item RED_LEGGINGS = 	new ArmorBase("red_leggings", 		ARMOR_MATERIAL_RED, 2, EntityEquipmentSlot.LEGS);
		public static final Item RED_BOOTS = 		new ArmorBase("red_boots", 			ARMOR_MATERIAL_RED, 1, EntityEquipmentSlot.FEET);
		//Blue
		public static final Item BLUE_HELMET = 		new ArmorBase("blue_helmet", 		ARMOR_MATERIAL_BLUE, 1, EntityEquipmentSlot.HEAD);
		public static final Item BLUE_CHESTPLATE = 	new ArmorBase("blue_chestplate", 	ARMOR_MATERIAL_BLUE, 1, EntityEquipmentSlot.CHEST);
		public static final Item BLUE_LEGGINGS = 	new ArmorBase("blue_leggings", 		ARMOR_MATERIAL_BLUE, 2, EntityEquipmentSlot.LEGS);
		public static final Item BLUE_BOOTS = 		new ArmorBase("blue_boots", 		ARMOR_MATERIAL_BLUE, 1, EntityEquipmentSlot.FEET);
		//Green
		public static final Item GREEN_HELMET = 	new ArmorBase("green_helmet", 		ARMOR_MATERIAL_GREEN, 1, EntityEquipmentSlot.HEAD);
		public static final Item GREEN_CHESTPLATE = new ArmorBase("green_chestplate", 	ARMOR_MATERIAL_GREEN, 1, EntityEquipmentSlot.CHEST);
		public static final Item GREEN_LEGGINGS = 	new ArmorBase("green_leggings", 	ARMOR_MATERIAL_GREEN, 2, EntityEquipmentSlot.LEGS);
		public static final Item GREEN_BOOTS = 		new ArmorBase("green_boots", 		ARMOR_MATERIAL_GREEN, 1, EntityEquipmentSlot.FEET);
	  //Food
		//public static final Item EVIL_APPLE = new FoodBase("evil_apple", 4, 2.4f, false);
		public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 4, 2.4f, false, new PotionEffect(MobEffects.POISON, (60*20), 1, false, true));
}
