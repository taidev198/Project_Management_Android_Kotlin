package com.taidev198.project138.data.repository

import com.taidev198.project138.data.model.Ongoing
import com.taidev198.project138.data.repository.datasource.OngoingDataSource

class OngoingRepository(
    private val local: OngoingDataSource.Local
): OngoingDataSource.Local{

    override fun getOngoings(): List<Ongoing> {
         return local.getOngoings()
    }

    companion object {
        private var instance: OngoingRepository? = null

        fun getInstance(
            local: OngoingDataSource.Local
        ) = instance ?: OngoingRepository(local).also { instance = it }
    }

}