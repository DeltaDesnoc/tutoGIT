package com.desnoc.mercurio.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodMod extends ItemFood {

	private float potionEffectProbability;
	private int potionId;
	private int potionDuration;
	private int potionAmplifier;

	public ItemFoodMod(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);

	}

	
	public void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer player)
    {
        if (!p_77849_2_.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 1, true));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 1, true));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 3000, 1, true));
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 3000, 1, true));
        }

        if (p_77849_1_.getItemDamage() > 0)
        {
            if (!p_77849_2_.isRemote)
            {
                player.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 3, true));
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 3000, 4, true));
            }
        }
        else
        {
            super.onFoodEaten(p_77849_1_, p_77849_2_, player);
        }
    }
	
}
