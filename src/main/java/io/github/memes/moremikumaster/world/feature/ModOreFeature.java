package io.github.memes.moremikumaster.world.feature;

import io.github.memes.moremikumaster.block.ModBlocks;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModOreFeature {
    public static final ConfiguredFeature<?, ?> MIKUMASTER_ORE = new ConfiguredFeature<>(
            new OreFeature(OreFeatureConfig.CODEC),
            new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    ModBlocks.MIKUMASTER_ORE.get().getDefaultState(),
                    6)
            ).
            range(30).
            func_242731_b(7);
}
