package com.guy.class23a_and_2;

import android.content.Context;
import android.content.SharedPreferences;

public class MySPV1 {

    private static final String DB_FILE = "DB_FILE";

    public static void putInt(Context context, String key, int value) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getInt(Context context, String key, int def) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        return preferences.getInt(key, def);
    }

    public static void putString(Context context, String key, String value) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getString(Context context, String key, String def) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        return preferences.getString(key, def);
    }

}
