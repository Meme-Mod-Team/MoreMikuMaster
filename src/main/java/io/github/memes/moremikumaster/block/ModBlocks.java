package io.github.memes.moremikumaster.block;

import io.github.memes.moremikumaster.MoreMikuMaster;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(
            ForgeRegistries.BLOCKS, MoreMikuMaster.MODID);

    public static final RegistryObject<Block> MIKUMASTER_ORE = REGISTRY.register("mikumaster_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .hardnessAndResistance(3.0f)));

    public ModBlocks(IEventBus bus) {
        REGISTRY.register(bus);
    }
}
