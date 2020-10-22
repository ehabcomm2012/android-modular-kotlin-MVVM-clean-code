package com.ehab.modular.domain.network

import com.ehab.modular.domain.models.PopularPerson

interface PopularPeopleRepository {
    suspend fun getPopularPeopleList():List<PopularPerson>
}