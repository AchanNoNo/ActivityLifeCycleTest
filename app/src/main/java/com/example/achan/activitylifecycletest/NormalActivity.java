package com.example.achan.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Achan on 2016/10/11.
 */

public class NormalActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
}
