package com.epic312.slabfish_block;

import com.teamabnormals.abnormals_core.common.blocks.DirectionalVerticalSlabBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlabfishBlock.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlabfishBlockBlocks {
    public static final RegistryHelper HELPER = SlabfishBlock.REGISTRY_HELPER;

    public static final RegistryObject<Block> SLABFISH_BLOCK = HELPER.createBlock("slabfish_block", ()->new CommonSlabfishBlock(AbstractBlock.Properties.from(Blocks.SLIME_BLOCK)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> SLABFISH_SLAB = HELPER.createBlock("slabfish_slab", ()->new SlabfishSlabBlock(AbstractBlock.Properties.from(Blocks.SLIME_BLOCK)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> SLABFISH_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "slabfish_vertical_slab", ()->new DirectionalVerticalSlabBlock(AbstractBlock.Properties.from(Blocks.SLIME_BLOCK)), ItemGroup.DECORATIONS);
}
