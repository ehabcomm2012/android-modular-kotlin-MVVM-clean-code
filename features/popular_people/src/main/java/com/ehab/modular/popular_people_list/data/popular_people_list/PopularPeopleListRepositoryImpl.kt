package com.ehab.modular.popular_people_list.data.popular_people_list

import com.ehab.modular.domain.models.PopularPerson
import com.ehab.modular.domain.network.PopularPeopleListRepository
import com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.retrofit.PopularPeopleListApiService

class PopularPeopleListRepositoryImpl constructor(val popularPeopleListApiService : PopularPeopleListApiService) :
    PopularPeopleListRepository {

    override suspend fun getPopularPeopleList(
        apiKey: String,
        language: String,
        page: Int
    ): List<PopularPerson> {
       val popularPeopleResponse= popularPeopleListApiService.getPopularPeopleList(apiKey,language,page)
        return listOf(PopularPerson(null,null,null,
            null,null,null,null))
    }

}