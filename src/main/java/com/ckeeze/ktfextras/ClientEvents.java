package com.ckeeze.ktfextras;

import com.ckeeze.ktfextras.item.ModItems;
import net.dries007.tfc.client.model.ContainedFluidModel;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ClientEvents {
    public static void init() {

        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ClientEvents::registerItemColorHandlers);
    }

    private static void registerItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        event.register(new ContainedFluidModel.Colors(), ModItems.REINFORCED_CANNON_MOLD.get());
        event.register(new ContainedFluidModel.Colors(), ModItems.ARROWHEAD_MOLD.get());
    }
}
