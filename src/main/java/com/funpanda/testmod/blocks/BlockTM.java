package com.funpanda.testmod.blocks;

import com.funpanda.testmod.creativetab.CreativeTab;
import com.funpanda.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.blocks
 *         Date: 8/22/2014
 */
public class BlockTM extends Block{
    public BlockTM(Material materialType){
        super(materialType);
        this.setCreativeTab(CreativeTab.TAB_TM);
        this.setHardness(1F);
        this.setStepSound(Block.soundTypeMetal);
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.TEXTURE_PATH,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
}

