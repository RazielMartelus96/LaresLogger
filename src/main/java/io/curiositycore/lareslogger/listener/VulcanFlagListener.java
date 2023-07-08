package io.curiositycore.lareslogger.listener;


import me.frep.vulcan.api.event.VulcanFlagEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

public class VulcanFlagListener implements Listener {
    @EventHandler
    public void onFlaggedPlayer(VulcanFlagEvent vulcanFlagEvent){
        Bukkit.getLogger().info("TEST1");
        UUID uuid = vulcanFlagEvent.getPlayer().getUniqueId();
        String flagInfo = vulcanFlagEvent.getInfo();
        long timestamp = vulcanFlagEvent.getTimestamp();
        Bukkit.getLogger().info("Test");
        Bukkit.getLogger().info(flagInfo);
        Bukkit.getLogger().info(Long.toString(timestamp));
        Bukkit.getLogger().info("flagInfo: "+ flagInfo + " TimeStamp: " + Long.toString(timestamp));

    }
}
