package com.taidev198.project138.ui.add

import android.view.LayoutInflater
import android.view.View
import com.taidev198.project138.databinding.FragmentOngoingDetailBinding
import com.taidev198.project138.utils.base.BaseFragment
import com.taidev198.project138.utils.listener.OnItemClickListener

class AddFragment:
    BaseFragment<FragmentOngoingDetailBinding>(),
    AddContract.View,
    OnItemClickListener{

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentOngoingDetailBinding {
        return FragmentOngoingDetailBinding.inflate(inflater)
    }

    override fun initData() {
        TODO("Not yet implemented")
    }

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun onSaveOngoingSuccess() {
        TODO("Not yet implemented")
    }

    override fun onError(e: String) {
        TODO("Not yet implemented")
    }

    override fun onItemClickListener(view: View, position: Int) {
        TODO("Not yet implemented")
    }
}