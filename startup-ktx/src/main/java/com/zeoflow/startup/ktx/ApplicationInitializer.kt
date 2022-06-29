package com.zeoflow.startup.ktx

import android.content.Context
import com.zeoflow.startup.ApplicationInitializer

class ApplicationInitializer {
    companion object {
        val context: Context
            get() {
                return ApplicationInitializer.getAppContext()
            }
    }
}