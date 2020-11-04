package com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.models

import com.ehab.modular.domain.models.PopularPerson
import com.google.gson.annotations.SerializedName

class PopularPeopleListResponse (
    @SerializedName("page")
    var page: Int,
    @SerializedName("total_results")
    var total_results: Int,

    @SerializedName("total_pages")
    var total_pages: Int,

    @SerializedName("results")
     var results: List<PopularPerson>?=null
)