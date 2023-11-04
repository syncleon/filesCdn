package com.inhouse.cdn.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class ImageEntity (
    @Id
    private val id: Long,
    val fileName: String,
    val fileDownloadUri: String,
    val size: String
)