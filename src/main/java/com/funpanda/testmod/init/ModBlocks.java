package com.funpanda.testmod.init;

import com.funpanda.testmod.blocks.BlockTM;
import com.funpanda.testmod.blocks.crafting.BlockLight;
import com.funpanda.testmod.blocks.crafting.BlockTest;
import com.funpanda.testmod.reference.BlockName;
import com.funpanda.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.init
 *         Date: 8/22/2014
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockTM blockTest = new BlockTest();
    public static final BlockTM blockLight = new BlockLight();

    public static void init(){
        GameRegistry.registerBlock(blockTest, BlockName.BLOCKTEST_NAME);
        GameRegistry.registerBlock(blockLight,BlockName.BLOCKLIGHT_NAME);
    }
}
