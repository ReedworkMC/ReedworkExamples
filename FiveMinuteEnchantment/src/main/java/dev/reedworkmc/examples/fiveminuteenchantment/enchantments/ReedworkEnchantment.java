package dev.reedworkmc.examples.fiveminuteenchantment.enchantments;

import dev.reedworkmc.reedwork.annotation.Enchantment;
import dev.reedworkmc.reedwork.enchantment.CustomEnchantment;
import io.papermc.paper.registry.data.EnchantmentRegistryEntry;
import io.papermc.paper.registry.keys.tags.ItemTypeTagKeys;
import io.papermc.paper.registry.tag.TagKey;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemType;

@Enchantment("reedworkinfiveminutes")
public class ReedworkEnchantment implements CustomEnchantment {

    @Override
    public Component description() {
        return Component.text("Reedwork in 5 Minutes");
    }

    @Override
    public TagKey<ItemType> supportedItems() {
        return ItemTypeTagKeys.ENCHANTABLE_ARMOR;
    }

    @Override
    public int anvilCost() {
        return 1;
    }

    @Override
    public int maxLevel() {
        return 1;
    }

    @Override
    public int weight() {
        return 1;
    }

    @Override
    public EnchantmentRegistryEntry.EnchantmentCost minimumCost() {
        return EnchantmentRegistryEntry.EnchantmentCost.of(1, 5);
    }

    @Override
    public EnchantmentRegistryEntry.EnchantmentCost maximumCost() {
        return EnchantmentRegistryEntry.EnchantmentCost.of(1, 7);
    }

    @Override
    public EquipmentSlotGroup activeSlots() {
        return EquipmentSlotGroup.ARMOR;
    }
}
