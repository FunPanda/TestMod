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
public class BlockPotion extends BlockTM{
    public BlockPotion(){
        super(TMMaterials.test);
        this.setHardness(100);
        this.setResistance(100);
        this.setBlockName(BlockName.BLOCKPOTION_NAME);
    }
}
