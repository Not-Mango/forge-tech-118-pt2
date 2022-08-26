package net.notmango.mangotechtools;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.notmango.mangotechtools.block.ModBlocks;
import net.notmango.mangotechtools.block.entity.ModBlockEntities;
import net.notmango.mangotechtools.item.ModItems;
import net.notmango.mangotechtools.recipe.ModRecipes;
import net.notmango.mangotechtools.screen.ModMenuTypes;
import net.notmango.mangotechtools.screen.ObliteratorScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(MangoTechTools.MOD_ID)
public class MangoTechTools
{
    public static final String MOD_ID = "mangotechtools";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public MangoTechTools() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        // Register the enqueueIMC method for modloading

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBLITERATOR.get(), RenderType.cutout());

        MenuScreens.register(ModMenuTypes.OBLITERATOR_MENU.get(), ObliteratorScreen::new);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}