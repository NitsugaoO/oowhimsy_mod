package name.oowhimsy_mod.registry;

import name.oowhimsy_mod.OoWhimsyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups  {
    public static ItemGroup OOWHIMSY = FabricItemGroup.builder(new Identifier(OoWhimsyMod.MOD_ID, "oowhimsy"))
            .displayName(Text.translatable("itemgroup.oowhimsy-mod.oowhimsy"))
            .icon(()-> new ItemStack(ModItems.SUGAR_CANE_BAGASSE))
            .build();
    public static void registerItemGroup() {
        OoWhimsyMod.LOGGER.debug("Registering mod item group for " + OoWhimsyMod.MOD_ID);
    }
}
