package net.notmango.mangotechtools.world.feature;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.notmango.mangotechtools.MangoTechTools;
import net.notmango.mangotechtools.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = MangoTechTools.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }
}
