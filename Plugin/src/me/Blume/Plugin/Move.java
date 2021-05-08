package me.Blume.Plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class Move implements Listener{
	
	int a = 0;
	@EventHandler
	public void onMove(PlayerMoveEvent pMove) {
		Player player = pMove.getPlayer();
		ItemStack item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE,1);
		Inventory inv = player.getInventory();
		
		a++;
		if(a%100==0) {
			player.sendMessage(ChatColor.GREEN+"You got Enchanted Golden Apple!");
			inv.addItem(item);
			return;
		}
	}

}