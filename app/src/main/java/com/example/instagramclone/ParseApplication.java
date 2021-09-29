package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9yxUH3lI71QKGD5DDHrZhz7fxbrWNKba5cucQdqK")
                .clientKey("RY4B5TBwukp77gBeBxrqcVhWMpwcBWAdxmYwvB8W")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
