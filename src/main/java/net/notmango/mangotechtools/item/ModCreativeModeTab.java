package net.notmango.mangotechtools.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MANGO_INGOTS = new CreativeModeTab("mangotechingots") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_INGOT.get());
        }
    };

    public static final CreativeModeTab MANGO_TOOLS = new CreativeModeTab("mangotechtool") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.APATITE_AXE.get());
        }
    };

}
