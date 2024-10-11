package com.taidev198.project138.data.repository.datasource

import com.taidev198.project138.data.model.Ongoing
import com.taidev198.project138.data.repository.datasource.local.OnResultListener

interface OngoingDataSource {
    interface Local{
        fun getOngoings():List<Ongoing>
    }
}