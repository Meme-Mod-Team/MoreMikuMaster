package io.github.memes.moremikumaster.item;

import io.github.memes.moremikumaster.MoreMikuMaster;
import io.github.memes.moremikumaster.block.ModBlocks;
import io.github.memes.moremikumaster.groups.Groups;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(
            ForgeRegistries.ITEMS, MoreMikuMaster.MODID);

    public static final RegistryObject<Item> MIKUMASTER = REGISTRY.register("mikumaster",
            () -> new Item(new Item.Properties().group(Groups.group)));

    public static final RegistryObject<Item> WOOD_MIKUMASTER = REGISTRY.register("wood_mikumaster",
            () -> new Item(new Item.Properties().group(Groups.group)));

    public static final RegistryObject<Item> STONE_MIKUMASTER = REGISTRY.register("stone_mikumaster",
            () -> new Item(new Item.Properties().group(Groups.group)));

    public static final RegistryObject<Item> GRASS_MIKUMASTER = REGISTRY.register("grass_mikumaster",
            () -> new Item(new Item.Properties().group(Groups.group)));

    public static final RegistryObject<Item> MIKUMASTER_ORE = REGISTRY.register("mikumaster_ore",
            () -> new BlockItem(ModBlocks.MIKUMASTER_ORE.get(), new Item.Properties().group(Groups.group)));

    public ModItems(IEventBus bus) {
        REGISTRY.register(bus);
    }
}
