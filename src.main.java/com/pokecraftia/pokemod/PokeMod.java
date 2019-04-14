package com.pokecraftia.pokemod;

import com.pokecraftia.pokemod.init.ModRecipes;
import com.pokecraftia.pokemod.proxy.CommonProxy;
import com.pokecraftia.pokemod.util.Reference;
import com.pokecraftia.pokemod.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class PokeMod {
  
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
    
    @Instance
    public static PokeMod instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    	//proxy.preInit(event);
    	//ModItems.init();
        //logger = event.getModLog();
        //System.out.println(PokeMod.MODID + ":preInit");
    }
 
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
    	ModRecipes.init();
    	//proxy.init(event);
        //logger.info(PokeMod.NAME + " has been loaded WAH!");
        //System.out.println(PokeMod.MODID + ":init");
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    	//proxy.postInit(event);
    	//System.out.println(PokeMod.MODID + ":postInit");
    }
    
    
}
