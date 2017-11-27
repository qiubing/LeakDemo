package com.example.leakdemo;

import android.content.Context;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-06-29 15:00
 */
public class Utility {
    private static CallBack mCallBack = new CallBack();
    public static void registerCallBack(Context context){
        mCallBack.registerCallBack(context);
    }

    public static void unregisterCallBack(Context context){
        mCallBack.unregisterCallBack(context);
    }
}
