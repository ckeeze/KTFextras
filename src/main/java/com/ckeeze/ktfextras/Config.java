
package com.ckeeze.ktfextras;

import net.dries007.tfc.util.Alloy;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class Config {

    private static ForgeConfigSpec GENERAL_SPEC;

    public static void register() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        Config.registerServerConfig(builder);
        GENERAL_SPEC = builder.build();
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.GENERAL_SPEC, "ktfextras.toml");
    }

    public static ForgeConfigSpec.IntValue moldArrowheadCapacity;
    public static ForgeConfigSpec.IntValue moldCannonCapacity;

    private static void registerServerConfig(ForgeConfigSpec.Builder builder) {
        builder.push("molds");

        moldArrowheadCapacity = builder
                .comment("Tank capacity of a Prospector's Drill head mold (in mB).")
                .defineInRange("moldArrowheadCapacity", 50, 0, Alloy.MAX_ALLOY);

        moldCannonCapacity = builder
                .comment("Tank capacity of a Mineral Prospector head mold (in mB).")
                .defineInRange("moldCannonCapacity", 2400, 0, Alloy.MAX_ALLOY );
    }
}