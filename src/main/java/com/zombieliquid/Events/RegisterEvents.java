package com.zombieliquid.Events;

import com.zombieliquid.List.ItemList;
import com.zombieliquid.ZombieLiquid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegisterEvents {
    public static final Logger LOGGER = ZombieLiquid.LOGGER;
    public static final String MOD_ID = ZombieLiquid.MOD_ID;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
            ItemList.rotten_flesh_plus = new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(64))
                    .setRegistryName(location("rotten_flesh_plus"))
        );
    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID,name);
    }
}
