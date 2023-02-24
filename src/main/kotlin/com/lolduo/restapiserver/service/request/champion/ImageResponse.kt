package com.lolduo.restapiserver.service.request.champion
data class ImageResponse(
    val full: String,
    val sprite: String,
    val group: String,
    val x: Int,
    val y: Int,
    val w: Int,
    val h: Int
)
