package com.lolduo.restapiserver.controller.dummy

import io.swagger.annotations.ApiModelProperty

class ChampionResponse(
    private val championName: String,
    @field:ApiModelProperty(example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/champion/Ziggs.svg") private val championImgUrl: String,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/mainRune/ArcaneComet.svg"
    ) private val mainRuneImgUrl: String,
    @field:ApiModelProperty(example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/position/BOTTOM.svg") private val positionImgUrl: String
)