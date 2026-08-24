package dev.reedworkmc.examples.eventlistener;

import dev.reedworkmc.reedwork.Reedwork;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventListenerExample extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Reedwork.create(this).scan("dev.reedworkmc.examples.eventlistener");
    }
}
