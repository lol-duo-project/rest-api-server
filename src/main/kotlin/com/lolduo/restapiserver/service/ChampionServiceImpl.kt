package com.lolduo.restapiserver.service

import com.lolduo.restapiserver.repository.ChampionInfoRepository
import com.lolduo.restapiserver.service.response.ChampionInfo
import com.lolduo.restapiserver.service.response.ChampionName
import org.springframework.stereotype.Service

@Service
class ChampionServiceImpl (
    val championInfoRepository: ChampionInfoRepository,
) : ChampionService {
    override fun getChampionList(size:Int, locale: String): List<ChampionInfo> {
        println(size)
        println(locale)
        val champions = championInfoRepository.findByLocale(locale)
        val championEnUs = championInfoRepository.findByLocale("en_US")
        println(champions)
        println(championEnUs)
        val championInfoList = listOf<ChampionInfo>()
        for(champion in championEnUs) {
            val championEnUsName = champion.name
            println(championEnUsName)
            val championName = champions.find { it.id == champion.id }?.name ?: ""
            println(championName)
            val championNamList = listOf<ChampionName>()
            championNamList.plus(ChampionName("en_US", championEnUsName))
            if(championName != championEnUsName)
                championName.plus(ChampionName(locale, championName))
            val imgUrl = "https://lolduo-static-img.s3.ap-northeast-2.amazonaws.com/champion/${size}/${champion.image.full}"
            championInfoList.plus(ChampionInfo(champion.id, championNamList, imgUrl))
        }

        return championInfoList
    }
}