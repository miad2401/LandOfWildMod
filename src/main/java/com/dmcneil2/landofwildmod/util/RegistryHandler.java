package com.dmcneil2.landofwildmod.util;

import com.dmcneil2.landofwildmod.blocks.BlockItemBase;
import com.dmcneil2.landofwildmod.blocks.GlowplasBlock;
import com.dmcneil2.landofwildmod.blocks.PlasBlock;
import com.dmcneil2.landofwildmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.dmcneil2.landofwildmod.LandOfWildMod.MOD_ID;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MOD_ID);

    public static void init(){
        registerItems();
        registerBlocks();
    }

    private static void registerBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static void registerItems() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> PLAS = ITEMS.register("plas", ItemBase::new);
    public static final RegistryObject<Item> GLOWPLAS = ITEMS.register("glowplas", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> PLAS_BLOCK = BLOCKS.register("plas_block", PlasBlock::new);
    public static final RegistryObject<Block> GLOWPLAS_BLOCK = BLOCKS.register("glowplas_block", GlowplasBlock::new);

    // Block Items
    public static final RegistryObject<Item> PLAS_BLOCK_ITEM = ITEMS.register("plas_block", () -> new BlockItemBase(PLAS_BLOCK.get()));
    public static final RegistryObject<Item> GLOWPLAS_BLOCK_ITEM = ITEMS.register("glowplas_block", () -> new BlockItemBase(GLOWPLAS_BLOCK.get()));
}
