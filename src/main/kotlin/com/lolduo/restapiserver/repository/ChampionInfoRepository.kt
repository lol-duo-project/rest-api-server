package com.lolduo.restapiserver.repository

import com.lolduo.restapiserver.module.ChampionInfo
import org.springframework.data.mongodb.repository.MongoRepository

interface ChampionInfoRepository : MongoRepository<ChampionInfo, String>{
    fun findByLocale(locale: String): List<ChampionInfo>
}