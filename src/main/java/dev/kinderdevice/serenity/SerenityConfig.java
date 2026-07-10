package dev.kinderdevice.serenity;

import net.minecraftforge.common.ForgeConfigSpec;

public final class SerenityConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue ENABLE_TERRAIN =
            BUILDER.comment("Enable Serenity terrain generation.")
                    .define("terrain.enable", true);

    public static final ForgeConfigSpec.DoubleValue TERRAIN_SMOOTHNESS =
            BUILDER.comment("Terrain smoothness.")
                    .defineInRange("terrain.smoothness", 0.45D, 0.0D, 1.0D);

    public static final ForgeConfigSpec.DoubleValue MOUNTAIN_FREQUENCY =
            BUILDER.comment("Mountain frequency.")
                    .defineInRange("terrain.mountain_frequency", 0.70D, 0.0D, 1.0D);

    public static final ForgeConfigSpec.DoubleValue SURFACE_CRACKS =
            BUILDER.comment("Surface crack frequency.")
                    .defineInRange("terrain.surface_cracks", 0.20D, 0.0D, 1.0D);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    private SerenityConfig() {}
}