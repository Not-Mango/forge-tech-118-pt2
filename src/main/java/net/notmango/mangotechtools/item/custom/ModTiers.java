package net.notmango.mangotechtools.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.notmango.mangotechtools.item.ModItems;

public class ModTiers {

    public static final ForgeTier AQUAMARINE = new ForgeTier(2,500,6f,
            2f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.AQUAMARINE.get()));

    public static final ForgeTier APATITE = new ForgeTier(2,500,6f,
            2f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.APATITE.get()));

    public static final ForgeTier TOPAZ = new ForgeTier(2,500,6f,
            2f, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TOPAZ.get()));
}
