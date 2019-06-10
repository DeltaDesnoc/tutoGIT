package com.desnoc.mercurio.items;

import com.desnoc.mercurio.Reference;
import com.desnoc.mercurio.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorTutoPlati extends ItemArmor{

	public ItemArmorTutoPlati(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == ItemMod.plati_leggings) {return Reference.MOD_ID + ":textures/models/armor/platiarmor_layer_2.png";} 
		
		else if(stack.getItem() == ItemMod.plati_helmet || stack.getItem() == ItemMod.plati_chestplate || stack.getItem() == ItemMod.plati_boots) {return Reference.MOD_ID + ":textures/models/armor/platiarmor_layer_1.png";}
		
		return null;
	}
	
}