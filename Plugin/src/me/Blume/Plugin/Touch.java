package me.Blume.Plugin;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Touch implements Listener{
	@EventHandler
	public void touchEmerald(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();
		Block block =  event.getClickedBlock();
		if(action.equals(Action.LEFT_CLICK_BLOCK)) {
			if(block.getType()==Material.EMERALD_BLOCK) {
				player.setHealth(player.getHealth()+3);
			}
		}
		
		
		
	}
	
}
