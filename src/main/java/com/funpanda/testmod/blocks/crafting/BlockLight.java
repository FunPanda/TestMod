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
public class BlockLight extends BlockTM {
    public BlockLight(){
        super(TMMaterials.test);
        this.setBlockUnbreakable();
        this.setHardness(0F);
        this.setLightOpacity(16);
        this.setLightLevel(1.0F);
        this.setBlockName(BlockName.BLOCKLIGHT_NAME);

    }
}
