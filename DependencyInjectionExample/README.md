# Dependency Injection Example

A minimal example demonstrating Reedwork's dependency injection system and different dependency binding strategies.

> **Prerequisite:** Reedwork must be installed in your local Maven repository. See the Installation guide for details.

## What it demonstrates

- Constructor-based dependency injection
- `@Transient`
- `@Singleton`
- Explicit dependency bindings
- Transient bindings with `.to(...)`
- Singleton bindings with `.toSingleton(...)`
- Factory bindings with `.toFactory(...)`
- Dependency injection into other dependencies
- Automatic parameter resolution

## Dependency Bindings

The example demonstrates three different ways to bind `FileFromExternalLib`.

Only one binding is enabled at a time in `DependencyInjectionExample`.

### Transient

```java
.bind(FileFromExternalLib.class);
.to(FileFromExternalLib.class);
```

Reedwork manages `FileFromExternalLib` as a transient dependency.

### Singleton

```java
.bind(FileFromExternalLib.class);
.toSingleton(new FileFromExternalLib(42));
```

A single, explicitly created `FileFromExternalLib` instance is shared wherever the dependency is injected.

### Factory

```java
.bind(FileFromExternalLib.class);
.toFactory(() -> new FileFromExternalLib(random.nextInt(100)));
```

The dependency is created through the provided factory.

The active example uses the factory binding. The transient and singleton bindings are available as commented alternatives in `DependencyInjectionExample`.

## Services

### `GreeterService`

`GreeterService` uses `@Transient` and is injected into `ReedworkCommand`.

It demonstrates automatic discovery and constructor injection of a Reedwork-managed service.

### `ExecuteCounter`

`ExecuteCounter` uses `@Singleton` and keeps track of how many times the command has been executed.

It also receives `FileFromExternalLib` through constructor injection, demonstrating that dependencies can themselves have dependencies.

### `FileFromExternalLib`

`FileFromExternalLib` intentionally has no Reedwork annotation.

It represents a class from an external library that is integrated into Reedwork through an explicit binding.

## Commands

The example registers the `/reedwork` command.

### `/reedwork`

Sends a greeting to the executing player and increases the execution counter by the configured amount.

### `/reedwork count`

Displays the current execution count.

### `/reedwork amount set <amount>`

Changes the amount added to the execution counter.

### `/reedwork amount get`

Displays the currently configured amount.

## Running

Build the plugin:

`mvn clean package`

Then copy the resulting JAR from `target/` into the `plugins/` directory of a Paper server and start the server.

Try the following commands:

`/reedwork`

`/reedwork count`

`/reedwork amount get`

`/reedwork amount set 5`

The execution counter will then increase by `5` for each `/reedwork` execution.

> To experiment with the different dependency binding strategies, change the active binding in `DependencyInjectionExample` and rebuild the plugin.