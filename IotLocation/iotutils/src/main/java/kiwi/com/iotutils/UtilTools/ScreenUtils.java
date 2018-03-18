package kiwi.com.iotutils.UtilTools;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.smarthome.UtilTools
 * 文件名：  ScreenUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 17:23
 * 描  述： 屏幕相关工具类
 */

public class ScreenUtils {

    /**
     * 获取屏幕的高度
     */
    public static int getScreenHeight(Context context){
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;
    }

    /**
     * 获取屏幕的宽度
     */
    public static int getScreenWidth(Context context){
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }
}
