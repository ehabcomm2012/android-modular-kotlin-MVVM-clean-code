package com.ehab.modular.domain.popular_person_details.networkRepos

import com.ehab.modular.domain.models.PopularPersonDetails

interface PopularPersonNetworkRepo {
    suspend fun getPersonDetails(apiKey : String,personId:Int ,language: String) : PopularPersonDetails
}