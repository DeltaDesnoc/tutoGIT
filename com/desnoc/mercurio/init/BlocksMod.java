package com.desnoc.mercurio.init;

import com.desnoc.mercurio.ModTuto;
import com.desnoc.mercurio.Reference;
import com.desnoc.mercurio.blocks.BlocksBasic;
import com.desnoc.mercurio.blocks.XBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlocksMod {
	
	//Special
	public static Block xblock;
	
	//Mercurio
	public static Block mercu_block;
	public static Block mercu_ore;
	
	//Adamantium
	public static Block adam_block;
	public static Block adam_ore;
	
	//Platinium
	public static Block plati_block;
	public static Block plati_ore;
		
	//Vanadium
	public static Block vana_block;
	public static Block vana_ore;
		
	//Thalkhanium
	public static Block talka_block;
	public static Block talka_ore;
	
	public static void init() {
		
		/**
		 * Cr�ation de blocks
		 */
		
		//Special
		xblock = new XBlock(Material.rock).setBlockName("xrayblock").setBlockTextureName(Reference.MOD_ID + ":xblock").setCreativeTab(ModTuto.mercurioblocks).setHardness(1.0F);
		
		//Mercurio
		mercu_block = new BlocksBasic(Material.iron,6).setBlockName("mercu_block").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":mercu_block").setHardness(5.0F);
		mercu_ore = new BlocksBasic(Material.rock, 6).setBlockName("mercu_ore").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":mercu_ore").setHardness(3.0F);
		
		//Adamantium
		adam_block = new BlocksBasic(Material.iron, 4).setBlockName("adam_block").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":adam_block").setHardness(5.0F);
		adam_ore = new BlocksBasic(Material.rock, 4).setBlockName("adam_ore").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":adam_ore").setHardness(3.0F);
		
		//Platinium
		plati_block = new BlocksBasic(Material.iron, 5).setBlockName("plati_block").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":plati_block").setHardness(5.0F);
		plati_ore = new BlocksBasic(Material.rock, 5).setBlockName("plati_ore").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":plati_ore").setHardness(3.0F);
		
		//Vanadium
		vana_block = new BlocksBasic(Material.iron, 7).setBlockName("vana_block").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":vana_block").setHardness(5.0F);
		vana_ore = new BlocksBasic(Material.rock, 7).setBlockName("vana_ore").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":vana_ore").setHardness(3.0F);
		
		//Thalkhanium
		talka_block = new BlocksBasic(Material.iron, 3).setBlockName("talka_block").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":talka_block").setHardness(5.0F);
		talka_ore = new BlocksBasic(Material.rock, 3).setBlockName("talka_ore").setCreativeTab(ModTuto.mercurioblocks).setBlockTextureName(Reference.MOD_ID + ":talka_ore").setHardness(3.0F);
		
	}
	
	public static void register() {
		
		/**
		 * Enregistrement des blocks
		 */
		
		//Special
		GameRegistry.registerBlock(xblock, xblock.getUnlocalizedName().substring(5));
		
		//Mercurio
		GameRegistry.registerBlock(mercu_block, mercu_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mercu_ore, mercu_ore.getUnlocalizedName().substring(5));
		
		//Adamantium
		GameRegistry.registerBlock(adam_block, adam_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(adam_ore, adam_ore.getUnlocalizedName().substring(5));
		
		//Platinium
		GameRegistry.registerBlock(plati_block, plati_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(plati_ore, plati_ore.getUnlocalizedName().substring(5));
		
		//Vanadium
		//GameRegistry.registerBlock(vana_block, vana_block.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(vana_ore, vana_ore.getUnlocalizedName().substring(5));
		
		//Thalkhanium
		GameRegistry.registerBlock(talka_block, talka_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(talka_ore, talka_ore.getUnlocalizedName().substring(5));
		

		
	}

}
