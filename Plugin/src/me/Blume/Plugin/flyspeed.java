package me.Blume.Plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flyspeed implements CommandExecutor {
	private Main plugin;
	public flyspeed(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equals("flyspeed") && sender instanceof Player) {
			Player player = (Player) sender;
			int speed = Integer.parseInt(args[0]);
			player.setAllowFlight(true);
			player.setFlying(true);
			player.setFlySpeed((float) speed/10);
		}
		return false;
	}
}
