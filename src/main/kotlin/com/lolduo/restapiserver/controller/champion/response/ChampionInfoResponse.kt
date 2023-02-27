package com.lolduo.restapiserver.controller.champion.response

data class ChampionInfoResponse(val id: String, val name: Array<ChampionNameResponse>, val url: String)
