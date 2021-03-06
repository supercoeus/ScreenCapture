package com.hd.screen.capture;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;


/**
 * Created by hd on 2018/5/23 .
 */
public class CaptureApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }
}
