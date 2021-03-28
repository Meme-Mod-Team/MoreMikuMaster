package io.github.memes.moremikumaster;

import io.github.memes.moremikumaster.block.ModBlocks;
import io.github.memes.moremikumaster.entity.ModEntities;
import io.github.memes.moremikumaster.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value = MoreMikuMaster.MODID)
public class MoreMikuMaster {
    public static final String MODID = "more_mikumaster";
    public static final String NAME = "MoreMikuMaster";
    public static final String MC_VERSION = "1.16.4";
    public static final String MOD_VERSION = "1.1.0";
    public static final String VERSION = MC_VERSION + "-" + MOD_VERSION;

    private static MoreMikuMaster INSTANCE = null;

    private final Logger logger = LogManager.getLogger(MoreMikuMaster.NAME);

    public MoreMikuMaster() {
        INSTANCE = this;

        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
        bus.addListener(this::setupServer);

        new ModBlocks(bus);
        new ModItems(bus);
        new ModEntities(bus);
    }

    public static MoreMikuMaster getInstance() {
        return INSTANCE;
    }

    private void setup(final FMLCommonSetupEvent event) {
        logger.info("Hello Minecraft!");
    }

    private void setupClient(final FMLClientSetupEvent event) {
    }

    private void setupServer(final FMLDedicatedServerSetupEvent event) {
    }

    public static Logger getLogger() {
        return INSTANCE.logger;
    }
}