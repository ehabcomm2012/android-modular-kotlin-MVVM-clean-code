package com.ehab.modular.domain.popular_people_list.networkRepos

import com.ehab.modular.domain.models.PopularPerson


 interface PopularPeopleListNetworkRepo {

    suspend fun getPopularPeopleList(apiKey : String ,language: String , page:Int):List<PopularPerson>?

}