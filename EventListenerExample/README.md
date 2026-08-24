# Event Listener Example

A minimal example demonstrating automatic Bukkit/Paper event listener registration with Reedwork.

> **Prerequisite:** Reedwork must be installed in your local Maven repository. See the Installation guide for details.

## What it demonstrates
- `@EventListener`
- Automatic listener discovery
- Automatic Bukkit/Paper event registration
- Handling multiple Bukkit events in a single listener

## Example

Reedwork automatically discovers and registers the listener.
When a player joins or leaves the server, Reedwork invokes the corresponding event handler.

## Running

Build the plugin:

`mvn clean package`

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server and start the server.