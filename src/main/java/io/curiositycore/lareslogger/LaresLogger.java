package io.curiositycore.lareslogger;

import io.curiositycore.lareslogger.listener.VulcanFlagListener;
import me.frep.vulcan.api.VulcanAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LaresLogger extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new VulcanFlagListener(),this);
        Bukkit.getLogger().info("Test");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
