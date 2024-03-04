package org.bukkit.craftbukkit.block.impl;

import io.papermc.paper.generated.GeneratedFrom;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Directional;
import org.bukkit.craftbukkit.block.data.CraftBlockData;

@GeneratedFrom("1.20.4")
@SuppressWarnings("unused")
public class CraftShulkerBox extends CraftBlockData implements Directional {
    private static final DirectionProperty FACING = ShulkerBoxBlock.FACING;

    public CraftShulkerBox(BlockState state) {
        super(state);
    }

    @Override
    public BlockFace getFacing() {
        return this.get(FACING, BlockFace.class);
    }

    @Override
    public void setFacing(final BlockFace blockFace) {
        this.set(FACING, blockFace);
    }
}