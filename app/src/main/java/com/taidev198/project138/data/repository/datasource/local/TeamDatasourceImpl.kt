package com.taidev198.project138.data.repository.datasource.local

import android.content.Context
import com.taidev198.project138.data.model.Team
import com.taidev198.project138.data.repository.datasource.TeamDatasource

class TeamDatasourceImpl(context: Context): TeamDatasource.Local {
    override fun getAllTeams(): List<Team> {
        TODO("Not yet implemented")
    }

    companion object {
        const val ERR_MSG = "Không tìm thấy dữ liệu hiện tại"
        private var instance: TeamDatasourceImpl? = null

        fun getInstance(context: Context) =
            synchronized(this) {
                instance ?: TeamDatasourceImpl(context).also { instance = it }
            }
    }
}