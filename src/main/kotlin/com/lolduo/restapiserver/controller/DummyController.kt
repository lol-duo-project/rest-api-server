package com.lolduo.restapiserver.controller

import com.lolduo.restapiserver.controller.dummy.*
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1")
@CrossOrigin(origins = ["*"])
@RestController
class DummyController {

    @GetMapping("/dummyDuoDetail")
    @ApiOperation(value = "더미 데이터", notes = "더미 데이터", response = DetailDoubleResponse::class)
    fun getDoubleChampionDetailDummy(dbId: Long?): ResponseEntity<*>? {
        val baseUrl = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/Rune/"
        val championName = "미스 포츈"
        val championImgUrl = "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/champion/MissFortune.svg"
        val mainRuneImgUrl = "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/mainRune/LethalTempoTemp.svg"
        val positionImgUrl = "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/position/BOTTOM.svg"
        val detailChampionComp = DetailChampionComp(championName, championImgUrl, mainRuneImgUrl, positionImgUrl)
        val detailSpell = DetailSpell(
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/spell/SummonerFlash.png",
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/spell/SummonerExhaust.png"
        )
        val detailItem = DetailItem(
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/item/3068.png",
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/item/3065.png",
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/item/3075.png"
        )
        val mainRuneList1: MutableList<String> = ArrayList()
        mainRuneList1.add(baseUrl + "Domination/main/DisabledPressTheAttack.svg")
        mainRuneList1.add(baseUrl + "Domination/main/LethalTempo.svg")
        mainRuneList1.add(baseUrl + "Domination/main/DisabledFleetFootwork.svg")
        mainRuneList1.add(baseUrl + "Domination/main/DisabledConqueror.svg")
        val mainRuneList2: MutableList<String> = ArrayList()
        mainRuneList2.add(baseUrl + "Precision/1/Overheal.svg")
        mainRuneList2.add(baseUrl + "Precision/1/PresenceofMind.svg")
        mainRuneList2.add(baseUrl + "Precision/1/Triumph.svg")
        val mainRuneList3: MutableList<String> = ArrayList()
        mainRuneList3.add(baseUrl + "Precision/2/Alarcrity.svg")
        mainRuneList3.add(baseUrl + "Precision/2/Tenacity.svg")
        mainRuneList3.add(baseUrl + "Precision/2/Bloodline.svg")
        val mainRuneList4: MutableList<String> = ArrayList()
        mainRuneList4.add(baseUrl + "Precision/3/CoupdeGrace.svg")
        mainRuneList4.add(baseUrl + "Precision/3/CutDown.svg")
        mainRuneList4.add(baseUrl + "Precision/3/LastStand.svg")
        val subRuneList1: MutableList<String> = ArrayList()
        subRuneList1.add(baseUrl + "Domination/1/CheapShot.svg")
        subRuneList1.add(baseUrl + "Domination/1/TasteofBlood.svg")
        subRuneList1.add(baseUrl + "Domination/1/SuddenImpact.svg")
        val subRuneList2: MutableList<String> = ArrayList()
        subRuneList2.add(baseUrl + "Domination/2/ZombieWard.svg")
        subRuneList2.add(baseUrl + "Domination/2/GhostPoro.svg")
        subRuneList2.add(baseUrl + "Domination/2/EyeballCollection.svg")
        val subRuneList3: MutableList<String> = ArrayList()
        subRuneList3.add(baseUrl + "Domination/3/TreausreHunter.svg")
        subRuneList3.add(baseUrl + "Domination/3/IngeniousHunter.svg")
        subRuneList3.add(baseUrl + "Domination/3/RelentlessHunter.svg")
        subRuneList3.add(baseUrl + "Domination/3/UltimateHunter.svg")
        val detailRune = DetailRune(
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/Rune/Precision/Precision.svg",
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/Rune/Domination/Domination.svg",
            mainRuneList1, mainRuneList2, mainRuneList3, mainRuneList4, subRuneList1, subRuneList2, subRuneList3
        )
        val detailInfo = DetailInfo(detailSpell, detailRune, detailItem)
        val detailRankWinRate1 = DetailRankWinRate(1L, "70.1%")
        val detailRankWinRate2 = DetailRankWinRate(2L, "68.1%")
        val detailRankWinRate3 = DetailRankWinRate(3L, "76.1%")
        val detailDouble1 = DetailDouble(detailRankWinRate1, detailInfo, detailInfo)
        val detailDouble2 = DetailDouble(detailRankWinRate2, detailInfo, detailInfo)
        val detailDouble3 = DetailDouble(detailRankWinRate3, detailInfo, detailInfo)
        val detailDoubleList: MutableList<DetailDouble> = ArrayList<DetailDouble>()
        detailDoubleList.add(detailDouble1)
        detailDoubleList.add(detailDouble2)
        detailDoubleList.add(detailDouble3)
        val detailDoubleResponse = DetailDoubleResponse(detailChampionComp, detailChampionComp, detailDoubleList)
        return ResponseEntity<Any>(detailDoubleResponse, HttpStatus.OK)
    }

    @GetMapping("/dummyDuo")
    @ApiOperation(value = "더미 데이터", notes = "더미 데이터", response = Array<DoubleResponseV2>::class)
    fun getDoubleDummy(): ResponseEntity<*>? {
        val championInfo = ChampionResponse(
            "미스 포츈",
            "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/champion/MissFortune.svg",
            "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/mainRune/LethalTempoTemp.svg",
            "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/position/BOTTOM.svg"
        )
        val doubleResponse1 = DoubleResponseV2(
            1,
            0,
            1,
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/rankChange/1.svg",
            championInfo,
            championInfo,
            "67.2%"
        )
        val doubleResponse2 = DoubleResponseV2(
            2,
            1,
            2,
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/rankChange/2.svg",
            championInfo,
            championInfo,
            "60.2%"
        )
        val doubleResponse3 = DoubleResponseV2(
            3,
            2,
            3,
            "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/rankChange/3.svg",
            championInfo,
            championInfo,
            "50.2%"
        )
        val doubleResponse4 = DoubleResponseV2(
            4,
            3,
            4,
            "",
            championInfo,
            championInfo,
            "40.2%"
        )
        val doubleResponseArray = arrayOf(doubleResponse1, doubleResponse2, doubleResponse3, doubleResponse4)
        return ResponseEntity<Any>(doubleResponseArray, HttpStatus.OK)
    }
}