package net.olavo.ragnarokmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.olavo.ragnarokmod.RagnarokMod;

public class ModCreativeModTabs {
    public static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RagnarokMod.MODID);

    public static final RegistryObject<CreativeModeTab> RAGNAROK_TAB = CREATIVE_MODE_TABS.register( "ragnarok_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MITHRIL.get()))
                    .title(Component.translatable( "creativetab.ragnarok_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MITHRIL.get());
                        pOutput.accept(ModItems.RAW_MITHRIL.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
