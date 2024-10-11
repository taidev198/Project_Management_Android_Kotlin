package com.taidev198.project138.data.repository.datasource.local

interface OnResultListener<T> {
    fun onSuccess(data: T)

    fun onError(exception: Exception?)
}