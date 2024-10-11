package com.taidev198.project138.ui.home

import com.taidev198.project138.data.model.Ongoing
import com.taidev198.project138.data.repository.OngoingRepository

class HomePresenter(
    private val ongoingRepository: OngoingRepository,
    private val view: HomeContract.View,
): HomeContract.Presenter{

    override fun getOngoings() {
        val result =  ongoingRepository.getOngoings()
        view.onGetOngoingsSuccess(result)
    }
}