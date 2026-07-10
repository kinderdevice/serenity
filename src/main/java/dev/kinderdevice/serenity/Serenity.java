package dev.kinderdevice.serenity;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Serenity.MOD_ID)
public final class Serenity {

    public static final String MOD_ID = "serenity";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Serenity() {
        LOGGER.info("Initializing Serenity...");
    }
}