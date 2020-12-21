package com.dagger2example.component;

import com.dagger2example.MainActivity;
import com.dagger2example.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
