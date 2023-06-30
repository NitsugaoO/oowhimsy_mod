package name.oowhimsy_mod.registry;

import name.oowhimsy_mod.OoWhimsyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BAGASSE = registerItem("sugar_cane_bagasse",
        new Item(new FabricItemSettings()),
            ModItemGroups.OOWHIMSY, ItemGroups.INGREDIENTS);
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(OoWhimsyMod.MOD_ID, name), item);
        for (ItemGroup itemGroup: itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add((registeredItem)));
        }
        return registeredItem;
    }
    public static void registerModItems() {
        OoWhimsyMod.LOGGER.debug("Registering mod items for" + OoWhimsyMod.MOD_ID);
    }
}
