package io.github.raisecreed.omnimail

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OmnimailApplication

fun main(args: Array<String>) {
    runApplication<OmnimailApplication>(*args)
}
