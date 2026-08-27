# Five Minute Enchantment

A minimal tutorial example demonstrating how to create a custom enchantment with Reedwork in five minutes.

> **Tutorial:** This example is part of the **Create a PaperMC Custom Enchantment in 5 Minutes** tutorial.
> Follow the complete tutorial at [reedworkmc.github.io/tutorials/five-minute-enchantment](https://reedworkmc.github.io/tutorials/five-minute-enchantment).

> **Prerequisite:** Reedwork must be installed in your local Maven repository. See the Installation guide for details.

## What it demonstrates

- `@Enchantment`
- `CustomEnchantment`
- Automatic enchantment discovery
- Automatic custom enchantment registration
- Paper's experimental enchantment registry API
- Custom enchantment metadata such as:
    - Description
    - Supported items
    - Maximum level
    - Weight
    - Anvil cost
    - Enchantment costs
    - Active equipment slots

## Example

Reedwork automatically discovers and registers the custom enchantment during the Paper bootstrap phase.

The example provides the following enchantment:

- **Reedwork in 5 Minutes** — a level 1 armor enchantment with a maximum anvil cost of 1.

The enchantment is defined using `@Enchantment` and the `CustomEnchantment` interface.

The plugin uses `PluginBootstrap` because the custom enchantment is registered through Paper's registry system during the bootstrap phase.

## Running

Build the plugin:

```bash
mvn clean package
```

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server.

Start the server.

During the Paper bootstrap phase, Reedwork scans:

```text
dev.reedworkmc.examples.fiveminuteenchantment
```

and automatically discovers `ReedworkEnchantment`.

The enchantment is registered with the key:

```text
minecraft:reedworkinfiveminutes
```

The enchantment is available as an enchanted book in the Creative Inventory and can be applied to items supported by `ENCHANTABLE_ARMOR`.

To test the enchantment, hold an applicable item in your main hand and execute:

```text
/enchant @s minecraft:reedworkinfiveminutes
```
