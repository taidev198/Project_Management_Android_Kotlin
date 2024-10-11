package com.taidev198.project138.data.repository.datasource

import com.taidev198.project138.data.model.Team

interface TeamDatasource {

    interface Local{
        fun getAllTeams():List<Team>
    }
}