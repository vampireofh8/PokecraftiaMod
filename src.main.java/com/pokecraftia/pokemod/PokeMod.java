package com.pokecraftia.pokemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PokeMod.MODID, name = PokeMod.NAME, version = PokeMod.VERSION, acceptedMinecraftVersions = PokeMod.MC_VERSION)
public class PokeMod
{
    public static final String MODID = "pokemod";
    public static final String NAME = "Pokecraftia Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION =  "[1.12.2]";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
 
    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(PokeMod.NAME + " has been loaded WAH!");
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
}
}
