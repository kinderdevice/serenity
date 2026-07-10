package dev.kinderdevice.serenity;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(Serenity.MOD_ID)
public final class Serenity {

    public static final String MOD_ID = "serenity";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Serenity() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SerenityConfig.SPEC);

        LOGGER.info("Initializing Serenity...");
    }
}