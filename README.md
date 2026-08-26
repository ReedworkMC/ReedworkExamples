# Reedwork Examples

Small, focused example projects demonstrating how to use [Reedwork](https://github.com/ReedworkMC/Reedwork) to build PaperMC plugins.

Each example is a standalone project focused on a specific Reedwork feature or concept.

## Examples

| Example                                               | Description                                                                                                                                                           |
|-------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Event Listener](./EventListenerExample/)             | Automatic Bukkit/Paper event listener discovery and registration.                                                                                                     |
| [Command](./CommandExample/)                          | Annotation-based command discovery and registration with subcommands, aliases, permissions, cooldown, automatic usage generation, and automatic parameter resolution. |
| [Custom Enchantment](./EnchantmentExample/)           | Automatic custom enchantment discovery and registration using Paper's experimental enchantment registry API.                                                          |
| [Dependency Injection](./DependencyInjectionExample/) | Constructor-based dependency injection with transient, singleton, and factory bindings, including external class bindings.                                            |
| [Quickstart](./QuickstartExample/)                    | A complete example demonstrating command registration, event discovery, custom enchantments, and dependency injection working together.                               |

## Learn Reedwork in 5 Minutes

| Tutorial | Example | Description |
|---|---|---|
| [Create a PaperMC Brigadier Command](https://reedworkmc.github.io/tutorials/five-minute-command) | [Five Minute Command](./FiveMinuteCommand/) | Create your first Reedwork command using `@Command` and `@CommandHandler`, with automatic package scanning and command registration. |
| [Create a PaperMC Event Listener](https://reedworkmc.github.io/tutorials/five-minute-event-listener) | [Five Minute Event Listener](./FiveMinuteEventListener/) | Create a PaperMC event listener and let Reedwork automatically discover and register it through package scanning. |

More examples will be added over time.

## Installation

See the official [Reedwork Installation Guide](https://reedworkmc.github.io/getting-started/installation/) for instructions on installing Reedwork and configuring your development environment.

## Running an Example

Choose an example and follow its README for the specific details.

In general, examples can be built with Maven:

```
mvn clean package
```

The resulting plugin JAR can then be copied into the `plugins/` directory of a Paper server.

## Reedwork Documentation

For the complete Reedwork documentation, visit:

[https://reedworkmc.github.io/Reedwork](https://reedworkmc.github.io/Reedwork)

## Contributing

Contributions are welcome.

If you want to add a new example, keep it:

- small and focused on a single concept
- independently buildable
- easy to understand
- documented with a short README

## License

The examples in this repository are licensed under the [MIT License](./LICENSE).

Reedwork itself is licensed separately under the [GNU Lesser General Public License v3.0](https://github.com/ReedworkMC/Reedwork/blob/master/LICENSE).