package com.inhouse.cdn.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "file")
data class FileStorageProperties(var uploadDir: String = "")