package dev.reedworkmc.examples.quickstart;

import dev.reedworkmc.reedwork.Reedwork;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuickstartExample extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Reedwork.create(this)
                .scan("dev.reedworkmc.examples.quickstart");
    }
}
