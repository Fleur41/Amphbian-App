package com.okumu.amphibianapp.data

import com.okumu.amphibianapp.model.Amphibian
import com.okumu.amphibianapp.network.AmphibiansApiService

interface AmphibiansRepository{
    suspend fun getAmphibians(): List<Amphibian>
}
class DefaultAmphibiansRepository(private val amphibiansApiService: AmphibiansApiService): AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()

}