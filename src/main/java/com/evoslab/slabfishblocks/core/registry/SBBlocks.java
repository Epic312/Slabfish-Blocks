package com.evoslab.slabfishblocks.core.registry;

import com.evoslab.slabfishblocks.common.blocks.SlabfishBlock;
import com.evoslab.slabfishblocks.common.blocks.SlabfishSlabBlock;
import com.evoslab.slabfishblocks.core.SlabfishBlocks;
import com.minecraftabnormals.abnormals_core.common.blocks.DirectionalVerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlabfishBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SBBlocks {
    public static final BlockSubRegistryHelper HELPER = SlabfishBlocks.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> SLABFISH_BLOCK = HELPER.createBlock("slabfish_block", ()->new SlabfishBlock(AbstractBlock.Properties.from(Blocks.SLIME_BLOCK)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> SLABFISH_SLAB = HELPER.createBlock("slabfish_slab", ()->new SlabfishSlabBlock(AbstractBlock.Properties.from(Blocks.SLIME_BLOCK)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> SLABFISH_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "slabfish_vertical_slab", ()->new DirectionalVerticalSlabBlock(AbstractBlock.Properties.from(Blocks.SLIME_BLOCK)), ItemGroup.DECORATIONS);
}
