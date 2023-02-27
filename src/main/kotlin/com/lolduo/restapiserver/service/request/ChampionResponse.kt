package com.lolduo.restapiserver.service.request

import com.lolduo.restapiserver.service.request.champion.ImageResponse
import com.lolduo.restapiserver.service.request.champion.InfoResponse
import com.lolduo.restapiserver.service.request.champion.StatsResponse

data class ChampionResponse(
    val version: String,
    val id: String,
    val key: String,
    val name: String,
    val title: String,
    val blurb: String,
    val info: InfoResponse,
    val image: ImageResponse,
    val tags: Array<String>,
    val partype: String,
    val stats: StatsResponse
)
