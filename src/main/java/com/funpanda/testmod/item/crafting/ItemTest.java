package com.funpanda.testmod.item.crafting;

import com.funpanda.testmod.item.ItemTM;
import com.funpanda.testmod.reference.ItemName;
import net.minecraft.potion.Potion;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.item.crafting
 *         Date: 8/22/2014
 */
public class ItemTest extends ItemTM{
       public ItemTest(){
           super();
           this.setPotionEffect(Potion.regeneration.getName());
           this.setUnlocalizedName(ItemName.ITEMTEST_NAME);

       }

}
