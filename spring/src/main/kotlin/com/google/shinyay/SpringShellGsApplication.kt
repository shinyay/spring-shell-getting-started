package com.google.shinyay

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
spring/src/main/kotlin/com/google/shinyay/SpringShellGsApplication.kt
@SpringBootApplication
class SpringShellGsApplication

fun main(args: Array<String>) {
    runApplication<SpringShellGsApplication>(*args)
}

val Any.logger: Logger
    get() = LoggerFactory.getLogger(this.javaClass)