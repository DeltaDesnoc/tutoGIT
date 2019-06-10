package com.desnoc.mercurio.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister {
	
	public static void mainRegistry() {
		
		registerWorldGen(new WorldGenMercurio(), -1);
		registerWorldGen(new WorldGenMercurio(), 0);
		registerWorldGen(new WorldGenMercurio(), 1);
		
	}
	
	public static void registerWorldGen(IWorldGenerator iGenerator, int probability) {
		
		GameRegistry.registerWorldGenerator(iGenerator, probability);
		
	}

}
