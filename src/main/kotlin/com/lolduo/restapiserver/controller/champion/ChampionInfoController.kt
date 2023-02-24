package com.lolduo.restapiserver.controller.champion

import com.lolduo.restapiserver.controller.champion.response.ChampionInfoResponse
import com.lolduo.restapiserver.controller.champion.response.ChampionNameResponse
import com.lolduo.restapiserver.service.ChampionServiceImpl
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(tags = ["Champion Info"], description = "Champion Info api list")
@RestController
@RequestMapping("/api/v1")
class ChampionInfoController(
    private val championService: ChampionServiceImpl,
) {

    @GetMapping("/championList", params = ["size"])
    fun championList(
        size: Int
    ):  List<ChampionInfoResponse>{
        return championService.getChampionList(size).map {
            ChampionInfoResponse(
                id = it.id,
                name = it.name.map { name ->
                    ChampionNameResponse(
                        locale = name.locale,
                        name = name.name
                    )
                }.toTypedArray(),
                url = it.url
            )
        }
    }
}