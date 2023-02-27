package com.lolduo.restapiserver.service.request.champion

data class InfoResponse(
    val attack: Int,
    val defense: Int,
    val magic: Int,
    val difficulty: Int
)