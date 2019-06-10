package com.desnoc.mercurio.items;

import com.desnoc.mercurio.Reference;
import com.desnoc.mercurio.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorTutoAdam extends ItemArmor{

	public ItemArmorTutoAdam(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == ItemMod.adam_leggings) {return Reference.MOD_ID + ":textures/models/armor/adamarmor_layer_2.png";} 

		else if(stack.getItem() == ItemMod.adam_helmet || stack.getItem() == ItemMod.adam_chestplate || stack.getItem() == ItemMod.adam_boots) {return Reference.MOD_ID + ":textures/models/armor/adamarmor_layer_1.png";}
		
		return null;
	}
	
}
