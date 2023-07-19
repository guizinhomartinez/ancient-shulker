package net.empireofbrazil.projectshulker;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initializer implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ancient-shulker");

	@Override
	public void onInitialize() {
		LOGGER.info("i am going to regret starting this project");
	}
}