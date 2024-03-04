package org.bukkit.craftbukkit.block.impl;

import io.papermc.paper.generated.GeneratedFrom;
import net.minecraft.world.level.block.PointedDripstoneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DripstoneThickness;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.PointedDripstone;
import org.bukkit.craftbukkit.block.data.CraftBlockData;

@GeneratedFrom("1.20.4")
@SuppressWarnings("unused")
public class CraftPointedDripstone extends CraftBlockData implements PointedDripstone {
    private static final EnumProperty<DripstoneThickness> THICKNESS = PointedDripstoneBlock.THICKNESS;

    private static final DirectionProperty TIP_DIRECTION = PointedDripstoneBlock.TIP_DIRECTION;

    private static final BooleanProperty WATERLOGGED = PointedDripstoneBlock.WATERLOGGED;

    public CraftPointedDripstone(BlockState state) {
        super(state);
    }

    @Override
    public PointedDripstone.Thickness getThickness() {
        return this.get(THICKNESS, PointedDripstone.Thickness.class);
    }

    @Override
    public void setThickness(final PointedDripstone.Thickness thickness) {
        this.set(THICKNESS, thickness);
    }

    @Override
    public BlockFace getVerticalDirection() {
        return this.get(TIP_DIRECTION, BlockFace.class);
    }

    @Override
    public void setVerticalDirection(final BlockFace blockFace) {
        this.set(TIP_DIRECTION, blockFace);
    }

    @Override
    public boolean isWaterlogged() {
        return this.get(WATERLOGGED);
    }

    @Override
    public void setWaterlogged(final boolean waterlogged) {
        this.set(WATERLOGGED, waterlogged);
    }
}