package net.pirates.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("pirates")
public class Pirate
{

	public static final String MODID = "pirates";
	
    public Pirate() {
    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }
    
    public void setup(FMLCommonSetupEvent event) {
    	System.out.println("Pre-init called!");
    }
}
