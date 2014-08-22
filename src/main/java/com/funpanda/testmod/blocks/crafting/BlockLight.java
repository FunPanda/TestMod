package com.funpanda.testmod.blocks.crafting;

import com.funpanda.testmod.reference.BlockName;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.blocks.crafting
 *         Date: 8/22/2014
 */
public class BlockLight extends BlockTest {
    public BlockLight(){
        super();
        this.setLightOpacity(16);
        this.setLightLevel(24);
        this.setBlockName(BlockName.BLOCKLIGHT_NAME);

    }
}
