package com.lolduo.restapiserver.controller.dummy

import io.swagger.annotations.ApiModelProperty

class DoubleResponseV2(
    @field:ApiModelProperty(example = "15") private val id: Long,
    @field:ApiModelProperty(
        example = "0"
    ) private val rankChangeNumber: Long,
    @field:ApiModelProperty(example = "1") private val rankNumber: Long,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/logo/Group.svg"
    ) private val rankNumberIcon: String,
    champion1: ChampionResponse,
    champion2: ChampionResponse,
    winRate: String
) {
    @ApiModelProperty
    private val champion1: ChampionResponse

    @ApiModelProperty
    private val champion2: ChampionResponse

    @ApiModelProperty(example = "67.2%")
    private val winRate: String

    init {
        this.champion1 = champion1
        this.champion2 = champion2
        this.winRate = winRate
    }
}