package com.funpanda.testmod.item.crafting;

import com.funpanda.testmod.item.ItemTM;
import com.funpanda.testmod.reference.ItemName;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.item.crafting
 *         Date: 8/22/2014
 */
public class ItemTest extends ItemTM{
       public ItemTest(){
           super();
           this.setPotionEffect("moveSpeed");
           this.setUnlocalizedName(ItemName.ITEMTEST_NAME);

       }

       public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_){

           if(p_77659_3_.getActivePotionEffect(Potion.regeneration)== null){
               if(!p_77659_2_.isRemote){
                   p_77659_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id,300*20,5));
               }

           }

           return p_77659_1_;

       }

}
