package com.lolduo.restapiserver.controller.champion

import com.lolduo.restapiserver.controller.champion.response.ChampionInfoResponse
import com.lolduo.restapiserver.service.ChampionServiceImpl
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(tags = ["Champion Info"], description = "Champion Info api list")
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = ["*"])
class ChampionInfoController(
    private val championService: ChampionServiceImpl,
) {

    @GetMapping("/championList", params = ["size", "locale"])
    fun championList(
        size: Int,
        locale: String
    ):  List<ChampionInfoResponse>{
        return championService.getChampionList(size, locale).map {
            ChampionInfoResponse(
                id = it.id,
                name = it.name.map { name ->
                     name.name
                },
                url = it.url
            )
        }
    }
}