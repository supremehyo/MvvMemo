package com.example.mvvmemo

import android.app.Application
import com.example.mvvmemo.DI.myDiModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(applicationContext, myDiModule)
        //이런식으로 최상위에서 myDiModule 을 넣어서 주입해줌.
    }
}