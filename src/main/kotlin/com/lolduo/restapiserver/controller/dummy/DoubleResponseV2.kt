package com.lolduo.restapiserver.controller.dummy

import io.swagger.annotations.ApiModelProperty

class DoubleResponseV2(
    @field:ApiModelProperty(example = "15") val id: Long,
    @field:ApiModelProperty(
        example = "0"
    ) val rankChangeNumber: Long,
    @field:ApiModelProperty(example = "1") val rankNumber: Long,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/logo/Group.svg"
    ) val rankNumberIcon: String,
    champion1: ChampionResponse,
    champion2: ChampionResponse,
    winRate: String
) {
    @ApiModelProperty
     val champion1: ChampionResponse

    @ApiModelProperty
     val champion2: ChampionResponse

    @ApiModelProperty(example = "67.2%")
     val winRate: String

    init {
        this.champion1 = champion1
        this.champion2 = champion2
        this.winRate = winRate
    }
}