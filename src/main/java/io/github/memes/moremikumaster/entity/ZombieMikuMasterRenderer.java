package io.github.memes.moremikumaster.entity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

public class ZombieMikuMasterRenderer extends ZombieRenderer {
    private static final ResourceLocation TEXTURES = new ResourceLocation("more_mikumaster:textures/entity/zombie_mikumaster.png");

    public ZombieMikuMasterRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    public ResourceLocation getEntityTexture(ZombieEntity entity) {
        return TEXTURES;
    }
}