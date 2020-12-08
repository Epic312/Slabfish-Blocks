package com.evoslab.slabfishblocks.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;

public class SlabfishSlabBlock extends SlabBlock {
    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;

    public SlabfishSlabBlock(AbstractBlock.Properties builder) {
        super(builder);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        //return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());

        BlockPos blockpos = context.getPos();
        BlockState blockstate = context.getWorld().getBlockState(blockpos);
        if (blockstate.isIn(this)) {
            return blockstate.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, Boolean.valueOf(false)).with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
        } else {
            FluidState fluidstate = context.getWorld().getFluidState(blockpos);
            BlockState blockstate1 = this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.valueOf(fluidstate.getFluid() == Fluids.WATER)).with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());;
            Direction direction = context.getFace();
            return direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(TYPE, SlabType.TOP);
        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
        super.fillStateContainer(builder);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(HORIZONTAL_FACING, rot.rotate(state.get(HORIZONTAL_FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(HORIZONTAL_FACING)));
    }
}
