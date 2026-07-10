package dev.kinderdevice.serenity.terrain;

public record TerrainProfile(

        double smoothness,
        double mountainFrequency,
        double mountainHeight,
        double crackReduction,
        double valleyStrength

) {

    public static final TerrainProfile DEFAULT = new TerrainProfile(
            0.45D,
            0.70D,
            1.15D,
            0.20D,
            0.60D
    );
}