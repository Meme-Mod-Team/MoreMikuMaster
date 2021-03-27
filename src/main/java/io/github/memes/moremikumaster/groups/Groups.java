package io.github.memes.moremikumaster.groups;

import io.github.memes.moremikumaster.MoreMikuMaster;
import io.github.memes.moremikumaster.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Groups {
    public static final ItemGroup group = new ItemGroup(MoreMikuMaster.MODID + ".more_mikumaster") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.MIKUMASTER.get());
        }
    };
}
