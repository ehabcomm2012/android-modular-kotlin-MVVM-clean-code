package com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.retrofit

import com.ehab.modular.popular_people_list.data.popular_people_list.network.poular_people_list.models.PopularPeopleListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PopularPeopleListApiService {
    @GET("/person/popular")
    public suspend fun getPopularPeopleList(@Query("api_key") apiKey :String,
                                     @Query("language") language: String ,
                                     @Query("page") page:Int): Call<PopularPeopleListResponse>
}