package me.Blume.Plugin;


import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Move(), this);
		getServer().getPluginManager().registerEvents(new BlockBreak(), this);
		getServer().getPluginManager().registerEvents(new Touch(), this);
	}
	@Override
	public void onDisable() {
		
	}
	
	
	
}
