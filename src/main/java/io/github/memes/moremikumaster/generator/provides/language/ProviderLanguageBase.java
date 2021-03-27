package io.github.memes.moremikumaster.generator.provides.language;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.data.LanguageProvider;

public abstract class ProviderLanguageBase extends LanguageProvider {
    private String modid;

    public ProviderLanguageBase(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
        this.modid = modid;
    }

    public void add(String id, String title, String description) {
        add("advancement." + this.modid + "." + id + ".title", title);
        add("advancement." + this.modid + "."  + id + ".description", description);
    }

    public void add(ItemGroup group, String name) {
        add("itemGroup." + group.getPath(), name);
    }
}
