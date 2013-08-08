package mckay1717.tuto.core;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterTuto {
	
	public static void registerBlock(Block block , String name)
	{
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
	
	public static void registerItem(Item item , String name)
	{
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}



}
