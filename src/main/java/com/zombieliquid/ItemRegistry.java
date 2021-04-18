package com.zombieliquid;

import com.zombieliquid.Items.RottenFleshPlus;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

   public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "zombieliquid");

   public static final RegistryObject<Item> rottenFleshPlus = ITEMS.register("rotten_flesh_plus",()->
           new RottenFleshPlus());


}
