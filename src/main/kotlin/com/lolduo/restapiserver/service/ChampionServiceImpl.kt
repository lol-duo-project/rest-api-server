package com.lolduo.restapiserver.service

import com.lolduo.restapiserver.service.request.ChampionResponse
import com.lolduo.restapiserver.service.response.ChampionInfo
import com.lolduo.restapiserver.service.response.ChampionName
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ChampionServiceImpl : ChampionService {
    override fun getChampionList(size:Int): List<ChampionInfo> {
        val url = "http://localhost:8080"
        val currentVersion = RestTemplate().getForEntity(url + "/version", Array<String>::class.java)?.body?.get(0)
        val locales = RestTemplate().getForEntity(url + "/locales", Array<String>::class.java)?.body
        var champions = ArrayList<ChampionInfo>()
        for (locale in locales!!) {
            val championResponse: Array<ChampionResponse>?
            try {
                championResponse = RestTemplate().getForEntity(
                    url + "/champions?version=$currentVersion&locale=$locale",
                    Array<ChampionResponse>::class.java
                )?.body
            } catch (e: Exception) {
                println(e.message)
                continue
            }
            if (championResponse != null) {
                if (champions.size == 0) {
                    for (champion in championResponse) {
                        champions.add(
                            ChampionInfo(
                                champion.id,
                                arrayListOf(
                                    ChampionName(
                                        locale,
                                        champion.name
                                    )
                                ),
                                "https://lolduo-static-img.s3.ap-northeast-2.amazonaws.com/champion/$size/${champion.name}.png"
                            )
                        )
                    }
                }
                else {
                    for (champion in championResponse) {
                        val championInfo = champions.find { it.id == champion.id }
                        championInfo?.name?.add(ChampionName(locale, champion.name))
                    }
                }
            }
        }

        return champions;
    }
}