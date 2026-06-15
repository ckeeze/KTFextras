package com.ckeeze.ktfextras.common;

import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.common.items.MoldItem;
import net.dries007.tfc.util.Helpers;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

import static com.ckeeze.ktfextras.Config.moldArrowheadCapacity;
import static com.ckeeze.ktfextras.Config.moldCannonCapacity;
import static com.ckeeze.ktfextras.KTFExtras.MODID;

public class Registers {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final Map<Acid, RegistryObject<LiquidBlock>> ACID = Helpers.mapOfKeys(Acid.class, fluid ->
            registerBlock("fluid/" + fluid.getId(), () -> new LiquidBlock(ModFluids.AGED_ALCOHOL.get(fluid).source(), BlockBehaviour.Properties.copy(Blocks.WATER)))
    );
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final Map<Acid, RegistryObject<BucketItem>> FLUID_BUCKETS = Helpers.mapOfKeys(Acid.class, fluid ->
            registerItem("bucket/" + fluid.name(), () -> new BucketItem(ModFluids.AGED_ALCOHOL.get(fluid).source(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
    );

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

    public static final RegistryObject<Item> REINFORCED_CANNON_MOLD = registerItem("reinforced_cannon_mold",
            () -> new MoldItem(moldCannonCapacity, TFCTags.Fluids.USABLE_IN_INGOT_MOLD, new Item.Properties()));


    public static final RegistryObject<Item> ARROWHEAD_MOLD = registerItem("arrowhead_mold",
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


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        return BLOCKS.register(name.toLowerCase(Locale.ROOT), block);
    }

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item)
    {
        return ITEMS.register(name.toLowerCase(Locale.ROOT), item);
    }
}
