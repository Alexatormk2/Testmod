package net.alexatorv13.testmod.item;

import net.alexatorv13.testmod.Testmod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
//lista de items
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, Testmod.MOD_ID);
public static final RegistryObject<Item> SAPHIRON = ITEMS.register("saphiron",
        ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)) );

    public static final RegistryObject<Item> RAW_SAPHIRON = ITEMS.register("raw_saphiron",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTMOD_TAB)) );


public  static  void register(IEventBus eventbus){
    ITEMS.register(eventbus);
}
}
