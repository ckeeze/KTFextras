package com.ckeeze.ktfextras.item;

import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.common.items.MoldItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.Locale;
import java.util.function.Supplier;

import static com.ckeeze.ktfextras.Config.moldArrowheadCapacity;
import static com.ckeeze.ktfextras.Config.moldCannonCapacity;
import static com.ckeeze.ktfextras.KTFExtras.MODID;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> SMALL_BARREL = ITEMS.register("small_barrel",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUSKET_BARREL = ITEMS.register("musket_barrel",
            () ->  new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRASS_CANNON_BARREL = ITEMS.register("brass_cannon_barrel",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAST_IRON_CANNON_BARREL = ITEMS.register("cast_iron_cannon_barrel",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNFIRED_CANNON_MOLD = ITEMS.register("unfired_cannon_mold",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNFINISHED_CANNON_MOLD = ITEMS.register("unfinished_cannon_mold",
            () ->  new Item(new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_CANNON_MOLD = register("reinforced_cannon_mold",
            () -> new MoldItem(moldCannonCapacity, TFCTags.Fluids.USABLE_IN_INGOT_MOLD, new Item.Properties()));


    public static final RegistryObject<Item> ARROWHEAD_MOLD = register("arrowhead_mold",
            () -> new MoldItem(moldArrowheadCapacity, TFCTags.Fluids.USABLE_IN_TOOL_HEAD_MOLD, new Item.Properties()));

    public static final RegistryObject<Item> UNFIRED_ARROWHEAD_MOLD = ITEMS.register("unfired_arrowhead_mold",
            () ->  new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNFINISHED_BRONZE_ANCHOR = ITEMS.register("unfinished_bronze_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNFINISHED_BLACK_BRONZE_ANCHOR = ITEMS.register("unfinished_black_bronze_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNFINISHED_BISMUTH_BRONZE_ANCHOR = ITEMS.register("unfinished_bismuth_bronze_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNFINISHED_WROUGHTIRON_ANCHOR = ITEMS.register("unfinished_wrought_iron_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNFINISHED_STEEL_ANCHOR = ITEMS.register("unfinished_steel_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_ANCHOR = ITEMS.register("bronze_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_BRONZE_ANCHOR = ITEMS.register("black_bronze_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_BRONZE_ANCHOR = ITEMS.register("bismuth_bronze_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> WROUGHTIRON_ANCHOR = ITEMS.register("wrought_iron_anchor",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_ANCHOR = ITEMS.register("steel_anchor",
            () ->  new Item(new Item.Properties()));

    public static final RegistryObject<Item> WROUGHTIRON_ARROWHEAD = ITEMS.register("wrought_iron_arrowhead",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_ARROWHEAD = ITEMS.register("bronze_arrowhead",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_BRONZE_ARROWHEAD = ITEMS.register("black_bronze_arrowhead",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_BRONZE_ARROWHEAD = ITEMS.register("bismuth_bronze_arrowhead",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ARROWHEAD = ITEMS.register("copper_arrowhead",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_ARROWHEAD = ITEMS.register("steel_arrowhead",
            () ->  new Item(new Item.Properties()));

    private static <T extends Item> RegistryObject<Item> register(String name, Supplier<T> item) {
        return ITEMS.register(name.toLowerCase(Locale.ROOT), item);
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}