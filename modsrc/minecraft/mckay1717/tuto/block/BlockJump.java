package mckay1717.tuto.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockJump extends Block {

	public BlockJump(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) 
	{
		
		par5Entity.motionY += 10;
	
		
		
	}
}
