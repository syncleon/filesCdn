package com.inhouse.cdn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ImageCdnApp

fun main(args: Array<String>) {
	runApplication<ImageCdnApp>(*args)
}
