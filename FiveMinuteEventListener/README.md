# Five Minute Event Listener

A minimal tutorial example demonstrating how to create an event listener with Reedwork in five minutes.

> **Tutorial:** This example is part of the **Create a PaperMC Event Listener in 5 Minutes** tutorial.
> Follow the complete tutorial at [reedworkmc.github.io/tutorials/five-minute-event-listener](https://reedworkmc.github.io/tutorials/five-minute-event-listener).

> **Prerequisite:** Reedwork must be installed in your local Maven repository. See the Installation guide for details.

## What it demonstrates

- Creating a Reedwork event listener
- `@EventListener`
- Bukkit `@EventHandler`
- Automatic event listener discovery and registration

## Example

Reedwork automatically discovers and registers the event listener when the plugin starts.

The example provides the following behavior:

- When a player joins the server, they receive a `Hello Reedwork!` message.

The event listener is discovered by scanning the plugin package.

The listener itself is defined using `@EventListener` and standard Bukkit event handling with `@EventHandler`.

## Running

Build the plugin:

```bash
mvn clean package
```

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server and start the server.

Once the server is running, join the server.

The joining player should receive:

```text
Hello Reedwork!
```