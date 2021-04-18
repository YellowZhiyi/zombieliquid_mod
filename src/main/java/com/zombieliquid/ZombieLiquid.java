package com.zombieliquid;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("zombieliquid")
public class ZombieLiquid {

    public static final String MOD_ID = "zombieliquid";
    public static ZombieLiquid instance;
    public static final Logger LOGGER = LogManager.getLogger();

    public ZombieLiquid(){
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    private void onServerStarting(FMLServerStartingEvent event){

    }


}
