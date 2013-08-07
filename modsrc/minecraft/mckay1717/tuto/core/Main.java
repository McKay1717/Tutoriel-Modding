package mckay1717.tuto.core;

import mckay1717.tuto.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="tuto", name="Tutoriel Modding 1.6", version="Episode 1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Main {

	 // The instance of your mod that Forge uses.
    @Instance("tuto")
    public static Main instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="mckay1717.tuto.proxy.client.ClientProxy", serverSide="mckay1717.tuto.proxy.CommonProxy")
   public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    	System.out.println("Pre Init");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
            proxy.proxy();
    	System.out.println("Init");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    	System.out.println("Post Init");
    }
}
