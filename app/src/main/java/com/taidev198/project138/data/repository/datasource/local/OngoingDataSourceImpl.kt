package com.taidev198.project138.data.repository.datasource.local

import android.content.Context
import com.taidev198.project138.data.model.Ongoing
import com.taidev198.project138.data.repository.datasource.OngoingDataSource

class OngoingDataSourceImpl(context: Context): OngoingDataSource.Local {

    override fun getOngoings(): List<Ongoing> {
        return listOf(
            Ongoing("Food App","Jun 12, 2023", 50,"ongoing1"),
            Ongoing("AI Recoding","Jun 26, 2023", 60,"ongoing2"),
            Ongoing("Weather App","July 22, 2023", 25,"ongoing3"),
            Ongoing("E-book App","Jun 13, 2023", 80,"ongoing4"),
        )
    }

    companion object {
        const val ERR_MSG = "Không tìm thấy dữ liệu hiện tại"
        private var instance: OngoingDataSourceImpl? = null

        fun getInstance(context: Context) =
            synchronized(this) {
                instance ?: OngoingDataSourceImpl(context).also { instance = it }
            }
    }
}