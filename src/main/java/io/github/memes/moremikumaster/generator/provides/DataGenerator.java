package io.github.memes.moremikumaster.generator.provides;

import io.github.memes.moremikumaster.MoreMikuMaster;
import io.github.memes.moremikumaster.generator.provides.language.ProviderLanguageZHCN;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MoreMikuMaster.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(new ProviderItemModel(generator, MoreMikuMaster.MODID, helper));
            generator.addProvider(new ProviderBlockState(generator, MoreMikuMaster.MODID, helper));
        }

        if (event.includeServer()) {
            generator.addProvider(new ProviderLanguageZHCN(generator, MoreMikuMaster.MODID));
            generator.addProvider(new ProviderBlockLootTable(generator));
            generator.addProvider(new ProviderRecipe(generator));
        }
    }
}
