package io.github.memes.moremikumaster.generator.provides;

import io.github.memes.moremikumaster.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.Direction;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ProviderBlockState extends BlockStateProvider {
    public ProviderBlockState(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }

    protected void simpleBlock(Block block, String texture) {
        simpleBlock(block, models().cubeAll("block/" + texture, modLoc("blocks/" + texture)));
    }

    protected void crossBlock(Block block, String texture) {
        simpleBlock(block, models().cross("block/" + texture, modLoc("blocks/" + texture)));
    }

    protected void blockTreeLog(Block block, String side, String end) {
        axisBlock((RotatedPillarBlock) block, modLoc("blocks/" + side), modLoc("blocks/" + end));
    }

    protected void blocksTreeTrunkAndPlank(Block trunk, Block trunkStripped, Block trunkBark, Block trunkStrippedBark,
                                           Block plankBlock, String side, String stripped, String end, String plank) {
        blockTreeLog(trunk, side, end);
        blockTreeLog(trunkStripped, stripped, end);
        simpleBlock(trunkBark, side);
        simpleBlock(trunkStrippedBark, stripped);
        simpleBlock(plankBlock, plank);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.MIKUMASTER_ORE.get());
    }
}
