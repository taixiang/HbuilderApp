package com.video.util;

import android.app.Activity;
import android.content.Intent;

import com.video.MainActivity;

/**
 * @author tx
 * @date 2018/4/18
 */
public class Helper {
    public static void jump(Activity activity) {
        Intent mIntent = new Intent(activity, MainActivity.class);
        activity.startActivity(mIntent);
    }
}
