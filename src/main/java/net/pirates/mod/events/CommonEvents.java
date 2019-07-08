package net.pirates.mod.events;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pirates.mod.Pirate;

@Mod.EventBusSubscriber(modid = Pirate.MODID)
public class CommonEvents {

	
	@SubscribeEvent
	public static void useTelescope() {}
}
