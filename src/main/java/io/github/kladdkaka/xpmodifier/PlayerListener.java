package io.github.kladdkaka.xpmodifier;

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

		Player p = e.getPlayer();

		if (p.hasPermission("xpmodifier.2")) {
			e.setAmount(e.getAmount() * 2);
		} else if (p.hasPermission("xpmodifier.3")) {
			e.setAmount(e.getAmount() * 3);
		} else if (p.hasPermission("xpmodifier.4")) {
			e.setAmount(e.getAmount() * 4);
		} else if (p.hasPermission("xpmodifier.5")) {
			e.setAmount(e.getAmount() * 5);
		} else if (p.hasPermission("xpmodifier.6")) {
			e.setAmount(e.getAmount() * 6);
		} else if (p.hasPermission("xpmodifier.7")) {
			e.setAmount(e.getAmount() * 7);
		} else if (p.hasPermission("xpmodifier.8")) {
			e.setAmount(e.getAmount() * 8);
		} else if (p.hasPermission("xpmodifier.9")) {
			e.setAmount(e.getAmount() * 9);
		} else if (p.hasPermission("xpmodifier.10")) {
			e.setAmount(e.getAmount() * 10);
		}
	}
}
