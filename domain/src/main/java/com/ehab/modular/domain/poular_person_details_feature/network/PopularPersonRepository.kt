package com.ehab.modular.domain.poular_person_details_feature.network

import com.ehab.modular.domain.models.PopularPersonDetails

interface PopularPersonRepository {
    suspend fun getPersonDetails(personId:Int) : PopularPersonDetails
}