package dev.reedworkmc.examples.fiveminuteeventlistener;

import dev.reedworkmc.reedwork.Reedwork;
import org.bukkit.plugin.java.JavaPlugin;

public final class FiveMinuteEventListener extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Reedwork.create(this).scan("dev.reedworkmc.examples.fiveminuteeventlistener");
    }
}
