package io.github.memes.moremikumaster.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.world.World;

public class CaveSpiderMikuMaster extends CaveSpiderEntity {
    public CaveSpiderMikuMaster(EntityType<? extends CaveSpiderEntity> type, World worldIn) {
        super(type, worldIn);
    }

    static {
        GlobalEntityTypeAttributes.put(ModEntities.CAVE_SPIDER_MIKUMASTER.get(), CaveSpiderEntity.registerAttributes().create());
    }
}
