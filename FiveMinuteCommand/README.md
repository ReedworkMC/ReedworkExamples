# Five Minute Command

A minimal tutorial example demonstrating how to create a command with Reedwork in five minutes.

> **Tutorial:** This example is part of the **Create a Brigadier Command in 5 Minutes** tutorial.
> Follow the complete tutorial at [reedworkmc.github.io/tutorials/five-minute-command](https://reedworkmc.github.io/tutorials/five-minute-command).

> **Prerequisite:** Reedwork must be installed in your local Maven repository. See the Installation guide for details.

## What it demonstrates

- Creating a Reedwork command
- `@Command`
- `@CommandHandler`
- Automatic command discovery and registration

## Example

Reedwork automatically discovers and registers the command when the plugin starts.

The example provides the following command:

* `/hello` — sends `Hello Reedwork!` to the executing player.

The command is discovered by scanning the plugin package.

The command itself is defined using `@Command` and `@CommandHandler`.

## Running

Build the plugin:

```bash
mvn clean package
```

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server and start the server.

Once the server is running, execute:

```text
/hello
```

The command should respond with:

```text
Hello Reedwork!
```
