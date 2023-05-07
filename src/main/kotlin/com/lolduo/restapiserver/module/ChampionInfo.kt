package com.lolduo.restapiserver.module

import com.lolduo.restapiserver.module.championInfo.Image
import com.lolduo.restapiserver.module.championInfo.Info
import com.lolduo.restapiserver.module.championInfo.Stats
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "13.9.1")
data class ChampionInfo(
    @Id var uniqueId: String,
    val id: String,
    val version: String,
    val key: String,
    val name: String,
    val title: String,
    val blurb: String,
    val info: Info,
    val image: Image,
    val tags: ArrayList<String>,
    val partype: String,
    val stats: Stats,
    var locale: String
)