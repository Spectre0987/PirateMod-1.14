package net.pirates.mod.registry;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.pirates.mod.Pirate;
import net.pirates.mod.items.PItems;

@Mod.EventBusSubscriber(modid = Pirate.MODID, bus = Bus.MOD)
public class Registry {

	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		for(Item item : PItems.ITEMS) {
			event.getRegistry().register(item);
		}
	}
}
