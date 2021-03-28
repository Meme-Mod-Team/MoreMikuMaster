package io.github.memes.moremikumaster.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.SpiderModel;
import net.minecraft.util.ResourceLocation;

public class CaveSpiderMikuMasterRenderer extends MobRenderer<CaveSpiderMikuMaster, SpiderModel<CaveSpiderMikuMaster>> {
    private static final ResourceLocation TEXTURES = new ResourceLocation("more_mikumaster:textures/entity/cave_spider_mikumaster.png");

    public CaveSpiderMikuMasterRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SpiderModel<>(), 0.8F);
        this.shadowSize *= 0.7F;
    }

    protected float getDeathMaxRotation(CaveSpiderMikuMaster entityLivingBaseIn) {
        return 180.0F;
    }

    @Override
    protected void preRenderCallback(CaveSpiderMikuMaster entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(0.7F, 0.7F, 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(CaveSpiderMikuMaster entity) {
        return TEXTURES;
    }
}