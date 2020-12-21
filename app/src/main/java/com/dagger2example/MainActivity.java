package com.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "MainActivity";
    /// here we don't need inject App  inside activity, just for example
    @Inject
    public App app;
    /// also don't need inject context inside activity :)
    @Inject
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getAppComponent().inject(this);
        ///check we got instances instead of null:
        Log.d(TAG, "onCreate: " + String.valueOf(context));
        Log.d(TAG, "onCreate: " + String.valueOf(app));
    }
}