package dev.kinderdevice.serenity.terrain;

import dev.kinderdevice.serenity.Serenity;
import dev.kinderdevice.serenity.SerenityConfig;

public final class TerrainManager {

    private static TerrainProfile profile = TerrainProfile.DEFAULT;

    private TerrainManager() {
    }

    public static void initialize() {

        profile = new TerrainProfile(
                SerenityConfig.TERRAIN_SMOOTHNESS.get(),
                SerenityConfig.MOUNTAIN_FREQUENCY.get(),
                1.15D,
                SerenityConfig.SURFACE_CRACKS.get(),
                0.60D
        );

        Serenity.LOGGER.info("Terrain profile loaded:");
        Serenity.LOGGER.info(" Smoothness: {}", profile.smoothness());
        Serenity.LOGGER.info(" Mountain frequency: {}", profile.mountainFrequency());
        Serenity.LOGGER.info(" Surface cracks: {}", profile.crackReduction());
    }

    public static TerrainProfile profile() {
        return profile;
    }

}