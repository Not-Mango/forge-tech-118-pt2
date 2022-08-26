package net.notmango.mangotechtools.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.notmango.mangotechtools.block.ModBlocks;

public class ModCreativeModeTab {

    public static final CreativeModeTab MANGO_ORES = new CreativeModeTab("mangotechore") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModBlocks.AQUAMARINE_ORE.get());
        }
    };

    public static final CreativeModeTab MANGO_INGOTS = new CreativeModeTab("mangotechingots") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.TIN_INGOT.get());
        }
    };

    public static final CreativeModeTab MANGO_BLOCKS = new CreativeModeTab("mangotechblocks") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModBlocks.TIN_BLOCK.get());
        }
    };

    public static final CreativeModeTab MANGO_MACHINES = new CreativeModeTab("mangotechmachines") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModBlocks.OBLITERATOR.get());
        }
    };

    public static final CreativeModeTab MANGO_TOOLS = new CreativeModeTab("mangotechtool") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.APATITE_PAXEL.get());
        }
    };

    public static final CreativeModeTab MANGO_ARMOURS = new CreativeModeTab("mangotecharmour") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.AQUAMARINE_CHESTPLATE.get());
        }
    };

}
