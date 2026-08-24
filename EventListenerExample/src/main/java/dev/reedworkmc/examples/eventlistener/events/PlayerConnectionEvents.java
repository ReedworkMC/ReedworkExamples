package dev.reedworkmc.examples.eventlistener.events;

import dev.reedworkmc.reedwork.annotation.EventListener;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

@EventListener
public final class PlayerConnectionEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.joinMessage(Component.text(player.getName() + " joined the server!", NamedTextColor.BLUE));

        player.sendMessage(Component.text("Welcome to the server " + player.getName() + "!", NamedTextColor.YELLOW));
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        event.quitMessage(Component.text(player.getName() + " left the server!", NamedTextColor.RED));
    }
}