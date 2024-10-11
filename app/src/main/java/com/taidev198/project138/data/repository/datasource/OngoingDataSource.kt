package com.taidev198.project138.data.repository.datasource

import com.taidev198.project138.data.model.Ongoing

interface OngoingDataSource {
    interface Local{
        fun getOngoings():List<Ongoing>
    }
}