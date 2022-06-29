package com.zeoflow.sample

import androidx.appcompat.app.AppCompatActivity
import com.zeoflow.startup.ktx.ApplicationInitializer

class MainActivityKt : AppCompatActivity() {

    fun context() {
        ApplicationInitializer.context
    }

}