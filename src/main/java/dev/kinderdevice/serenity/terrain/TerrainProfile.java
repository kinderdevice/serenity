package dev.kinderdevice.serenity.terrain;

public record TerrainProfile(
        double smoothness,
        double mountainFrequency,
        double mountainHeight,
        double crackReduction,
        double valleyStrength
) {
}