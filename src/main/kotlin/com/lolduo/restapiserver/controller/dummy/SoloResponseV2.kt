package com.lolduo.restapiserver.controller.dummy

import io.swagger.annotations.ApiModelProperty


class SoloResponseV2(
    @field:ApiModelProperty(example = "15") private val id: Long,
    @field:ApiModelProperty(
        example = "0"
    ) private val rankChangeNumber: Long,
    @field:ApiModelProperty(example = "티모") private val championName: String,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/champion/Teemo.png"
    ) private val championImgUrl: String,
    @field:ApiModelProperty(example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/mainRune/ArcaneComet.png") private val mainRuneImgUrl: String,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/position/MIDDLE.png"
    ) private val positionImgUrl: String,
    @field:ApiModelProperty(example = "67.2%") private val winRate: String,
    @field:ApiModelProperty(
        example = "1"
    ) private val rankNumber: Long
)