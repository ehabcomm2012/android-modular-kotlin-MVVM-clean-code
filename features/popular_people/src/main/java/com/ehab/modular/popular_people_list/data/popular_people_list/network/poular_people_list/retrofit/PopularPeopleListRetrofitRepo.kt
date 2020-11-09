package com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.retrofit

import com.ehab.modular.domain.models.PopularPerson
import com.ehab.modular.domain.popular_people_list.networkRepos.PopularPeopleListNetworkRepo

class PopularPeopleListRetrofitRepo(val popularPeopleListRetrofitApi : PopularPeopleListRetrofitApi) : PopularPeopleListNetworkRepo  {
    override suspend fun getPopularPeopleList(
        apiKey: String,
        language: String,
        page: Int
    ): List<PopularPerson>? {
        return  popularPeopleListRetrofitApi.getPopularPeopleList(apiKey,language,page).results

    }

}