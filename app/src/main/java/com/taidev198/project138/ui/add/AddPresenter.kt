package com.taidev198.project138.ui.add

import com.taidev198.project138.data.repository.OngoingRepository

class AddPresenter(
    private val ongoingRepository: OngoingRepository,
    private val view: AddContract.View,
): AddContract.Presenter {

    override fun saveOngoing() {
        TODO("Not yet implemented")
    }
}