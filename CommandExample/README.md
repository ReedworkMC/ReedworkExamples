# Command Example

A minimal example demonstrating annotation-based command registration with Reedwork.

> **Prerequisite:** Reedwork must be installed in your local Maven repository. See the Installation guide for details.

## What it demonstrates

- `@Command`
- `@CommandHandler`
- `@SubCommand`
- Command aliases
- Command descriptions
- Permission support
- Command cooldowns
- Automatic parameter resolution (using `Player` as an example)
- Hierarchical command structure

## Example

Reedwork automatically discovers and registers the command.

The example provides two command usages:

- `/helloreedwork` — sends a greeting to the executing player.
- `/helloreedwork <target>` — sends a greeting to another player.

The target player is automatically resolved from the command argument by Reedwork.

The command is also protected by the `reedwork.example.hello` permission,
has a 10-second cooldown, and provides the aliases `hellorw` and `hrw`.

## Running

Build the plugin:

`mvn clean package`

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server and start the server.

To use the command, the executing player must have the `reedwork.example.hello` permission.