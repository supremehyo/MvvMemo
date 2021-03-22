package com.example.mvvmemo.View


import android.os.Bundle
import com.example.mvvmemo.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.mvvmemo.ViewModel.MainViewModel
import com.example.mvvmemo.databinding.ActivityMainBinding


class MainActivity : BaseKotlinActivity<ActivityMainBinding, MainViewModel>(){


    override val layoutResourceId: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override val viewModel: MainViewModel by viewModel() // Koin 으로 의존성 주입

    override fun initStartView() {

    }

    override fun initDataBinding() {

    }

    override fun initAfterBinding() {

    }
}