package io.github.memes.moremikumaster.generator.provides;

import io.github.memes.moremikumaster.block.ModBlocks;
import io.github.memes.moremikumaster.item.ModItems;
import net.minecraft.data.DataGenerator;

public class ProviderBlockLootTable extends ProviderBaseBlockLootTable {
    public ProviderBlockLootTable(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerTables() {
        getLootTables().put(ModBlocks.MIKUMASTER_ORE.get(), tableNormal("mikumaster_ore", ModItems.MIKUMASTER.get()));
    }
}
