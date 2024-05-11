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
// items:
            public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> ECTOPLASM = ITEMS.register("ectoplasm",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> SUNSTEEL_INGOT = ITEMS.register("sunsteel_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> DWARVEN_STEEL_INGOT = ITEMS.register("dwarven_steel_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> MOONSILVER_INGOT = ITEMS.register("moonsilver_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> ETHER = ITEMS.register("ether",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> GOLDEN_ETHER = ITEMS.register("golden_ether",
                    () -> new Item(new Item.Properties()));
// food:
            public static final RegistryObject<Item> MYSTIC_MEAT = ITEMS.register("mystic_meat",
                    () -> new Item(new Item.Properties().food(ModFoods.MYSTIC_MEAT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
