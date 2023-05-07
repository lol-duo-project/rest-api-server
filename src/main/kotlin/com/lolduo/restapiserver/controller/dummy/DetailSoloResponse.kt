package com.lolduo.restapiserver.controller.dummy


class DetailSoloResponse(var detailChampionComp: DetailChampionComp, detailSoloList: List<DetailSolo>) {
    var detailSoloList: List<DetailSolo> = ArrayList()

    init {
        this.detailSoloList = detailSoloList
    }
}