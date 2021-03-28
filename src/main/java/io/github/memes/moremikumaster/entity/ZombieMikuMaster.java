package io.github.memes.moremikumaster.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class ZombieMikuMaster extends ZombieEntity {
    public ZombieMikuMaster(EntityType<? extends ZombieEntity> type, World worldIn) {
        super(type, worldIn);
    }

    static {
        GlobalEntityTypeAttributes.put(ModEntities.ZOMBIE_MIKUMASTER.get(), ZombieEntity.func_234342_eQ_().create());
    }
}
