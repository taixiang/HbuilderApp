package com.video.util;

import android.util.Log;

/**
 * Created by tx on 2017/7/20.
 * Log管理类
 */

public class LogUtil {

    /**
     * 是否需要打印bug
     */
    private static boolean isDebug = false;
    private static final String TAG = "LogUtil";

    public static boolean isDebug() {
        return isDebug;
    }

    /**
     * 在application的onCreate函数里面设置
     * @param isDebug 是否需要打印bug
     */
    public static void setIsDebug(boolean isDebug) {
        LogUtil.isDebug = isDebug;
    }

    /**
     * 四个默认tag的函数
     * @param msg
     */
    public static void i(String msg) {
        if (isDebug){
            Log.i(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (isDebug){
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (isDebug){
            Log.e(TAG, msg);
        }
    }

    public static void v(String msg) {
        if (isDebug){
            Log.v(TAG, msg);
        }
    }

    /**
     * 下面是传入自定义tag的函数
     * @param tag 自定义tag
     * @param msg
     */
    public static void i(String tag, String msg) {
        if (isDebug){
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug){
            Log.i(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug){
            Log.i(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug){
            Log.i(tag, msg);
        }
    }

}
