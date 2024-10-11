package com.taidev198.project138.ui.profile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.taidev198.project138.data.model.Archive
import com.taidev198.project138.data.model.Team
import com.taidev198.project138.data.repository.ArchiveRepository
import com.taidev198.project138.data.repository.TeamRepository
import com.taidev198.project138.data.repository.datasource.ArchiveDatasource
import com.taidev198.project138.data.repository.datasource.TeamDatasource
import com.taidev198.project138.data.repository.datasource.local.ArchiveDataSourceImpl
import com.taidev198.project138.data.repository.datasource.local.TeamDatasourceImpl
import com.taidev198.project138.databinding.FragmentProfileBinding
import com.taidev198.project138.utils.base.BaseFragment
import com.taidev198.project138.utils.listener.OnItemClickListener

class ProfileFragment:
BaseFragment<FragmentProfileBinding>(),
ProfileContract.View,
OnItemClickListener {

    private var profilePresenter: ProfilePresenter? = null
    private lateinit var teamAdapter: TeamAdapter
    private var allTeams: List<Team>? = null
    private var allArchives: List<Archive>? = null
    private val context: Context = requireContext()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater)
    }

    override fun initData() {
        profilePresenter = ProfilePresenter(
            TeamRepository.getInstance(TeamDatasourceImpl.getInstance(context)),
            ArchiveRepository.getInstance(ArchiveDataSourceImpl.getInstance(context))
        )
    }

    override fun initView() {

    }

    override fun onGetAllTeamsSuccess(_allTeams: List<Team>) {
        allTeams = _allTeams
    }

    override fun onGetAllArchivesSuccess(_allArchives: List<Archive>) {
        allArchives = _allArchives
    }

    override fun onError(e: String) {
        TODO("Not yet implemented")
    }

    override fun onItemClickListener(view: View, position: Int) {
        TODO("Not yet implemented")
    }
}