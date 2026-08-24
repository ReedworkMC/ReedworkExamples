# Custom Enchantment Example

A minimal example demonstrating automatic custom enchantment registration with Reedwork.

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

The example defines a custom enchantment called `reedworkpower`.

The enchantment is supported by dirt and can be applied to any equipment slot.

Reedwork discovers the `ReedworkEnchantment` automatically and handles its registration with Paper.

The `EnchantmentExample` plugin class only exists to provide the required Paper plugin entry point. No additional plugin logic is required for this example.

## Running

Build the plugin:

`mvn clean package`

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server and start the server.

The `reedworkpower` enchantment will be registered automatically by Reedwork.