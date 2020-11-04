package com.ehab.modular.domain.network

import com.ehab.modular.domain.models.PopularPerson

interface PopularPeopleListRepository {
    suspend fun getPopularPeopleList(apiKey : String ,language: String , page:Int):List<PopularPerson>
}