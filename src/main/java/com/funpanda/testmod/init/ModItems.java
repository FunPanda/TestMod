package com.funpanda.testmod.init;

import com.funpanda.testmod.item.ItemTM;
import com.funpanda.testmod.item.crafting.ItemTest;
import com.funpanda.testmod.reference.ItemName;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.init
 *         Date: 8/22/2014
 */
public class ModItems {
    public static final ItemTM testItem = new ItemTest();

    public static void init(){
        GameRegistry.registerItem(testItem, ItemName.ITEMTEST_NAME);
    }
}
