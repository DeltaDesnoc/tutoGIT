package com.desnoc.mercurio.init;

import com.desnoc.mercurio.ModTuto;
import com.desnoc.mercurio.Reference;
import com.desnoc.mercurio.items.ItemArmorScuba;
import com.desnoc.mercurio.items.ItemArmorTutoAdam;
import com.desnoc.mercurio.items.ItemArmorTutoMercu;
import com.desnoc.mercurio.items.ItemArmorTutoPlati;
import com.desnoc.mercurio.items.ItemArmorTutoTalka;
import com.desnoc.mercurio.items.ItemArmorTutoVana;
import com.desnoc.mercurio.items.ItemAxeTuto;
import com.desnoc.mercurio.items.ItemFoodMod;
import com.desnoc.mercurio.items.ItemPickaxeTuto;
import com.desnoc.mercurio.items.ItemSwordTuto;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod {
	
	/**
	 * MATERIALS OUTILS
	 */
	public static ToolMaterial mercu = EnumHelper.addToolMaterial("mercurio", 7, 3000, 15.0F, 20.0F, 5);
	public static ToolMaterial adamantium = EnumHelper.addToolMaterial("adamantium", 5, 2500, 11.0F, 16.0F, 9);
	public static ToolMaterial platinerium = EnumHelper.addToolMaterial("platinerium", 6, 2750, 13.0F, 18.0F, 7);
	public static ToolMaterial vanadium = EnumHelper.addToolMaterial("vanadium", 8, 3500, 18.0F, 23.0F, 3);
	public static ToolMaterial thalkhanium = EnumHelper.addToolMaterial("thalkhanium", 4, 2250, 10.0F, 15.0F, 12);
	
	//HAMMER
	public static Item.ToolMaterial VanaHAR = EnumHelper.addToolMaterial("Vanadium Hammer", 4, 2951, 18.5F, 7.5F, 2);
	public static Item.ToolMaterial MercuHAR = EnumHelper.addToolMaterial("Mercurio Hammer", 4, 2556, 16.0F, 6.0F, 4);
	public static Item.ToolMaterial AdamHAR = EnumHelper.addToolMaterial("Adamantium Hammer", 4, 1985, 11.25F, 3.25F, 8);
	public static Item.ToolMaterial DiamondHAR = EnumHelper.addToolMaterial("Diamond Hammer", 3, 1761, 8.0F, 3.0F, 10);
	public static Item.ToolMaterial TalkaHAR = EnumHelper.addToolMaterial("Thalkhanium Hammer", 3, 1252, 6.5F, 2.5F, 15);
	public static Item.ToolMaterial IronHAR = EnumHelper.addToolMaterial("Iron Hammer", 2, 265, 3.5F, 2.5F, 12);
	public static Item.ToolMaterial GoldHAR = EnumHelper.addToolMaterial("Gold Hammer", 1, 150, 2.0F, 2.0F, 40);
	public static Item.ToolMaterial StoneHAR = EnumHelper.addToolMaterial("Stone Hammer", 1, 100, 1.5F, 1.5F, 20);
	public static Item.ToolMaterial WoodHAR = EnumHelper.addToolMaterial("Wood Hammer", 1, 75, 1.0F, 1.0F, 30);
	
	/**
	 * MATERIALS ARMURES
	 */
	public static ArmorMaterial mercuarmor = EnumHelper.addArmorMaterial("mercuarmor", 41, new int[] {10, 15, 13, 10}, 5);
	public static ArmorMaterial adamarmor = EnumHelper.addArmorMaterial("adamarmor", 36, new int[] {6, 11, 9, 6}, 9);
	public static ArmorMaterial platiarmor = EnumHelper.addArmorMaterial("platiarmor", 38, new int[] {8, 13, 11, 8}, 7);
	public static ArmorMaterial vanaarmor = EnumHelper.addArmorMaterial("vanaarmor", 39, new int[] {12, 17, 15, 12}, 3);
	public static ArmorMaterial talkaarmor = EnumHelper.addArmorMaterial("talkaarmor", 32, new int[] {4, 8, 6, 4}, 12);
	
	/**
	 * Items
	 */
	
	//Spécial
	public static Item chest_finder;
	public static Item entity_detector;
	public static Item screen_detector;
	public static Item block_tabs;
	public static Item wither_head;
	
	//Mercurio
	public static Item mercu_stick;
	public static Item mercu_ingot;
	public static Item mercu_core;
	
	//Adamantium
	public static Item adam_ingot;
	
	//Platinerium
	public static Item plati_ingot;
	
	//Vanadium
	public static Item vana_ingot;
	
	//Thalkhanium
	public static Item talka_ingot;
	
	/**
	 *	Outils
	 */
	
	//HAMMER
	public static Item Vana_Hammer;
	public static Item Mercu_Hammer;
	public static Item Adam_Hammer;
	public static Item Talka_Hammer;
	public static Item Diamond_Hammer;
	public static Item Iron_Hammer;
	public static Item Gold_Hammer;
	public static Item Stone_Hammer;
	public static Item Wood_Hammer;
	
	//Mercurio
	public static Item mercu_sword;
	public static Item mercu_pickaxe;
	public static Item mercu_axe;
	public static Item mercu_hammer;
	
	//Adamantium
	public static Item adam_sword;
	public static Item adam_pickaxe;
	public static Item adam_axe;
	
	//Platinerium
	public static Item plati_sword;
	public static Item plati_pickaxe;
	public static Item plati_axe;
	
	//Vanadium
	public static Item vana_sword;
	public static Item vana_pickaxe;
	public static Item vana_axe;
	
	//Thalkhanium
	public static Item talka_sword;
	public static Item talka_pickaxe;
	public static Item talka_axe;
	
	/**
	 * Armures
	 */
	
	//Mercurio
	public static Item mercu_helmet;
	public static Item mercu_chestplate;
	public static Item mercu_leggings;
	public static Item mercu_boots;
	
	//Adamantium
	public static Item adam_helmet;
	public static Item adam_chestplate;
	public static Item adam_leggings;
	public static Item adam_boots;
	
	//Platinerium
	public static Item plati_helmet;
	public static Item plati_chestplate;
	public static Item plati_leggings;
	public static Item plati_boots;
	
	//Vanadium
	public static Item vana_helmet;
	public static Item vana_chestplate;
	public static Item vana_leggings;
	public static Item vana_boots;
	
	//Thalkhanium
	public static Item talka_helmet;
	public static Item talka_chestplate;
	public static Item talka_leggings;
	public static Item talka_boots;
	
	//ScubaArmor
	public static Item scuba_helmet;
	public static Item oxygen_bottle;
	public static Item scuba_leggings;
	public static Item scuba_boots;

	
	/**
	 * Nourriture
	 */
	public static Item mercu_apple;
	
	
	public static void init() {
		/**
		 * Items
		 */
		
		//Spécial
		chest_finder  = new Item().setUnlocalizedName("unclaim_finder").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":unclaim_finder");
		entity_detector = new Item().setUnlocalizedName("entity_detector").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":entity_detector");
		screen_detector = new Item().setUnlocalizedName("screen_detector").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":screen_detector");
		block_tabs = new Item().setTextureName(Reference.MOD_ID + ":mercu_block");
		wither_head= new Item().setTextureName(Reference.MOD_ID + ":wither_head");
		
		//Mercurio
		mercu_stick = new Item().setUnlocalizedName("mercu_stick").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_stick");
		mercu_ingot = new Item().setUnlocalizedName("mercu_ingot").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_ingot");
		mercu_core = new Item().setUnlocalizedName("mercu_core").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_core");
		
		//Adamantium
		adam_ingot = new Item().setUnlocalizedName("adam_ingot").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_ingot");
		
		//Platinerium
		plati_ingot = new Item().setUnlocalizedName("plati_ingot").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_ingot");
		
		//Vanadium
		vana_ingot = new Item().setUnlocalizedName("vana_ingot").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_ingot");
		
		//Thalkhanium
		talka_ingot = new Item().setUnlocalizedName("talka_ingot").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_ingot");
		
		/**
		 * Outils
		 */
		//Mercurio
		mercu_sword = new ItemSwordTuto(ItemMod.mercu).setUnlocalizedName("mercu_sword").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_sword");
		mercu_pickaxe = new ItemPickaxeTuto(ItemMod.mercu).setUnlocalizedName("mercu_pickaxe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_pickaxe");
		mercu_axe = new ItemAxeTuto(ItemMod.mercu).setUnlocalizedName("mercu_axe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_axe");
		
		//Adamantium
		adam_sword = new ItemSwordTuto(ItemMod.adamantium).setUnlocalizedName("adam_sword").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_sword");
		adam_pickaxe = new ItemPickaxeTuto(ItemMod.adamantium).setUnlocalizedName("adam_pickaxe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_pickaxe");
		adam_axe = new ItemAxeTuto(ItemMod.adamantium).setUnlocalizedName("adam_axe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_axe");

		//Platinerium
		plati_sword = new ItemSwordTuto(ItemMod.platinerium).setUnlocalizedName("plati_sword").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_sword");
		plati_pickaxe = new ItemPickaxeTuto(ItemMod.platinerium).setUnlocalizedName("plati_pickaxe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_pickaxe");
		plati_axe = new ItemAxeTuto(ItemMod.platinerium).setUnlocalizedName("plati_axe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_axe");

		//Vanadium
		vana_sword = new ItemSwordTuto(ItemMod.vanadium).setUnlocalizedName("vana_sword").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_sword");
		vana_pickaxe = new ItemPickaxeTuto(ItemMod.vanadium).setUnlocalizedName("vana_pickaxe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_pickaxe");
		vana_axe = new ItemAxeTuto(ItemMod.vanadium).setUnlocalizedName("vana_axe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_axe");
		
		//Thalkhanium
		talka_sword = new ItemSwordTuto(ItemMod.thalkhanium).setUnlocalizedName("talka_sword").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_sword");
		talka_pickaxe = new ItemPickaxeTuto(ItemMod.thalkhanium).setUnlocalizedName("talka_pickaxe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_pickaxe");
		talka_axe = new ItemAxeTuto(ItemMod.thalkhanium).setUnlocalizedName("talka_axe").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_axe");

		
		/**
		 * Armures
		 */
		
		//Mercurio
		mercu_helmet = new ItemArmorTutoMercu(mercuarmor, 0).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_helmet").setUnlocalizedName("mercu_helmet");
		mercu_chestplate = new ItemArmorTutoMercu(mercuarmor, 1).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_chestplate").setUnlocalizedName("mercu_chestplate");
		mercu_leggings = new ItemArmorTutoMercu(mercuarmor, 2).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_leggings").setUnlocalizedName("mercu_leggings");
		mercu_boots = new ItemArmorTutoMercu(mercuarmor, 3).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_boots").setUnlocalizedName("mercu_boots");
		
		//Adamantium
		adam_helmet = new ItemArmorTutoAdam(adamarmor, 0).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_helmet").setUnlocalizedName("adam_helmet");
		adam_chestplate = new ItemArmorTutoAdam(adamarmor, 1).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_chestplate").setUnlocalizedName("adam_chestplate");
		adam_leggings = new ItemArmorTutoAdam(adamarmor, 2).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_leggings").setUnlocalizedName("adam_leggings");
		adam_boots = new ItemArmorTutoAdam(adamarmor, 3).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":adam_boots").setUnlocalizedName("adam_boots");
		
		//Platinerium
		plati_helmet = new ItemArmorTutoPlati(platiarmor, 0).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_helmet").setUnlocalizedName("plati_helmet");
		plati_chestplate = new ItemArmorTutoPlati(platiarmor, 1).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_chestplate").setUnlocalizedName("plati_chestplate");
		plati_leggings = new ItemArmorTutoPlati(platiarmor, 2).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_leggings").setUnlocalizedName("plati_leggings");
		plati_boots = new ItemArmorTutoPlati(platiarmor, 3).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":plati_boots").setUnlocalizedName("plati_boots");
		
		//Vanadium
		vana_helmet = new ItemArmorTutoVana(vanaarmor, 0).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_helmet").setUnlocalizedName("vana_helmet");
		vana_chestplate = new ItemArmorTutoVana(vanaarmor, 1).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_chestplate").setUnlocalizedName("vana_chestplate");
		vana_leggings = new ItemArmorTutoVana(vanaarmor, 2).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_leggings").setUnlocalizedName("vana_leggings");
		vana_boots = new ItemArmorTutoVana(vanaarmor, 3).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":vana_boots").setUnlocalizedName("vana_boots");
		
		//Thalkhanium
		talka_helmet = new ItemArmorTutoTalka(talkaarmor, 0).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_helmet").setUnlocalizedName("talka_helmet");
		talka_chestplate = new ItemArmorTutoTalka(talkaarmor, 1).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_chestplate").setUnlocalizedName("talka_chestplate");
		talka_leggings = new ItemArmorTutoTalka(talkaarmor, 2).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_leggings").setUnlocalizedName("talka_leggings");
		talka_boots = new ItemArmorTutoTalka(talkaarmor, 3).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":talka_boots").setUnlocalizedName("talka_boots");
		
		//ScubaArmor
		scuba_helmet = new ItemArmorScuba(talkaarmor, 0).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":scuba_helmet").setUnlocalizedName("scuba_helmet");
		oxygen_bottle = new ItemArmorScuba(talkaarmor, 1).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":oxygen_bottle").setUnlocalizedName("oxygen_bottle");
		scuba_leggings = new ItemArmorScuba(talkaarmor, 2).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":scuba_leggings").setUnlocalizedName("scuba_leggings");
		scuba_boots = new ItemArmorScuba(talkaarmor, 3).setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":scuba_boots").setUnlocalizedName("scuba_boots");
		
		/**
		 * Nourriture
		 */
		mercu_apple = new ItemFoodMod(3, 3.0F, false).setAlwaysEdible().setUnlocalizedName("mercu_apple").setCreativeTab(ModTuto.mercurio).setTextureName(Reference.MOD_ID + ":mercu_apple");
	
		
	}
	
	
	public static void register() {
		
		/**
		 * Enregistrement Items
		 */
		
		//Spécial
		GameRegistry.registerItem(chest_finder, "chest_finder");
		GameRegistry.registerItem(entity_detector, "entity_detector");
		GameRegistry.registerItem(screen_detector, "screen_detector");
		GameRegistry.registerItem(block_tabs, "block_tabs");
		GameRegistry.registerItem(wither_head, "wither_head");
		
		//Mercurio
		GameRegistry.registerItem(mercu_stick, "mercu_stick");
		GameRegistry.registerItem(mercu_ingot, "mercu_ingot");
		GameRegistry.registerItem(mercu_sword, "mercu_sword");
		GameRegistry.registerItem(mercu_core, "mercu_core");
		GameRegistry.registerItem(mercu_pickaxe, "mercu_pickaxe");
		GameRegistry.registerItem(mercu_axe, "mercu_axe");
		GameRegistry.registerItem(mercu_helmet, "mercu_helmet");
		GameRegistry.registerItem(mercu_chestplate, "mercu_chestplate");
		GameRegistry.registerItem(mercu_leggings, "mercu_leggings");
		GameRegistry.registerItem(mercu_boots, "mercu_boots");
		
		//Adamantium
		GameRegistry.registerItem(adam_ingot, "adam_ingot");
		GameRegistry.registerItem(adam_sword, "adam_sword");
		GameRegistry.registerItem(adam_pickaxe, "adam_pickaxe");
		GameRegistry.registerItem(adam_axe, "adam_axe");
		GameRegistry.registerItem(adam_helmet, "adam_helmet");
		GameRegistry.registerItem(adam_chestplate, "adam_chestplate");
		GameRegistry.registerItem(adam_leggings, "adam_leggings");
		GameRegistry.registerItem(adam_boots, "adam_boots");
		
		//Platinerium
		GameRegistry.registerItem(plati_ingot, "plati_ingot");
		GameRegistry.registerItem(plati_sword, "plati_sword");
		GameRegistry.registerItem(plati_pickaxe, "plati_pickaxe");
		GameRegistry.registerItem(plati_axe, "plati_axe");
		GameRegistry.registerItem(plati_helmet, "plati_helmet");
		GameRegistry.registerItem(plati_chestplate, "plati_chestplate");
		GameRegistry.registerItem(plati_leggings, "plati_leggings");
		GameRegistry.registerItem(plati_boots, "plati_boots");
		
		//Vanadium
		//GameRegistry.registerItem(vana_ingot, "vana_ingot");
		//GameRegistry.registerItem(vana_sword, "vana_sword");
		//GameRegistry.registerItem(vana_pickaxe, "vana_pickaxe");
		//GameRegistry.registerItem(vana_axe, "vana_axe");
		//GameRegistry.registerItem(vana_helmet, "vana_helmet");
		//GameRegistry.registerItem(vana_chestplate, "vana_chestplate");
		//GameRegistry.registerItem(vana_leggings, "vana_leggings");
		//GameRegistry.registerItem(vana_boots, "vana_boots");
		
		//Thalkhanium
		GameRegistry.registerItem(talka_ingot, "talka_ingot");
		GameRegistry.registerItem(talka_sword, "talka_sword");
		GameRegistry.registerItem(talka_pickaxe, "talka_pickaxe");
		GameRegistry.registerItem(talka_axe, "talka_axe");
		GameRegistry.registerItem(talka_helmet, "talka_helmet");
		GameRegistry.registerItem(talka_chestplate, "talka_chestplate");
		GameRegistry.registerItem(talka_leggings, "talka_leggings");
		GameRegistry.registerItem(talka_boots, "talka_boots");
		
		//ScubaArmor
		GameRegistry.registerItem(scuba_helmet, "scuba_helmet");
		GameRegistry.registerItem(oxygen_bottle, "oxygen_bottle");
		GameRegistry.registerItem(scuba_leggings, "scuba_leggings");
		GameRegistry.registerItem(scuba_boots, "scuba_boots");
		
		//Nourriture
		GameRegistry.registerItem(mercu_apple, "mercu_apple");
		
		/**
		 *	Enregistrement Crafts
		 */
		//Mercurio
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_stick, 1), new Object[] {"M  ", " M ", 'M', ItemMod.mercu_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_sword, 1), new Object[] {"M", "C", "S", 'M', ItemMod.mercu_ingot, 'C', ItemMod.mercu_core, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_core, 1), new Object[] {" M ", "M M", " M ", 'M', ItemMod.mercu_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_pickaxe, 1), new Object[] {"MCM", " S ", " S ", 'M', ItemMod.mercu_ingot, 'C', ItemMod.mercu_core, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_axe, 1), new Object[] {"MM ", "MS ", " S ", 'M', ItemMod.mercu_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_axe, 1), new Object[] {" MM", " SM", " S ", 'M', ItemMod.mercu_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_helmet, 1), new Object[] {"MMM", "M M", 'M', ItemMod.mercu_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_chestplate, 1), new Object[] {"M M", "MCM", "MMM", 'M', ItemMod.mercu_ingot, 'C', ItemMod.mercu_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_leggings, 1), new Object[] {"MCM", "M M", "M M", 'M', ItemMod.mercu_ingot, 'C', ItemMod.mercu_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_boots, 1), new Object[] {"M M", "M M", 'M', ItemMod.mercu_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_ingot, 9), new Object[] { "M", 'M', BlocksMod.mercu_block});
		GameRegistry.addRecipe(new ItemStack(ItemMod.mercu_apple, 1), new Object[] {"MMM", "MAM", "MMM", 'M', BlocksMod.mercu_block, 'A', Items.apple});
		
		//Adamantium
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_sword, 1), new Object[] {"A", "A", "S", 'A', ItemMod.adam_ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_pickaxe, 1), new Object[] {"AAA", " S ", " S ", 'A', ItemMod.adam_ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_axe, 1), new Object[] {"AA ", "AS ", " S ", 'A', ItemMod.adam_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_axe, 1), new Object[] {" AA", " SA", " S ", 'A', ItemMod.adam_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_helmet, 1), new Object[] {"AAA", "A A", 'A', ItemMod.adam_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_chestplate, 1), new Object[] {"A A", "AAA", "AAA", 'A', ItemMod.adam_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_leggings, 1), new Object[] {"AAA", "A A", "A A", 'A', ItemMod.adam_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_boots, 1), new Object[] {"A A", "A A", 'A', ItemMod.adam_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.adam_ingot, 9), new Object[] { "M", 'M', BlocksMod.adam_block});

		//Platinerium
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_sword, 1), new Object[] {"P", "P", "S", 'P', ItemMod.plati_ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_pickaxe, 1), new Object[] {"PPP", " S ", " S ", 'P', ItemMod.plati_ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_axe, 1), new Object[] {"PP ", "PS ", " S ", 'P', ItemMod.plati_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_axe, 1), new Object[] {" PP", " SP", " S ", 'P', ItemMod.plati_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_helmet, 1), new Object[] {"AAA", "A A", 'A', ItemMod.plati_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_chestplate, 1), new Object[] {"A A", "AAA", "AAA", 'A', ItemMod.plati_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_leggings, 1), new Object[] {"AAA", "A A", "A A", 'A', ItemMod.plati_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_boots, 1), new Object[] {"A A", "A A", 'A', ItemMod.plati_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plati_ingot, 9), new Object[] { "M", 'M', BlocksMod.plati_block});

		//Vanadium
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_sword, 1), new Object[] {"V", "C", "S", 'V', ItemMod.vana_ingot, 'C', ItemMod.mercu_core, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_pickaxe, 1), new Object[] {"VCV", " S ", " S ", 'V', ItemMod.vana_ingot, 'C', ItemMod.mercu_core, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_axe, 1), new Object[] {"VV ", "VS ", " S ", 'V', ItemMod.vana_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_axe, 1), new Object[] {" VV", " SV", " S ", 'V', ItemMod.vana_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_helmet, 1), new Object[] {"AAA", "A A", 'A', ItemMod.vana_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_chestplate, 1), new Object[] {"A A", "AAA", "AAA", 'A', ItemMod.vana_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_leggings, 1), new Object[] {"AAA", "A A", "A A", 'A', ItemMod.vana_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_boots, 1), new Object[] {"A A", "A A", 'A', ItemMod.vana_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.vana_ingot, 9), new Object[] { "M", 'M', BlocksMod.vana_block});

		//Thalkhanium
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_sword, 1), new Object[] {"T", "T", "S", 'T', ItemMod.talka_ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_pickaxe, 1), new Object[] {"TTT", " S ", " S ", 'T', ItemMod.talka_ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_axe, 1), new Object[] {"TT ", "TS ", " S ", 'T', ItemMod.talka_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_axe, 1), new Object[] {" TT", " ST", " S ", 'T', ItemMod.talka_ingot, 'S', Items.stick}); 
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_helmet, 1), new Object[] {"AAA", "A A", 'A', ItemMod.talka_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_chestplate, 1), new Object[] {"A A", "AAA", "AAA", 'A', ItemMod.talka_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_leggings, 1), new Object[] {"AAA", "A A", "A A", 'A', ItemMod.talka_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_boots, 1), new Object[] {"A A", "A A", 'A', ItemMod.talka_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.talka_ingot, 9), new Object[] { "M", 'M', BlocksMod.talka_block});
		
		//ScubaArmor
		GameRegistry.addRecipe(new ItemStack(ItemMod.scuba_helmet, 1), new Object[] {"ATA", "T T", 'T', ItemMod.talka_ingot, 'A', ItemMod.adam_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.oxygen_bottle, 1), new Object[] {"ATA", "A A", "ATA", 'T', ItemMod.talka_ingot, 'A', ItemMod.adam_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.scuba_leggings, 1), new Object[] {"ATA", "A A", "T T", 'T', ItemMod.talka_ingot, 'A', ItemMod.adam_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.scuba_boots, 1), new Object[] {"A T", "T A", 'T', ItemMod.talka_ingot, 'A', ItemMod.adam_ingot});
		
		//Special
		GameRegistry.addRecipe(new ItemStack(ItemMod.entity_detector, 1), new Object[] {" T ", "PMP", " T ", 'T', ItemMod.talka_ingot, 'P', ItemMod.plati_ingot, 'M', ItemMod.mercu_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.screen_detector, 1), new Object[] {"TGT", "TMT", "TGT", 'T', ItemMod.talka_ingot, 'G', Blocks.glass_pane, 'M', ItemMod.mercu_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.chest_finder, 1), new Object[] {"S", "C", "E", 'E', ItemMod.entity_detector, 'C', ItemMod.mercu_core, 'S', ItemMod.screen_detector});
		
		//Sticks

		
		/**
		 * Enregistrement des craft pour les block
		 */
		
		//Mercurio
		GameRegistry.addRecipe(new ItemStack(BlocksMod.mercu_block, 1), new Object[] {"MMM", "MMM", "MMM", 'M', ItemMod.mercu_ingot});
		GameRegistry.addSmelting(BlocksMod.mercu_ore, new ItemStack(ItemMod.mercu_ingot, 1), 4.0F);
		
		//Adamantium
		GameRegistry.addRecipe(new ItemStack(BlocksMod.adam_block, 1), new Object[] {"MMM", "MMM", "MMM", 'M', ItemMod.adam_ingot});
		GameRegistry.addSmelting(BlocksMod.adam_ore, new ItemStack(ItemMod.adam_ingot, 1), 2.0F);
		
		//Platinium
		GameRegistry.addRecipe(new ItemStack(BlocksMod.plati_block, 1), new Object[] {"MMM", "MMM", "MMM", 'M', ItemMod.plati_ingot});
		GameRegistry.addSmelting(BlocksMod.plati_ore, new ItemStack(ItemMod.plati_ingot, 1), 3.0F);
		
		//Vanadium
		GameRegistry.addRecipe(new ItemStack(BlocksMod.vana_block, 1), new Object[] {"MMM", "MMM", "MMM", 'M', ItemMod.vana_ingot});
		GameRegistry.addSmelting(BlocksMod.vana_ore, new ItemStack(ItemMod.vana_ingot, 1), 5.0F);
		
		//Thalkhanium
		GameRegistry.addRecipe(new ItemStack(BlocksMod.talka_block, 1), new Object[] {"MMM", "MMM", "MMM", 'M', ItemMod.talka_ingot});
		GameRegistry.addSmelting(BlocksMod.talka_ore, new ItemStack(ItemMod.talka_ingot, 1), 1.0F);
	
	}

}
