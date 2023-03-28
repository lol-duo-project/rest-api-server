package com.lolduo.restapiserver.controller.dummy

import io.swagger.annotations.ApiModelProperty

class DetailChampionComp(
    @field:ApiModelProperty(example = "미스포츈") var championName: String,
    @field:ApiModelProperty(
        example = "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/champion/MissFortune.svg"
    ) var championImgUrl: String,
    @field:ApiModelProperty(example = "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/mainRune/LethalTempoTemp.svg") var mainRuneImgUrl: String,
    @field:ApiModelProperty(
        example = "https://d2d4ci5rabfoyr.cloudfront.net/mainPage/position/BOTTOM.svg"
    ) var positionImgUrl: String
)
