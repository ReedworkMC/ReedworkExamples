package dev.reedworkmc.examples.quickstart.events;

import dev.reedworkmc.examples.quickstart.services.ReedworkItemManager;
import dev.reedworkmc.reedwork.annotation.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

@EventListener
public class PlayerJoinServerEvent implements Listener {

    private final ReedworkItemManager reedworkItemManager;

    public PlayerJoinServerEvent(ReedworkItemManager reedworkItemManager) {
        this.reedworkItemManager = reedworkItemManager;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().getInventory().addItem(reedworkItemManager.getReedworkItem());
    }
}
