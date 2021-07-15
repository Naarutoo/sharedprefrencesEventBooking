package com.example.sharedprefrenceseventbooking;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

    private static final String PREFERENCE_KEY = "com.xyz.sharedpreferences";

    public static SharedPreferences getSharedPreferences(Context context){
        return context.getSharedPreferences(PREFERENCE_KEY,Context.MODE_PRIVATE);
    }
    public static void writetoIntPreference(Context context ,String key,int value) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putInt(key,value);
        editor.apply();

    }
    public static void writetoStringPreference(Context context,String key ,String value){
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(key,value);
        editor.apply();
    }
    public static int getIntfromSharedPrefernces(Context context, String key){
        return getSharedPreferences(context).getInt(key,0);
    }
    public static String getStringSharedPrefernces(Context context,String key){
        return getSharedPreferences(context).getString(key,"Null");
    }

}
