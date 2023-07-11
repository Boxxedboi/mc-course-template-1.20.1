package net.boxxed.mccourse;

import net.boxxed.mccourse.block.ModBlocks;
import net.boxxed.mccourse.item.ModItemGroup;
import net.boxxed.mccourse.item.ModItems;
import net.boxxed.mccourse.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuff();

	}
}