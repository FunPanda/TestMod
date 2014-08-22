package com.funpanda.testmod.item;

import com.funpanda.testmod.creativetab.CreativeTab;
import com.funpanda.testmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.item
 *         Date: 8/22/2014
 */
public class ItemTM extends Item {
    public ItemTM(){
        super();
        this.setCreativeTab(CreativeTab.TAB_TM);
        this.setMaxStackSize(1);
        this.setNoRepair();
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.TEXTURE_PATH,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack ItemStack){
        return String.format("item.%s%s", Reference.TEXTURE_PATH,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }
}
