package com.example.leakdemo;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-06-29 18:56
 */
public class ExampleApplicationDemo extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        refWatcher = LeakCanary.install(this);
    }

    private RefWatcher refWatcher;

    public static RefWatcher getRefWatcher(Context context){
        ExampleApplicationDemo application = (ExampleApplicationDemo) context.getApplicationContext();
        return application.refWatcher;
    }
}
