package com.example.administrator.jiecaovideoplayer.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by jinhui on 2017/6/5.
 * 邮箱: 1004260403@qq.com
 */

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化内存泄漏组件
        LeakCanary.install(this);

    }
}
