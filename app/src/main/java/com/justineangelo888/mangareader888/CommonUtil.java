package com.justineangelo888.mangareader888;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by justine on 13/04/16.
 */
public class CommonUtil {
    static DisplayMetrics getScreenSize() {
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm = (WindowManager) SiteList.instance.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics;
    }
}
