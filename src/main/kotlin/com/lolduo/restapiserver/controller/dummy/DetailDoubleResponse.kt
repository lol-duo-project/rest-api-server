package com.lolduo.restapiserver.controller.dummy

class DetailDoubleResponse(
    var detailChampionComp1: DetailChampionComp,
    var detailChampionComp2: DetailChampionComp,
    detailDoubleList: List<DetailDouble>
) {
    var detailDoubleList: List<DetailDouble> = ArrayList()

    init {
        this.detailDoubleList = detailDoubleList
    }
}