# Spring Shell Getting Started

The Spring Shell project provides an interactive shell that allows you to plugin your own custom commands using a Spring based programming model.

- [Spring Shell](https://projects.spring.io/spring-shell)

## Description
### Dependency
```
dependencies {
	implementation("org.springframework.shell:spring-shell-starter:2.0.1.RELEASE")
}
```

### Spring Shell
Users of the Spring Shell project can easily build a full featured shell application by depending on the Spring Shell jars and adding their own commands (which come as methods on spring beans). 

#### `@ShellComponent`
a variation of @Component that is used to restrict the set of classes that are scanned for candidate commands

#### `@ShellMethod`
@ShellMethod annotation over the method signature to activate Spring Shell and declare the help text that users will see if they type help

#### Removing Test
- [Remove the sample integration test](https://docs.spring.io/spring-shell/docs/current-SNAPSHOT/reference/htmlsingle/#_adding_a_dependency_on_spring_shell)

Given that Spring Shell will kick in and start the REPL by virtue of this dependency being present, you’ll need to either build skipping tests (-DskipTests) throughout this tutorial or remove the sample integration test that was generated by start.spring.io. If you don’t do so, the integration test will create the Spring ApplicationContext and, depending on your build tool, will stay stuck in the eval loop or crash with a NPE.

### Run Spring Shell
#### Build
```
$ ./gradlew clean build
```

#### Run
```
$ java -jar build/libs/spring-shell-gs-0.0.1-SNAPSHOT.jar
```

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.6.RELEASE)

2020-04-23 07:30:25.702  INFO 93477 --- [           main] c.g.shinyay.SpringShellGsApplicationKt   : Starting SpringShellGsApplicationKt on shinyay.local with PID 93477 (/Users/shinyay/works/spring/spring-shell-getting-started/spring/build/libs/spring-shell-gs-0.0.1-SNAPSHOT.jar started by shinyay in /Users/shinyay/works/spring/spring-shell-getting-started/spring)
2020-04-23 07:30:25.714  INFO 93477 --- [           main] c.g.shinyay.SpringShellGsApplicationKt   : No active profile set, falling back to default profiles: default
2020-04-23 07:30:27.414  INFO 93477 --- [           main] c.g.shinyay.SpringShellGsApplicationKt   : Started SpringShellGsApplicationKt in 2.581 seconds (JVM running for 3.18)
```

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
