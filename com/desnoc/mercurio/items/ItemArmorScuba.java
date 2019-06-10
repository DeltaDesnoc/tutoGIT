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

public class ItemArmorScuba extends ItemArmor {
	
	public ItemArmorScuba(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == ItemMod.scuba_leggings) {return Reference.MOD_ID + ":textures/models/armor/scubaarmor_layer_2.png";}
		
		else if(stack.getItem() == ItemMod.scuba_helmet || stack.getItem() == ItemMod.oxygen_bottle || stack.getItem() == ItemMod.scuba_boots) {return Reference.MOD_ID + ":textures/models/armor/scubaarmor_layer_1.png";}
		
		return null;
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		
		ItemStack scuba_boots = player.getEquipmentInSlot(1);
        ItemStack scuba_leggings = player.getEquipmentInSlot(2);
        ItemStack oxygen_bottle = player.getEquipmentInSlot(3);
        ItemStack scuba_helmet = player.getEquipmentInSlot(4);

        if(scuba_boots != null && scuba_boots.getItem() == ItemMod.scuba_boots && scuba_leggings != null && scuba_leggings.getItem() == ItemMod.scuba_leggings && oxygen_bottle != null && oxygen_bottle.getItem() == ItemMod.oxygen_bottle && scuba_helmet != null && scuba_helmet.getItem() == ItemMod.scuba_helmet){
            
        	player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 10, 1, true));
        	player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 20, 1, true));
        	player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 10, 0, true));
        
        }
		
	}

}
