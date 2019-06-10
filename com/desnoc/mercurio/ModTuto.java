package com.desnoc.mercurio;

import com.desnoc.mercurio.init.BlocksMod;
import com.desnoc.mercurio.init.ItemMod;
import com.desnoc.mercurio.items.uf.CustomGUI;
import com.desnoc.mercurio.proxy.CommonProxy;
import com.desnoc.mercurio.world.WorldRegister;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModTuto {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs mercurio = new CreativeTabs("mercurio") {
		
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ItemMod.mercu_helmet;
		}
		
	};
	
	public static CreativeTabs mercurioblocks = new CreativeTabs("mercurioblocks") {
		
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ItemMod.block_tabs;
		}
		
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		BlocksMod.init();
		BlocksMod.register();
		ItemMod.init();
		ItemMod.register();
		WorldRegister.mainRegistry();
		
	}
	
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.registerRenders();
		MinecraftForge.EVENT_BUS.register(new CustomGUI());
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
