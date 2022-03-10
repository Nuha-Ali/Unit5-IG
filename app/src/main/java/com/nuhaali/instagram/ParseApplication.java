package com.nuhaali.instagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6dXYrvdoSIDp9TEZChhjI8xm8E8TW5WTxEQU88XE") // should correspond to Application Id env variable
                .clientKey("nCazYXJRcxjGL1kVRGiYbHabp79r2QNsLgRIbAQ9")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
