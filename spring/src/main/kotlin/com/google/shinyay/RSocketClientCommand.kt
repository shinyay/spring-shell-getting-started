package com.google.shinyay

import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod

@ShellComponent
class RSocketClientCommand() {

    @ShellMethod("Send one request and one response will be returned")
    fun hello(): Unit {
        logger.info("Hello Spring Shell")
    }
}