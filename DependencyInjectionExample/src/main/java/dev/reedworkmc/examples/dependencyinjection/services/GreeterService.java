package dev.reedworkmc.examples.dependencyinjection.services;

import dev.reedworkmc.reedwork.annotation.Transient;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

@Transient
public final class GreeterService {

    public void sendGreeting(Player target) {
        target.sendMessage(Component.text("Welcome to Reedwork!"));
    }
}
