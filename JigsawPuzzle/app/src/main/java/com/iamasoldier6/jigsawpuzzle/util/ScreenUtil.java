package com.iamasoldier6.jigsawpuzzle.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * 实现获取屏幕相关参数
 * <p>
 * Created by Iamasoldier6 on 7/2/16.
 */
public class ScreenUtil {

    /**
     * 获取屏幕的宽高
     *
     * @param context
     * @return
     */
    public static DisplayMetrics getScreenSize(Context context) {
        DisplayMetrics dMetrics = new DisplayMetrics();
        WindowManager wManager = (WindowManager) context.getSystemService(
                Context.WINDOW_SERVICE);
        Display display = wManager.getDefaultDisplay();
        display.getMetrics(dMetrics);
        return dMetrics;
    }

    /**
     * 获取屏幕的像素密度
     *
     * @param context
     * @return
     */
    public static float getDeviceDensity(Context context) {
        DisplayMetrics dMetrics = new DisplayMetrics();
        WindowManager wManager = (WindowManager) context.getSystemService(
                Context.WINDOW_SERVICE);
        Display display = wManager.getDefaultDisplay();
        display.getMetrics(dMetrics);
        return dMetrics.density;
    }
}
