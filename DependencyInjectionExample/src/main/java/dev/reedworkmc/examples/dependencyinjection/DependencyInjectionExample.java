package dev.reedworkmc.examples.dependencyinjection;

import dev.reedworkmc.examples.externallib.FileFromExternalLib;
import dev.reedworkmc.reedwork.Reedwork;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class DependencyInjectionExample extends JavaPlugin {


    private final Random random = new Random();

    @Override
    public void onEnable() {
        // Plugin startup logic
        Reedwork.create(this)

                // Singleton:
                // Creates one shared FileFromExternalLib instance.
                .bind(FileFromExternalLib.class)
                .toSingleton(new FileFromExternalLib(42))

                // Transient:
                // Creates a new FileFromExternalLib instance for each injection.
//                 .bind(FileFromExternalLib.class)
//                 .to(FileFromExternalLib.class)

                // Factory:
                // Creates a new instance using the factory whenever Reedwork resolves it.
//                .bind(FileFromExternalLib.class)
//                .toFactory(() -> new FileFromExternalLib(random.nextInt(100)))

                .scan("dev.reedworkmc.examples.dependencyinjection");
    }
}
