# Contributing to Reedwork Examples

Thank you for your interest in contributing to Reedwork Examples! ❤️

This repository contains small, focused example projects demonstrating how Reedwork can be used to build PaperMC plugins.

Contributions are welcome, especially new examples, improvements to existing examples, documentation improvements, and bug fixes.

## Getting Started

1. Fork the repository.
2. Clone your fork locally.
3. Create a new branch for your changes.
4. Make your changes.
5. Make sure the affected example builds successfully.
6. Test the example on a PaperMC server where appropriate.
7. Open a pull request.

Please keep pull requests focused on a single example or a clearly related set of changes whenever possible.

## Adding an Example

New examples should demonstrate a specific Reedwork feature or concept.

Examples should be:

- small and focused;
- independently buildable;
- easy to understand;
- representative of a realistic use case;
- documented with a short README.

Avoid creating large example projects that combine many unrelated Reedwork features.
 The goal of this repository is to provide simple examples that developers can understand and adapt individually.

### Example Structure

A typical example should follow a structure similar to:

```
    example-name/
    ├── README.md
    ├── pom.xml
    └── src/
        └── main/
            ├── java/
            └── resources/
```

The example should include everything necessary to build and understand it,
except for Reedwork itself.

## Documentation

Each example should include a README explaining:

- what the example demonstrates;
- which Reedwork features are used;
- how to build and run the example;
- any relevant prerequisites.

Installation instructions for Reedwork itself should not be duplicated in
individual examples.

Instead, link to the official Reedwork documentation.

## Pull Requests

Before submitting a pull request, please make sure that:

- the affected example builds successfully;
- the example works as described;
- the README is up to date;
- the changes are focused;
- no unrelated files or changes are included.

Please use a clear and descriptive pull request title.

## Code Style

Please follow the existing code style and conventions used throughout the
repository.

Examples should favor clarity and simplicity over unnecessary abstractions.

Avoid introducing dependencies that are not required for the example being
demonstrated.

## Commit Messages

Please use clear and descriptive commit messages.

For example:

    Add command registration example

instead of:

    add example

There is currently no strict commit message format required.

## Bug Reports

If an example does not build, does not work as documented, or contains
incorrect information, please open an issue.

Please include:

- the name of the affected example;
- the Reedwork version;
- the PaperMC version;
- the Java version;
- relevant error messages or stack traces;
- steps to reproduce the problem.

## Questions and Discussions

If you are unsure whether an example belongs in this repository, feel free
to open an issue or start a discussion before implementing it.

For larger examples or significant changes, discussing the approach first
can help keep the repository consistent.

## License

By contributing to Reedwork Examples, you agree that your contributions are
licensed under the MIT License.

Copyright (c) 2026-present 0kAj