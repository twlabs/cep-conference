# Introduction

## Core Engineering Practices Conference exercise

To start, run through the "Getting Started" steps below for either Kotlin or Javascript (whichever you are most comfortable working with).

_This workshop assumes that you're using a Macbook. Steps will vary for Windows and Linux users._

## Getting Started: Kotlin

First, you will need:

- Java 9 or later
  - `brew install openjdk`
- A Java IDE (like IntelliJ)
  - `brew install --cask intellij-idea-ce`
- gradle (optional or use ./gradlew)
  - `brew install gradle`

Clone this repository, then use `gradle` to build the project.

```sh
$ cd path/to/cep-conference/kotlin
kotlin ./gradlew test
```

## Getting Started: Javascript

First, you will need:

- Node.js 10 or newer
  - `brew install node`
- A Javascript IDE (like Visual Studio Code)
  - `brew install --cask visual-studio-code`

Clone this repository, then use `npm` to build the project.

```sh
$ cd path/to/cep-conference/javascript
javascript npm install
javascript npm test
```

## Getting Started: C#

First, you will need:

- dotnet 7 sdk
  - `brew install dotnet`
- A C# IDE (like Visual Studio Code)
  - `brew install --cask visual-studio-code`

Clone this repository, then use `dotnet` to build the project. You should see a single test failure.

```sh
$ cd path/to/cep-conference/csharp
csharp$ dotnet test
```

## Code Sharing when Pairing

If you are using VSCode, you can try [Live Sharing](https://code.visualstudio.com/learn/collaboration/live-share).

If you are using IntelliJ, you can try [Code With Me](https://plugins.jetbrains.com/plugin/14896-code-with-me)

You can also use fast git handover with ([mob.sh](https://mob.sh/)) from commandline.

```sh
mob start --branch <unique name>
```

You will need _push access_ to the repository.
