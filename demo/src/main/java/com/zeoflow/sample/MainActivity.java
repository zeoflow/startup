package com.zeoflow.sample;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.zeoflow.app.Activity;
import com.zeoflow.startup.AppInitializer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppInitializer.getAppContext();
    }

}
