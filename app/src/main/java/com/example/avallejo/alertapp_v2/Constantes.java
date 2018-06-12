package com.example.avallejo.alertapp_v2;

import android.app.Application;

public class Constantes extends Application {

    private static String name;
    private static String user;

    public static String getName() {
        return name;
    }

    public static void setName(String APP_NAME) {
        name = APP_NAME;
    }


    public static String getUser() {
        return user;
    }

    public static void setUser(String APP_USER) {
        user = APP_USER;
    }


}
