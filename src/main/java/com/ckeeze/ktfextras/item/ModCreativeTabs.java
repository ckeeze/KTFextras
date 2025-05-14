package com.ckeeze.ktfextras.item;

import com.ckeeze.ktfextras.KTFExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KTFExtras.MODID);

    public static final RegistryObject<CreativeModeTab> WORKERSTFC_ITEMS_TAB = CREATIVE_MODE_TABS.register("ktfextras_items_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.WROUGHTIRON_ANCHOR.get()))
                    .title(Component.translatable("creativetab.ktfextras.items"))
                    .displayItems((itemDisplayParameters, output)->{
                        output.accept(ModItems.COPPER_ARROWHEAD.get());
                        output.accept(ModItems.BRONZE_ARROWHEAD.get());
                        output.accept(ModItems.BISMUTH_BRONZE_ARROWHEAD.get());
                        output.accept(ModItems.BLACK_BRONZE_ARROWHEAD.get());
                        output.accept(ModItems.WROUGHTIRON_ARROWHEAD.get());
                        output.accept(ModItems.STEEL_ARROWHEAD.get());

                        output.accept(ModItems.WROUGHTIRON_ANCHOR.get());
                        output.accept(ModItems.STEEL_ANCHOR.get());
                        output.accept(ModItems.BRONZE_ANCHOR.get());
                        output.accept(ModItems.BISMUTH_BRONZE_ANCHOR.get());
                        output.accept(ModItems.BLACK_BRONZE_ANCHOR.get());

                        output.accept(ModItems.UNFINISHED_WROUGHTIRON_ANCHOR.get());
                        output.accept(ModItems.UNFINISHED_STEEL_ANCHOR.get());
                        output.accept(ModItems.UNFINISHED_BRONZE_ANCHOR.get());
                        output.accept(ModItems.UNFINISHED_BISMUTH_BRONZE_ANCHOR.get());
                        output.accept(ModItems.UNFINISHED_BLACK_BRONZE_ANCHOR.get());

                        output.accept(ModItems.SMALL_BARREL.get());
                        output.accept(ModItems.MUSKET_BARREL.get());
                        output.accept(ModItems.BRASS_CANNON_BARREL.get());
                        output.accept(ModItems.CAST_IRON_CANNON_BARREL.get());

                        output.accept(ModItems.ARROWHEAD_MOLD.get());
                        output.accept(ModItems.UNFIRED_ARROWHEAD_MOLD.get());
                        output.accept(ModItems.REINFORCED_CANNON_MOLD.get());
                        output.accept(ModItems.UNFINISHED_CANNON_MOLD.get());
                        output.accept(ModItems.UNFIRED_CANNON_MOLD.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}