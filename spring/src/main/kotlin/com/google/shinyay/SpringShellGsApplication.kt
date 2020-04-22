package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod

@ShellComponent
@SpringBootApplication
class SpringShellGsApplication {
	@ShellMethod("Sample Command")
	fun helloWorld(): String = "Hello World"
}

fun main(args: Array<String>) {
	runApplication<SpringShellGsApplication>(*args)
}