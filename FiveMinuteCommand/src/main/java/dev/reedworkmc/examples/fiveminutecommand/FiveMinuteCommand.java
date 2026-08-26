package dev.reedworkmc.examples.fiveminutecommand;

import dev.reedworkmc.reedwork.Reedwork;
import org.bukkit.plugin.java.JavaPlugin;

public final class FiveMinuteCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Reedwork.create(this).scan("dev.reedworkmc.examples.fiveminutecommand");
    }
}
