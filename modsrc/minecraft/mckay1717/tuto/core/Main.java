package mckay1717.tuto.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import mckay1717.tuto.proxy.CommonProxy;
import mckay1717.tuto.block.BlockJump;
import mckay1717.tuto.core.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="tuto", name="Tutoriel Modding 1.6", version="Episode 4")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Main {

	// The instance of your mod that Forge uses.
	@Instance("tuto")
	public static Main instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="mckay1717.tuto.proxy.client.ClientProxy", serverSide="mckay1717.tuto.proxy.CommonProxy")
	public static CommonProxy proxy;
	private static int id = 1266;
	
	public static Block block = (new BlockJump(id+1,Material.rock).setUnlocalizedName("tuto:l16").func_111022_d("tuto:l16").setLightValue(1f).setResistance(5f).setHardness(0).setStepSound(Block.soundAnvilFootstep).setCreativeTab(CreativeTabs.tabBlock));
	public static Item item = (new Item(4000).setUnlocalizedName("tuto:item").func_111206_d("tuto:item"));



	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
		System.out.println("Pre Init");
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.proxy();
		System.out.println("Init");
		mckay1717.tuto.core.RegisterTuto.registerBlock(block, "Lanterne en Stone");
		mckay1717.tuto.core.RegisterTuto.registerItem(item, "Item Test");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
		System.out.println("Post Init");
	}
}
