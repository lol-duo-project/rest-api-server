package com.lolduo.restapiserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestApiServerApplication

fun main(args: Array<String>) {
    runApplication<RestApiServerApplication>(*args)
}
