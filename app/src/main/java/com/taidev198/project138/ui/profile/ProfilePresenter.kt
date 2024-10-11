package com.taidev198.project138.ui.profile

import com.taidev198.project138.data.repository.ArchiveRepository
import com.taidev198.project138.data.repository.TeamRepository

class ProfilePresenter(
    private val teamRepository: TeamRepository,
    private val archiveRepository: ArchiveRepository
): ProfileContract.Presenter {

    private var view: ProfileContract.View? = null

    override fun onGetAllTeams() {
        val result = teamRepository.getAllTeams()
        view?.onGetAllTeamsSuccess(result)
    }

    override fun onGetAllArchives() {
        val result = archiveRepository.getAllArchives()
        view?.onGetAllArchivesSuccess(result)
    }
}