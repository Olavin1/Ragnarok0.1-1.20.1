package net.olavo.ragnarokmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.olavo.ragnarokmod.RagnarokMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RagnarokMod.MODID);

            public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
                    () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
