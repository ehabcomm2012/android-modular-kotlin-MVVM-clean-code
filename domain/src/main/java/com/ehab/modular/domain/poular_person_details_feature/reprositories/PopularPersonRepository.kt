package com.ehab.modular.domain.poular_person_details_feature.reprositories

import com.ehab.modular.domain.models.PopularPersonDetails

interface PopularPersonRepository {
    suspend fun getPersonDetails(apiKey : String,personId:Int ,language: String) : PopularPersonDetails
}