package io.github.kladdkaka.xpmodifier;

import org.bukkit.plugin.java.JavaPlugin;

public class XpModifier extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("XpModifier by Xenu has been enabled!");
		new PlayerListener(this);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("XpModifier by Xenu has been disabled!");
	}
	
}
