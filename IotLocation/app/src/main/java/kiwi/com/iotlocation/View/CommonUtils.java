package kiwi.com.iotlocation.View;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.smarthome.Views
 * 文件名：  CommonUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/15 0:00
 * 描  述： 设置全屏、取消全屏、去掉标题栏
 */

public class CommonUtils {

    /**
     * 设置隐藏标题栏
     *
     * @param activity
     */
    public static void setNoTitleBar(Activity activity) {
        activity.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    /**
     * 设置全屏
     *
     * @param activity
     */
    public static void setFullScreen(Activity activity) {
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    /**
     * 取消全屏
     *
     * @param activity
     */
    public static void cancelFullScreen(Activity activity) {
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    /**
     * 设置全屏无标题
     */
    public static void setFullScreenNotitle(AppCompatActivity activity) {
        activity.getSupportActionBar().hide();
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}
