package com.dagger2example;

import android.app.Application;
import com.dagger2example.component.AppComponent;
import com.dagger2example.component.DaggerAppComponent;
import com.dagger2example.module.AppModule;

public class App extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        ///crete appComponent after build app
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(getBaseContext(), this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
