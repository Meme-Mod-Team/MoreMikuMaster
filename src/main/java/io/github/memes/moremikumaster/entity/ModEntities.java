package io.github.memes.moremikumaster.entity;

import io.github.memes.moremikumaster.MoreMikuMaster;
import io.github.memes.moremikumaster.item.ModSpawnEggItem;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MoreMikuMaster.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MoreMikuMaster.MODID);
    public static final RegistryObject<EntityType<CaveSpiderMikuMaster>> CAVE_SPIDER_MIKUMASTER = REGISTRY.register("cave_spider_mikumaster",
            () -> EntityType.Builder.create(CaveSpiderMikuMaster::new, EntityClassification.MISC)
                    .size(0.7f, 0.5F)
                    .trackingRange(8)
                    .build("arrow"));
    public static final RegistryObject<EntityType<ZombieMikuMaster>> ZOMBIE_MIKUMASTER = REGISTRY.register("zombie_mikumaster",
            () -> EntityType.Builder.create(ZombieMikuMaster::new, EntityClassification.MISC)
                    .size(0.6F, 1.95F)
                    .trackingRange(8)
                    .build("arrow"));

    @SubscribeEvent
    public static void BindRenderer(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(CAVE_SPIDER_MIKUMASTER.get(), CaveSpiderMikuMasterRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ZOMBIE_MIKUMASTER.get(), ZombieMikuMasterRenderer::new);
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initEggs();
    }

    public ModEntities(IEventBus bus) {
        REGISTRY.register(bus);
    }
}
