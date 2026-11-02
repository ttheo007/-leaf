# Leaf

A tiny client-side Fabric mod for **Minecraft Java 26.3**.

## Command

- `/leaf` — leaves the current world or server and returns to the appropriate menu.
- If you are not connected to a server, it displays a short message instead.

Leaf registers the command on the client. It does not need to be installed on the server and does not require operator permissions.

## Requirements

- Minecraft Java 26.3
- Fabric Loader 0.19.5 or newer
- Fabric API for 26.3
- Java 25

## Build

Use Gradle 9.8.0 or newer with JDK 25:

```bash
gradle build
```

The mod JAR is created in `build/libs/`.

## Install

Put the built `leaf-1.0.0.jar` into your Minecraft instance's `mods` folder alongside Fabric API.

## License

MIT
