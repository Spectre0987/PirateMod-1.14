package net.pirates.mod.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.pirates.mod.Pirate;

public class PItems {
	
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	public static Item telescope = register(new ItemTelescope(), "telescope");
	
	public static Item register(Item item, String name) {
		item.setRegistryName(new ResourceLocation(Pirate.MODID, name));
		ITEMS.add(item);
		return item;
	}

}
