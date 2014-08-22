package com.funpanda.testmod;

import com.funpanda.testmod.init.ModBlocks;
import com.funpanda.testmod.init.ModItems;
import com.funpanda.testmod.proxy.IProxy;
import com.funpanda.testmod.util.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import com.funpanda.testmod.reference.Reference;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author FunPanda
 * Thanks to Pahimar
 * Package: com.funpanda.testmod
 * Date: 8/20/2014
 */

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)

public class TestMod {

    //Define Instance
    @Instance(Reference.MOD_ID)
    public static TestMod instance;

    //Add Proxy
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY, modId = Reference.MOD_ID)
    public static IProxy proxy;

    //PreInit
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        LogHelper.Info("Beginning PreInit");
        ModItems.init();
        ModBlocks.init();
    }

    //Init
    @EventHandler
    public void init(FMLInitializationEvent event){
        LogHelper.Info("Beginning Init");
    }

    //PostInit
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.Info("Beginning PostInit");
    }
}
