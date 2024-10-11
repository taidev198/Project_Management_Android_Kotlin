package com.taidev198.project138.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.taidev198.project138.data.model.Ongoing
import com.taidev198.project138.data.repository.OngoingRepository
import com.taidev198.project138.data.repository.datasource.local.OngoingDataSourceImpl
import com.taidev198.project138.databinding.ActivityDashboardBinding
import com.taidev198.project138.utils.base.BaseFragment
import com.taidev198.project138.utils.listener.OnItemClickListener

class HomeFragment :
BaseFragment<ActivityDashboardBinding>(),
HomeContract.View,
OnItemClickListener{

    private var homePresenter: HomePresenter? = null
    private lateinit var ongoingAdapter: OngoingAdapter
    private var listOngoing: List<Ongoing>? = null
    private val context: Context = requireContext()

    override fun initView() {
        ongoingAdapter =
            OngoingAdapter(this, context)
        viewBinding.recycleOngoing.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = ongoingAdapter
        }
    }

    override fun inflateViewBinding(inflater: LayoutInflater): ActivityDashboardBinding {
        return ActivityDashboardBinding.inflate(inflater)
    }

    override fun initData() {
        homePresenter =
            HomePresenter(OngoingRepository.getInstance(
                OngoingDataSourceImpl.getInstance(context)
            ))
        homePresenter?.getOngoings()
    }

    override fun onGetOngoingsSuccess(_listOngoing: List<Ongoing>) {
        listOngoing = _listOngoing
        ongoingAdapter.updateData(_listOngoing)
    }

    override fun onError(e: String) {
        TODO("Not yet implemented")
    }

    override fun onItemClickListener(view: View, position: Int) {
        val ongoing = listOngoing?.get(position)
//        try {
//            if (ongoing != null) {
//                ongoing.id?.let { favouritePresenter?.removeFavoriteItem(it) }
//            }
//        } catch (e: IOException) {
//            println(e)
//        } finally {
//            homePresenter?.getOngoings()
//        }
    }

    companion object {
        var homePresenter: HomePresenter? = null
        const val MY_TAG = "HomeFragment"
        const val SELECTED_LOCATION = "selected_location"

        fun newInstance() = HomeFragment()
    }

}