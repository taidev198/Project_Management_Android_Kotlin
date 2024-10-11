package com.taidev198.project138.ui.home

import com.taidev198.project138.data.model.Ongoing

interface HomeContract {
    interface Presenter{
        fun getOngoings()
    }

    interface View{
        fun onGetOngoings(listOngoing: List<Ongoing>)
        fun onGetOngoingsSuccess(listOngoing: List<Ongoing>)
        fun onError(e: String)
    }
}