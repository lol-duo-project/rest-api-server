package com.lolduo.restapiserver.controller.dummy

import io.swagger.annotations.ApiModelProperty


class SoloResponseV2(
    @field:ApiModelProperty(example = "15") val id: Long,
    @field:ApiModelProperty(
        example = "0"
    ) val rankChangeNumber: Long,
    @field:ApiModelProperty(example = "티모") val championName: String,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/champion/Teemo.png"
    ) val championImgUrl: String,
    @field:ApiModelProperty(example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/mainRune/ArcaneComet.png") val mainRuneImgUrl: String,
    @field:ApiModelProperty(
        example = "https://lol-duo-bucket.s3.ap-northeast-2.amazonaws.com/mainPage/position/MIDDLE.png"
    ) val positionImgUrl: String,
    @field:ApiModelProperty(example = "67.2%") val winRate: String,
    @field:ApiModelProperty(
        example = "1"
    ) val rankNumber: Long
)