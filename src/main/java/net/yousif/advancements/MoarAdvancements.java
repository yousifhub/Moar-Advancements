package net.yousif.advancements;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoarAdvancements implements ModInitializer {
	public static final String MOD_ID = "data/moar-advancements";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Minecraft Ran Successfully!");
	}
}