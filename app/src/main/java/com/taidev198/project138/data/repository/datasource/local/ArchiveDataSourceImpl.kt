package com.taidev198.project138.data.repository.datasource.local

import android.content.Context
import com.taidev198.project138.data.model.Archive
import com.taidev198.project138.data.repository.datasource.ArchiveDatasource

class ArchiveDataSourceImpl(context: Context): ArchiveDatasource.Local {
    override fun getAllArchives(): List<Archive> {
        TODO("Not yet implemented")
    }

    companion object {
        const val ERR_MSG = "Không tìm thấy dữ liệu hiện tại"
        private var instance: ArchiveDataSourceImpl? = null

        fun getInstance(context: Context) =
            synchronized(this) {
                instance ?: ArchiveDataSourceImpl(context).also { instance = it }
            }
    }
}