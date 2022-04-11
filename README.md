# Introduction

## Core Engineering Practices Conference exercise

To start, run through the "Getting Started" steps below for either Java or Javascript (whichever you are most comfortable working with).

_This workshop assumes that you're using a Macbook. Steps will vary for Windows and Linux users._

# Getting Started: Java

First, you will need:

- Java 9 or later
  - `brew install openjdk`
- A Java IDE (like IntelliJ)
  - `brew install --cask intellij-idea-ce`
- gradle
  - `brew install gradle`

Clone this repository, then use `gradle` to build the project.
```sh
$ cd path/to/cep-conference
cep-conference$ ./gradlew build
```

# Getting Started: Javascript

First, you will need:

- Node.js 10 or newer
  - `brew install node`
- A Javascript IDE (like Visual Studio Code)
  - `brew install --cask visual-studio-code`

Clone this repository, then use `npm` to build the project.
```sh
$ cd path/to/cep-conference
cep-conference$ npm install
cep-conference$ npm test
```
