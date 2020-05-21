package com.dmcneil2.landofwildmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GlowplasBlock extends Block {

    public GlowplasBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.5f, 6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .lightValue(7));
    }
}
