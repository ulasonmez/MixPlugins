package me.Blume.Plugin;


import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin implements CommandExecutor,Listener{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Move(), this);
		getServer().getPluginManager().registerEvents(new BlockBreak(), this);
		getServer().getPluginManager().registerEvents(new Touch(), this);
		getServer().getPluginManager().registerEvents(new CustomItems(), this);
		getCommand("flyspeed").setExecutor(new flyspeed(this));
	}
	@Override
	public void onDisable() {
		
	}
	
	
	
}
