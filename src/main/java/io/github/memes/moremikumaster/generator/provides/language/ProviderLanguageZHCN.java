package io.github.memes.moremikumaster.generator.provides.language;

import io.github.memes.moremikumaster.block.ModBlocks;
import io.github.memes.moremikumaster.entity.ModEntities;
import io.github.memes.moremikumaster.groups.Groups;
import io.github.memes.moremikumaster.item.ModItems;
import net.minecraft.data.DataGenerator;

public class ProviderLanguageZHCN extends ProviderLanguageBase {
    public ProviderLanguageZHCN(DataGenerator gen, String modid) {
        super(gen, modid, "zh_cn");
    }

    private void addItems() {
        add(ModItems.MIKUMASTER.get(), "米神");
        add(ModItems.GRASS_MIKUMASTER.get(), "草米神");
        add(ModItems.WOOD_MIKUMASTER.get(), "木头米神");
        add(ModItems.STONE_MIKUMASTER.get(), "石头米神");
    }

    private void addBlocks() {
        add(ModBlocks.MIKUMASTER_ORE.get(), "米神矿");
    }

    private void addGroups() {
        add(Groups.group, "更多米神");
    }

    private void addEntities() {
        add(ModEntities.CAVE_SPIDER_MIKUMASTER.get(), "洞穴蜘蛛米神");
        add(ModEntities.ZOMBIE_MIKUMASTER.get(), "僵尸米神");
    }

    @Override
    protected void addTranslations() {
        addItems();
        addBlocks();
        addGroups();
        addEntities();
    }
}
