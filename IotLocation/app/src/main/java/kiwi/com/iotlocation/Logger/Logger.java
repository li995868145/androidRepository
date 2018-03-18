package kiwi.com.iotlocation.Logger;

import android.util.Log;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.smarthome.Logger
 * 文件名：  Logger
 * 创建者：  kiwi
 * 时  间：  2018/3/14 22:18
 * 描  述： 项目日志类
 */

public class Logger {
    //日志过滤
    public static final String TAG = "IOTLACTION";

    //日志开关
    public static final boolean DEBUG = true;

    //五个等级  DIWE
    public static void d(String text) {
        if (DEBUG) {
            Log.d(TAG, text);
        }
    }

    public static void i(String text) {
        if (DEBUG) {
            Log.i(TAG, text);
        }
    }

    public static void w(String text) {
        if (DEBUG) {
            Log.w(TAG, text);
        }
    }

    public static void e(String text) {
        if (DEBUG) {
            Log.e(TAG, text);
        }
    }
}
