package io.github.memes.moremikumaster.generator.provides;

import io.github.memes.moremikumaster.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ProviderItemModel extends ItemModelProvider {
    public static final ModelFile.UncheckedModelFile GENERATED =
            new ModelFile.UncheckedModelFile("item/generated");

    public static final ModelFile.UncheckedModelFile TEMPLATE_SPAWN_EGG = new ModelFile.UncheckedModelFile("item/template_spawn_egg");

    private ModelFile getModel(String loc) {
        return new ModelFile.UncheckedModelFile(new ResourceLocation(modid, loc));
    }

    protected ItemModelBuilder simpleItem(Item item, ResourceLocation texture) {
        return singleTexture(item.getRegistryName().getPath(), mcLoc("generated"), "layer0", texture);
    }

    protected ItemModelBuilder simpleItem(Item item) {
        return this.simpleItem(item, modLoc("item/" + item.getRegistryName().getPath()));
    }

    protected ItemModelBuilder simpleBlockItem(Item blockItem) {
        return getBuilder(blockItem.getRegistryName().getPath()).parent(getModel("block/" + blockItem.getRegistryName().getPath()));
    }

    public ProviderItemModel(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.MIKUMASTER.get());
        simpleItem(ModItems.GRASS_MIKUMASTER.get());
        simpleItem(ModItems.WOOD_MIKUMASTER.get());
        simpleItem(ModItems.STONE_MIKUMASTER.get());

        simpleBlockItem(ModItems.MIKUMASTER_ORE.get());
    }
}
