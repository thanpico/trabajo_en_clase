package net.unadeca.quiz.database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

public class TestApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);

    }
}
