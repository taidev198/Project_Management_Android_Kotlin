package com.taidev198.project138.ui.add

interface AddContract {
    interface Presenter{
        fun saveOngoing()
    }
    interface View{
        fun onSaveOngoingSuccess()
        fun onError(e: String)
    }
}