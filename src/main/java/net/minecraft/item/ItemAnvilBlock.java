package net.minecraft.item;

import net.minecraft.block.Block;

public class ItemAnvilBlock extends ItemMultiTexture
{
    

    public ItemAnvilBlock(Block p_i1826_1_)
    {
        super(p_i1826_1_, p_i1826_1_, new String[] {"intact", "slightlyDamaged", "veryDamaged"});
    }

    /**
     * Converts the given ItemStack damage value into a metadata value to be placed in the world when this Item is
     * placed as a Block (mostly used with ItemBlocks).
     */
    public int getMetadata(int damage)
    {
        return damage << 2;
    }
}
