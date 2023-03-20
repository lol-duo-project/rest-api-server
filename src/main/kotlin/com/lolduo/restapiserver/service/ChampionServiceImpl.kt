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

        val champions = championInfoRepository.findByLocale(locale)
        val championEnUs = championInfoRepository.findByLocale("en_US")

        val championInfoList = listOf<ChampionInfo>()
        for(champion in champions) {
            val championName = champion.name
            val championEnUsName = championEnUs.find { it.id == champion.id }?.name ?: ""
            val championNamList = listOf<ChampionName>()
            championNamList.plus(ChampionName(locale, championName))
            if(championName != championEnUsName)
                championName.plus(ChampionName("en_US", championEnUsName))
            val imgUrl = "https://lolduo-static-img.s3.ap-northeast-2.amazonaws.com/champion/${size}/${champion.image.full}"
            championInfoList.plus(ChampionInfo(champion.id, championNamList, imgUrl))
        }

        return championInfoList
    }
}