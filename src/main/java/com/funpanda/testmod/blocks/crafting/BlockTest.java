package com.funpanda.testmod.blocks.crafting;

import com.funpanda.testmod.blocks.BlockTM;
import com.funpanda.testmod.materials.TMMaterials;
import com.funpanda.testmod.reference.BlockName;
import com.funpanda.testmod.util.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author FunPanda
 *         Thanks to Pahimar
 *         Package: com.funpanda.testmod.blocks.crafting
 *         Date: 8/22/2014
 */
    public class BlockTest extends BlockTM {
    //Tick Rate in approximate seconds
    public static int tickrate = 1;
    //tickrate multiplied by this to get Tick Rate
    public static int tickratemultiplier = 20*1;

    //Block Constructor
    public BlockTest(){
        super(TMMaterials.test);
        this.setBlockUnbreakable();
        this.setHardness(0F);
        this.setLightOpacity(16);
        this.setTickRandomly(true);
        this.setBlockName(BlockName.BLOCKTEST_NAME);



    }

    //Initialize Block Updates
    @Override
    public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_){
        p_149726_1_.scheduleBlockUpdate(p_149726_2_,p_149726_3_,p_149726_4_,this,this.tickRate(p_149726_1_));
        //LogHelper.Info(getTickrate(p_149726_1_));     Displays Tick Rate
        //LogHelper.Info("BlockUpdateScheduled");       Announce BUD Scheduling
    }

    //Sets tick rate in approximate seconds based on "tickrate" variable
    @Override
    public int tickRate(World p_149738_1_)
    {
        return tickrate*tickratemultiplier;
    }

    //Update Ticks; Searches for players within AABB (Eventually) and applies potion effect
    @Override
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_){
        LogHelper.Info("Ticking!");       //Announces Ticking
        //LogHelper.Info(getTickrate(p_149674_1_));     //Displays Tick Rate
        p_149674_1_.scheduleBlockUpdate(p_149674_2_, p_149674_3_, p_149674_4_, this, this.tickRate(p_149674_1_));
        AxisAlignedBB AABB = AxisAlignedBB.getBoundingBox(1,1,1,10,10,10);
        List list = p_149674_1_.getEntitiesWithinAABB(EntityPlayer.class, AABB);
        Iterator iterator = list.iterator();
        EntityPlayer entityplayer;

        while(iterator.hasNext()){
            entityplayer = (EntityPlayer)iterator.next();
            entityplayer.addPotionEffect(new PotionEffect(Potion.jump.id, 10*20, 10, false));
        }

    }

    //Returns Tick Rate in seconds with seconds appended
    public String getTickrate(World world){
        return this.tickRate(world)/tickratemultiplier + " seconds!";
    }

}
