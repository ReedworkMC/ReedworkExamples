package dev.reedworkmc.examples.enchantment;

import dev.reedworkmc.reedwork.Reedwork;
import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;

class EnchantmentExampleBootstrap implements PluginBootstrap {

    @Override
    public void bootstrap(final BootstrapContext context) {
        // Plugin bootstrap logic
        Reedwork.bootstrap(context).scan("dev.reedworkmc.examples.enchantment");
    }
}
