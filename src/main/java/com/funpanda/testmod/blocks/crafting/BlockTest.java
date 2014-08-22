package com.funpanda.testmod.blocks.crafting;

import com.funpanda.testmod.blocks.BlockTM;
import com.funpanda.testmod.materials.TMMaterials;
import com.funpanda.testmod.reference.BlockName;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.blocks.crafting
 *         Date: 8/22/2014
 */
public class BlockTest extends BlockTM {
    public BlockTest(){
        super(TMMaterials.test);
        this.setBlockUnbreakable();
        this.setHardness(0F);
        this.setLightOpacity(0);
        this.setBlockName(BlockName.BLOCKTEST_NAME);
    }
}
