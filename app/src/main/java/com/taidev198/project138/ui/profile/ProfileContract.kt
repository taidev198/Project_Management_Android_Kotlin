package com.taidev198.project138.ui.profile

import com.taidev198.project138.data.model.Archive
import com.taidev198.project138.data.model.Team

interface ProfileContract {

    interface Presenter{
        fun onGetAllTeams()
        fun onGetAllArchives()
    }
    interface View{
        fun onGetAllTeamsSuccess(allTeams: List<Team>)
        fun onGetAllArchivesSuccess(allArchives: List<Archive>)
        fun onError(e: String)
    }
}