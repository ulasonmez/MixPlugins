package me.Blume.Plugin;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;


public class CustomItems implements Listener {

	public void diamondsword(Player player) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.RED+"Allmighty");
		ArrayList<String> lore =new ArrayList<String>();
		lore.add("God's sword");
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 30);
		item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 30);
		player.getInventory().addItem(item);
	}
	
	
}
