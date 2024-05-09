package net.olavo.ragnarokmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.olavo.ragnarokmod.RagnarokMod;
import net.olavo.ragnarokmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RagnarokMod.MODID);

    public static final RegistryObject<CreativeModeTab> RAGNAROK_TAB = CREATIVE_MODE_TABS.register( "ragnarok_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MITHRIL_INGOT.get()))
                    .title(Component.translatable( "creativetab.ragnarok_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MITHRIL_INGOT.get());
                        pOutput.accept(ModItems.RAW_MITHRIL.get());

                        pOutput.accept(ModBlocks.MITHRIL_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
