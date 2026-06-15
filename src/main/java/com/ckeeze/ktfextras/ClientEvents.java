package com.ckeeze.ktfextras;

import com.ckeeze.ktfextras.common.Registers;
import net.dries007.tfc.client.model.ContainedFluidModel;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.model.DynamicFluidContainerModel;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

import static com.ckeeze.ktfextras.KTFExtras.MODID;

public class ClientEvents {
    public static void init() {

        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ClientEvents::registerItemColorHandlers);
    }

    private static void registerItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        event.register(new ContainedFluidModel.Colors(), Registers.REINFORCED_CANNON_MOLD.get());
        event.register(new ContainedFluidModel.Colors(), Registers.ARROWHEAD_MOLD.get());

        for (Fluid fluid : ForgeRegistries.FLUIDS.getValues())
        {
            if (Objects.requireNonNull(ForgeRegistries.FLUIDS.getKey(fluid)).getNamespace().equals(MODID))
            {
                event.register(new DynamicFluidContainerModel.Colors(), fluid.getBucket());
            }
        }
    }
}
