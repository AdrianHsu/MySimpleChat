package com.example.adrianhsu.simplechat.app;

import android.app.Application;
import android.util.Log;

import com.example.adrianhsu.simplechat.activities.ChatActivity;
import com.example.adrianhsu.simplechat.models.Message;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class ChatApplication extends Application
{
    public static final String YOUR_APPLICATION_ID = "waWZC7akbFATZdNVVQoVwZFQTGhjA6EtKrNSKkfu";
    public static final String YOUR_CLIENT_KEY = "VdzwKboi6H75t94kILHuqY8SlEnkUpFpqRi7UGQz";
    @Override
    public void onCreate()
    {
        super.onCreate();
        // Register your parse models here
        ParseObject.registerSubclass(Message.class);
        Parse.enableLocalDatastore(this);
        //  initialization happens after all classes are registered
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

//        ParseUser.enableAutomaticUser();
    }

}
