package com.taidev198.project138.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.taidev198.project138.data.model.Ongoing
import com.taidev198.project138.data.repository.OngoingRepository
import com.taidev198.project138.data.repository.datasource.local.OngoingDataSourceImpl
import com.taidev198.project138.databinding.ActivityDashboardBinding
import com.taidev198.project138.utils.base.BaseActivity
import com.taidev198.project138.utils.listener.OnItemClickListener
import java.io.IOException

class HomeActivity :
BaseActivity<ActivityDashboardBinding>(),
HomeContract.View,
OnItemClickListener{

    private var homePresenter: HomePresenter? = null
    private lateinit var ongoingAdapter: OngoingAdapter
    private var listOngoing: List<Ongoing>? = null
    private val context: Context = this

    override fun inflateBinding(layoutInflater: LayoutInflater): ActivityDashboardBinding {
        return ActivityDashboardBinding.inflate(layoutInflater)
    }

    override fun initView() {
        ongoingAdapter =
            OngoingAdapter(this, this)
        viewBinding.recycleOngoing.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = ongoingAdapter
        }
    }

    override fun initData() {
        homePresenter =
            HomePresenter(OngoingRepository.getInstance(
                OngoingDataSourceImpl.getInstance(this)
            ))
        homePresenter?.getOngoings()
    }

    override fun onGetOngoings(listOngoing: List<Ongoing>) {
        TODO("Not yet implemented")
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

}