package dev.reedworkmc.examples.command;

import dev.reedworkmc.reedwork.Reedwork;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandExample extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Reedwork.create(this).scan("dev.reedworkmc.examples.command");
    }
}
