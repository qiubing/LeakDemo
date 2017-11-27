package com.example.leakdemo;

import android.content.Context;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-06-29 15:00
 */
public class CallBack {
    private Context mContext;
    public void registerCallBack(Context context){
        mContext = context;
    }

    public void unregisterCallBack(Context context){
        if (mContext == context){
            mContext = null;
        }
    }
}
