package com.funpanda.testmod.creativetab;

import com.funpanda.testmod.reference.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.creativetab
 *         Date: 8/22/2014
 */
public class CreativeTab {
    public static final CreativeTabs TAB_TM = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.cake);
        }

        @Override
        public String getTranslatedTabLabel(){
            return "TestMod Creative Tab";
        }
    };
}
