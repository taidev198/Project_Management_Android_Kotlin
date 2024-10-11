package com.taidev198.project138.data.repository

import com.taidev198.project138.data.model.Archive
import com.taidev198.project138.data.repository.datasource.ArchiveDatasource

class ArchiveRepository(
    private val local: ArchiveDatasource.Local
): ArchiveDatasource.Local {
    override fun getAllArchives(): List<Archive> {
        return local.getAllArchives()
    }

    companion object {
        private var instance: ArchiveRepository? = null

        fun getInstance(
            local: ArchiveDatasource.Local
        ) = instance ?: ArchiveRepository(local).also { instance = it }
    }
}