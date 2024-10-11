package com.taidev198.project138.data.repository

import com.taidev198.project138.data.model.Team
import com.taidev198.project138.data.repository.datasource.ArchiveDatasource
import com.taidev198.project138.data.repository.datasource.TeamDatasource

class TeamRepository(
    private val local: TeamDatasource.Local
): TeamDatasource.Local {
    override fun getAllTeams(): List<Team> {
        return local.getAllTeams()
    }

    companion object {
        private var instance: TeamRepository? = null

        fun getInstance(
            local: TeamDatasource.Local
        ) = instance ?: TeamRepository(local).also { instance = it }
    }
}