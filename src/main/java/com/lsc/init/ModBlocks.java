package com.lsc.init;

import com.lsc.LootSlashConquer;
import com.lsc.blocks.BlockDungeonBrick;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModBlocks 
{
	public static final Block DUNGEON_BRICK = new BlockDungeonBrick(Material.ROCK, "dungeon_brick");
	
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(DUNGEON_BRICK);
		LootSlashConquer.LOGGER.info("Registering Blocks!");
	}
	
	@SubscribeEvent
	public void registerItemBlocks(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new ItemBlock(DUNGEON_BRICK).setRegistryName(DUNGEON_BRICK.getRegistryName()));
	}
}