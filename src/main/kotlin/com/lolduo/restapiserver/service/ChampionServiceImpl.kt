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
        val championInfoList = arrayListOf<ChampionInfo>()
        for(champion in championEnUs) {
            val championEnUsName = champion.name
            val championName = champions.find { it.id == champion.id }?.name ?: ""
            val championNameList = arrayListOf<ChampionName>()
            championNameList.add(ChampionName("en_US", championEnUsName))
            if(championName != championEnUsName && championName != "")
                championNameList.add(ChampionName(locale, championName))
            val imgUrl = "https://lolduo-static-img.s3.ap-northeast-2.amazonaws.com/champion/${size}/${champion.image.full}"
            championInfoList.add(ChampionInfo(champion.id, championNameList, imgUrl))
        }

        return championInfoList
    }
}