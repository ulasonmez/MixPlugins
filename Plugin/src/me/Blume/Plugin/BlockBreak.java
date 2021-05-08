package me.Blume.Plugin;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class BlockBreak implements Listener {
	Plugin plugin = Main.getPlugin(Main.class);
	@EventHandler
	public void dirtBreak(BlockBreakEvent event) {
		ItemStack diamond = new ItemStack(Material.DIAMOND,2);
		Player player = event.getPlayer();
		Location dirt = event.getBlock().getLocation();
		if(event.getBlock().getType()== Material.DIRT) {
			event.getBlock().setType(Material.AIR);
			event.getBlock().getDrops().clear();
			player.getWorld().dropItem(dirt, diamond);
			player.sendMessage(dirt.getBlockX()+" "+dirt.getBlockY()+" "+dirt.getBlockZ());
			return;
		}
		
		
	}
	@EventHandler
	public void dirtPlace(BlockPlaceEvent event) {
		ItemStack diamond = new ItemStack(Material.DIAMOND,2);
		Player player = event.getPlayer();
		Location dirt = event.getBlock().getLocation();
		if(event.getBlock().getType()== Material.DIRT) {
			event.getBlock().setType(Material.AIR);
			player.getWorld().dropItem(dirt, diamond);
			player.sendMessage(dirt.getBlockX()+" "+dirt.getBlockY()+" "+dirt.getBlockZ());
			plugin.getServer().broadcastMessage(player.getName()+event.getBlock().getType().toString().toUpperCase()+"kirdi");
			return;
		}
	}

}
