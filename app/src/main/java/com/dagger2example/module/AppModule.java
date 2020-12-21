package com.dagger2example.module;

import android.content.Context;

import com.dagger2example.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;
    private App app;

    public AppModule(Context context, App app) {
        this.context = context;
        this.app = app;
    }

    @Provides
    @Singleton
    Context provideContext(){
        return context;
    }


    @Provides
    @Singleton
    App provideApplication(){
        return app;
    }
}
