package com.lolduo.restapiserver.service

import com.lolduo.restapiserver.service.response.ChampionInfo

interface ChampionService {
    fun getChampionList(size:Int): List<ChampionInfo>
}