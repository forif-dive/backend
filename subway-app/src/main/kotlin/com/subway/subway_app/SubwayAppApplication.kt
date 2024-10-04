package com.subway.subway_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SubwayAppApplication

fun main(args: Array<String>) {
	runApplication<SubwayAppApplication>(*args)
}
