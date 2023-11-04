package com.inhouse.cdn.repository

import com.inhouse.cdn.entity.ImageEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ImageRepository: JpaRepository<ImageEntity, Long>