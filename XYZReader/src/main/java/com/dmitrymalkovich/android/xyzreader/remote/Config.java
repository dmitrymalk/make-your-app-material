package com.dmitrymalkovich.android.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static String LOG_TAG = Config.class.getSimpleName();
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json");
        } catch (MalformedURLException ignored) {
            Log.w(LOG_TAG, ignored.getMessage(), ignored);
        }

        BASE_URL = url;
    }
}
