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

public class ItemArmorTutoMercu extends ItemArmor {

	public ItemArmorTutoMercu(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == ItemMod.mercu_leggings) {return Reference.MOD_ID + ":textures/models/armor/mercuarmor_layer_2.png";}
		
		else if(stack.getItem() == ItemMod.mercu_helmet || stack.getItem() == ItemMod.mercu_chestplate || stack.getItem() == ItemMod.mercu_boots) {return Reference.MOD_ID + ":textures/models/armor/mercuarmor_layer_1.png";}
		
		return null;
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		
		if(this == ItemMod.mercu_chestplate) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 20, 0, true));
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 0, true));
		}
		
		else if(this == ItemMod.mercu_helmet) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 260, 1, true));
		}

    }

}
