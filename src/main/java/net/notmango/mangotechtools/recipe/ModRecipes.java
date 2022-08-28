package net.notmango.mangotechtools.recipe;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.notmango.mangotechtools.MangoTechTools;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MangoTechTools.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ObliteratorRecipe>> OBLITERATOR_SERIALIZER =
            SERIALIZERS.register("oblit_erating", () -> ObliteratorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        Registry.register(Registry.RECIPE_TYPE, ObliteratorRecipe.Type.ID, ObliteratorRecipe.Type.INSTANCE);
    }
}
