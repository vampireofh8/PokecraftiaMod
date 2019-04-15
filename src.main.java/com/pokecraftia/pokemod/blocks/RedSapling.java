package com.pokecraftia.pokemod.blocks;

import com.pokecraftia.pokemod.base.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RedSapling extends BlockBase {

	public RedSapling(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
