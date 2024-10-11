package com.taidev198.project138.data.repository.datasource

import com.taidev198.project138.data.model.Archive

interface ArchiveDatasource {

    interface Local{
        fun getAllArchives():List<Archive>
    }
}