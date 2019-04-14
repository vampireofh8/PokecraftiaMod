package com.pokecraftia.pokemod.init;

import com.pokecraftia.pokemod.PokeMod;
import com.pokecraftia.pokemod.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=PokeMod.MODID)
public class ModItems {
	
	static Item tutorialItem;
	
	public static void init() {
		tutorialItem = new ItemBase("tutorial_item");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(tutorialItem);
	}
}