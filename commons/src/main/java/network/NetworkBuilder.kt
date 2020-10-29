package network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import utils.AppConstants

object NetworkBuilder {
    private var retrofit : Retrofit? = null

    fun provideRetrofitClient() : Retrofit? {

        return retrofit?:run {
           retrofit = Retrofit.Builder()
                .baseUrl(AppConstants.baseApiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit
        }

    }
    fun<T> provideApiService(endPoint: Class<T>): T{
        return provideRetrofitClient()!!.create(endPoint)
    }

}