package com.desnoc.mercurio.items;

import com.desnoc.mercurio.Reference;
import com.desnoc.mercurio.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorTutoTalka extends ItemArmor{

	public ItemArmorTutoTalka(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == ItemMod.talka_leggings) {return Reference.MOD_ID + ":textures/models/armor/talkaarmor_layer_2.png";} 
		
		else if(stack.getItem() == ItemMod.talka_helmet || stack.getItem() == ItemMod.talka_chestplate || stack.getItem() == ItemMod.talka_boots) {return Reference.MOD_ID + ":textures/models/armor/talkaarmor_layer_1.png";}
		
		return null;
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		
		if(this == ItemMod.talka_boots) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 1, true));
		}
		
		else if(this == ItemMod.talka_leggings) {
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 20, 1, true));
		}

    }
	
}
