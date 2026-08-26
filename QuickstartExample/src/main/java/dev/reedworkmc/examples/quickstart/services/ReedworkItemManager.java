package dev.reedworkmc.examples.quickstart.services;

import dev.reedworkmc.reedwork.annotation.Singleton;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@Singleton
public final class ReedworkItemManager {

    private final ItemStack reedworkItem = createReedworkItem();

    private ItemStack createReedworkItem() {
        ItemStack reedworkItem = new ItemStack(Material.PAPER);
        ItemMeta meta = reedworkItem.getItemMeta();

        Enchantment reedworkEnchantment = Enchantment.getByName("reedwork");
        meta.addEnchant(reedworkEnchantment, 1, false);

        reedworkItem.setItemMeta(meta);
        return reedworkItem;
    }

    public ItemStack getReedworkItem() {
        return reedworkItem.clone();
    }
}
