# Quickstart Example

A minimal example demonstrating Reedwork's core features including automatic command registration, custom enchantment registration, event listener discovery, and dependency injection.

> **Prerequisite:** Reedwork must be installed in your local Maven repository. See the Installation guide for details.

## What it demonstrates

- `@Command`
- `@CommandHandler`
- `@SubCommand`
- Automatic command discovery
- Automatic command registration
- Command aliases
- Command descriptions
- Permission support
- Command cooldowns
- Automatic parameter resolution
- Hierarchical command structure
- Constructor-based dependency injection
- `@Singleton`
- Automatic singleton discovery
- `@EventListener`
- Automatic event listener discovery
- Automatic Bukkit/Paper event registration
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

The example creates a custom item containing a custom enchantment called `reedwork`.

The `ReedworkEnchantment` class defines the enchantment metadata and is automatically discovered by Reedwork. Reedwork handles its registration with Paper's enchantment registry API.

The `ReedworkItemManager` class creates and manages the custom item. It is discovered automatically as a singleton and injected into other classes using constructor injection.

The `PlayerJoinServerEvent` listener gives every joining player a Reedwork item automatically. Reedwork discovers the listener and registers it with Bukkit.

The `HelloCommand` class demonstrates Reedwork's command system. It defines a command with aliases, permissions, cooldowns, and automatic parameter resolution.

The command supports:
- `/helloreedwork` to give the executing player a Reedwork item.
- `/helloreedwork <target>` to give another player a Reedwork item.

The `QuickstartExample` plugin class provides the required Paper plugin entry point. The `QuickstartExampleBootstrap` class initializes Reedwork during Paper's bootstrap phase.

No additional registration code is required.

## Running

Build the plugin:

`mvn clean package`

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server and start the server.

The command, enchantment, event listener, and singleton service will be discovered and registered automatically by Reedwork.