package com.example.achan.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Achan on 2016/10/11.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityController.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityController.removeActivity(this);
    }
}
