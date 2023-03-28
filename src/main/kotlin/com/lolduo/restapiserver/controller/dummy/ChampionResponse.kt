package com.lolduo.restapiserver.controller.dummy

import io.swagger.annotations.ApiModelProperty

class ChampionResponse(
     val championName: String,
    @field:ApiModelProperty(example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/champion/Ziggs.svg")  val championImgUrl: String,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/mainRune/ArcaneComet.svg"
    )  val mainRuneImgUrl: String,
    @field:ApiModelProperty(example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/position/BOTTOM.svg")  val positionImgUrl: String
)