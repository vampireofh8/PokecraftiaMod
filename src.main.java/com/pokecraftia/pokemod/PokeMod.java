package com.pokecraftia.pokemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.pokecraftia.pokemod.init.ModItems;

@Mod(modid = PokeMod.MODID, name = PokeMod.NAME, version = PokeMod.VERSION, acceptedMinecraftVersions = PokeMod.MC_VERSION)
public class PokeMod

{
    public static final String MODID = "pokemod";
    public static final String NAME = "Pokecraftia Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION =  "[1.12.2]";

    private static Logger logger;

    @Instance
    public static PokeMod instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
    	ModItems.init();
        logger = event.getModLog();
        //System.out.println(PokeMod.MODID + ":preInit");
    }
 
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
        logger.info(PokeMod.NAME + " has been loaded WAH!");
        //System.out.println(PokeMod.MODID + ":init");
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    	//System.out.println(PokeMod.MODID + ":postInit");
    }
    
}
