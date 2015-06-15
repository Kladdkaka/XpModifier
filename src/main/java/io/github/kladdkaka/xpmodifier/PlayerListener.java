package io.github.kladdkaka.xpmodifier;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class PlayerListener implements Listener {
	
	public PlayerListener(XpModifier plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void PlayerExpChangeEvent(PlayerExpChangeEvent e) {
		Player p  = e.getPlayer();
		int levels = p.getLevel();
		int amount = e.getAmount();
		float exp = p.getExp();
		Bukkit.broadcastMessage("aye" + Integer.toString(levels) + Integer.toString(amount) + Float.toString(exp));
		
		if (p.hasPermission("xpmodifier.2")) {
			e.setAmount(e.getAmount()*2);
		} else if (p.hasPermission("xpmodifier.3")) {
			e.setAmount(e.getAmount()*3);
			
		}
	}
}
