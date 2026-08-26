package dev.reedworkmc.examples.fiveminuteeventlistener.events;

import dev.reedworkmc.reedwork.annotation.EventListener;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

@EventListener
public class PlayerJoinServerEventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(Component.text("Hello Reedwork!"));
    }
}
