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

public class ItemArmorTutoVana extends ItemArmor{

	public ItemArmorTutoVana(ArmorMaterial material, int metaData) {
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == ItemMod.vana_leggings) {return Reference.MOD_ID + ":textures/models/armor/vanaarmor_layer_2.png";} 
		
		else if(stack.getItem() == ItemMod.vana_helmet || stack.getItem() == ItemMod.vana_chestplate || stack.getItem() == ItemMod.vana_boots) {return Reference.MOD_ID + ":textures/models/armor/vanaarmor_layer_1.png";}
		
		return null;
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		
		if(this == ItemMod.vana_chestplate) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 20, 1, true));
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 1, true));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 20, 0, true));
		}
		
		else if(this == ItemMod.vana_helmet) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 260, 1, true));
		}

		ItemStack vana_boots = player.getEquipmentInSlot(1);
        ItemStack vana_leggings = player.getEquipmentInSlot(2);
        ItemStack vana_chestplate = player.getEquipmentInSlot(3);
        ItemStack vana_helmet = player.getEquipmentInSlot(4);

        if(vana_boots != null && vana_boots.getItem() == ItemMod.vana_boots && vana_leggings != null && vana_leggings.getItem() == ItemMod.vana_leggings && vana_chestplate != null && vana_chestplate.getItem() == ItemMod.vana_chestplate && vana_helmet != null && vana_helmet.getItem() == ItemMod.vana_helmet)
        {
            player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 20, 1, true));
        }
    }

	
}

