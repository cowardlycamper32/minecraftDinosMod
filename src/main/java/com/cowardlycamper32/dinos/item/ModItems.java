package com.cowardlycamper32.dinos.item;

import com.cowardlycamper32.dinos.Dinos;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, Dinos.MODID);
    
    
    public static final RegistryObject<Item> CR_FOSSIL = ITEMS.register("cr_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JR_FOSSIL = ITEMS.register("jr_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQ_FOSSIL = ITEMS.register("aq_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AR_FOSSIL = ITEMS.register("ar_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CZ_FOSSIL = ITEMS.register("cz_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TR_FOSSIL = ITEMS.register("tr_fossil",
            () -> new Item(new Item.Properties()));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
