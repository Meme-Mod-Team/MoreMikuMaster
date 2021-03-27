package io.github.memes.moremikumaster.world.gen;

import io.github.memes.moremikumaster.MoreMikuMaster;
import io.github.memes.moremikumaster.world.feature.ModOreFeature;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = MoreMikuMaster.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GenOres {
    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder gen = event.getGeneration();
        RegistryKey<Biome> biome = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(event.getName(), "Who registered null name biome, naming criticism!"));

        if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OVERWORLD)) {
            gen.withFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION,
                    ModOreFeature.MIKUMASTER_ORE);
        }
    }
}
