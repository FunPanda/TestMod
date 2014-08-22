package com.funpanda.testmod.init;

import com.funpanda.testmod.item.ItemTM;
import com.funpanda.testmod.item.crafting.ItemTest;
import com.funpanda.testmod.reference.ItemName;
import com.funpanda.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.init
 *         Date: 8/22/2014
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemTM itemTest = new ItemTest();

    public static void init(){
        GameRegistry.registerItem(itemTest, ItemName.ITEMTEST_NAME);
    }
}
