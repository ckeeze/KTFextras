package com.ckeeze.ktfextras.common;

import com.ckeeze.ktfextras.KTFExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Consumer;

import static com.ckeeze.ktfextras.KTFExtras.MODID;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> KTFEXTRAS_ITEMS_TAB = CREATIVE_MODE_TABS.register("ktfextras_items_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(Registers.WROUGHTIRON_ANCHOR.get()))
                    .title(Component.translatable("creativetab.ktfextras.items"))
                    .displayItems((itemDisplayParameters, output)->{
                        output.accept(Registers.COPPER_ARROWHEAD.get());
                        output.accept(Registers.BRONZE_ARROWHEAD.get());
                        output.accept(Registers.BISMUTH_BRONZE_ARROWHEAD.get());
                        output.accept(Registers.BLACK_BRONZE_ARROWHEAD.get());
                        output.accept(Registers.WROUGHTIRON_ARROWHEAD.get());
                        output.accept(Registers.STEEL_ARROWHEAD.get());

                        output.accept(Registers.WROUGHTIRON_ANCHOR.get());
                        output.accept(Registers.STEEL_ANCHOR.get());
                        output.accept(Registers.BRONZE_ANCHOR.get());
                        output.accept(Registers.BISMUTH_BRONZE_ANCHOR.get());
                        output.accept(Registers.BLACK_BRONZE_ANCHOR.get());

                        output.accept(Registers.UNFINISHED_WROUGHTIRON_ANCHOR.get());
                        output.accept(Registers.UNFINISHED_STEEL_ANCHOR.get());
                        output.accept(Registers.UNFINISHED_BRONZE_ANCHOR.get());
                        output.accept(Registers.UNFINISHED_BISMUTH_BRONZE_ANCHOR.get());
                        output.accept(Registers.UNFINISHED_BLACK_BRONZE_ANCHOR.get());

                        output.accept(Registers.SMALL_BARREL.get());
                        output.accept(Registers.MUSKET_BARREL.get());
                        output.accept(Registers.BRASS_CANNON_BARREL.get());
                        output.accept(Registers.CAST_IRON_CANNON_BARREL.get());

                        output.accept(Registers.ARROWHEAD_MOLD.get());
                        output.accept(Registers.UNFIRED_ARROWHEAD_MOLD.get());
                        output.accept(Registers.REINFORCED_CANNON_MOLD.get());
                        output.accept(Registers.UNFINISHED_CANNON_MOLD.get());
                        output.accept(Registers.UNFIRED_CANNON_MOLD.get());

                    }).build());

    private static void fillTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output out)
    {
        consumeOurs(ForgeRegistries.FLUIDS, fluid -> out.accept(fluid.getBucket()));
    }



    private static <T> void consumeOurs(IForgeRegistry<T> registry, Consumer<T> consumer)
    {
        for (T value : registry)
        {
            if (Objects.requireNonNull(registry.getKey(value)).getNamespace().equals(MODID))
            {
                consumer.accept(value);
            }
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}