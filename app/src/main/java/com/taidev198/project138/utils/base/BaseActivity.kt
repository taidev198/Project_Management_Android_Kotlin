package com.taidev198.project138.utils.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<viewBinding : ViewBinding> : AppCompatActivity() {
    private lateinit var _viewBinding: viewBinding
    protected val viewBinding get() = _viewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _viewBinding = inflateBinding(layoutInflater)
        setContentView(viewBinding.root)
        initData()
        initView()
    }

    abstract fun inflateBinding(layoutInflater: LayoutInflater): viewBinding

    abstract fun initView()

    abstract fun initData()
}