package com.okumu.amphibianapp.network

import com.okumu.amphibianapp.model.Amphibian
import retrofit2.http.GET

interface AmphibiansApiService {
    @GET("amphibians")
     suspend fun getAmphibians(): List<Amphibian>
}