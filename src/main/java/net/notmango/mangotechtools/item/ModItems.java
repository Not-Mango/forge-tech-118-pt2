package net.notmango.mangotechtools.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechtools.MangoTechTools;
import net.notmango.mangotechtools.item.custom.ModTiers;
import net.notmango.mangotechtools.item.custom.PaxelItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MangoTechTools.MOD_ID);

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));



    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));



    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",

            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));



    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> APATITE = ITEMS.register("apatite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MANGO_INGOTS)));



    public static final RegistryObject<Item> APATITE_SWORD = ITEMS.register("apatite_sword",
            () -> new SwordItem(ModTiers.APATITE, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> APATITE_PICKAXE = ITEMS.register("apatite_pickaxe",
            () -> new PickaxeItem(ModTiers.APATITE,1,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> APATITE_AXE = ITEMS.register("apatite_axe",
            () -> new AxeItem(ModTiers.APATITE, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> APATITE_SHOVEL = ITEMS.register("apatite_shovel",
            () -> new ShovelItem(ModTiers.APATITE, 1.5f, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> APATITE_HOE = ITEMS.register("apatite_hoe",
            () -> new HoeItem(ModTiers.APATITE, -2, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> APATITE_PAXEL = ITEMS.register("apatite_paxel",
            () -> new PaxelItem(ModTiers.APATITE,6,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS).durability(1500)));



    public static final RegistryObject<Item> AQUAMARINE_SWORD = ITEMS.register("aquamarine_sword",
            () -> new SwordItem(ModTiers.AQUAMARINE, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> AQUAMARINE_PICKAXE = ITEMS.register("aquamarine_pickaxe",
            () -> new PickaxeItem(ModTiers.AQUAMARINE,1,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> AQUAMARINE_AXE = ITEMS.register("aquamarine_axe",
            () -> new AxeItem(ModTiers.AQUAMARINE, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> AQUAMARINE_SHOVEL = ITEMS.register("aquamarine_shovel",
            () -> new ShovelItem(ModTiers.AQUAMARINE, 1.5f, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> AQUAMARINE_HOE = ITEMS.register("aquamarine_hoe",
            () -> new HoeItem(ModTiers.AQUAMARINE, -2, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> AQUAMARINE_PAXEL = ITEMS.register("aquamarine_paxel",
            () -> new PaxelItem(ModTiers.AQUAMARINE,6,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS).durability(1500)));



    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(ModTiers.TOPAZ, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ModTiers.TOPAZ,1,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe",
            () -> new AxeItem(ModTiers.TOPAZ, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(ModTiers.TOPAZ, 1.5f, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe",
            () -> new HoeItem(ModTiers.TOPAZ, -2, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS)));

    public static final RegistryObject<Item> TOPAZ_PAXEL = ITEMS.register("topaz_paxel",
            () -> new PaxelItem(ModTiers.TOPAZ,6,-2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MANGO_TOOLS).durability(1500)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
