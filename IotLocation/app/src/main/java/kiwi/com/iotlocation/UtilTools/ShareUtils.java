package kiwi.com.iotlocation.UtilTools;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.smarthome.UtilTools
 * 文件名：  ShareUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/14 22:47
 * 描  述： 封装SharedPreferences
 */

public class ShareUtils {
    // 配置存放文件
    public static final String CONFIG = "config";

    public static void putString(Context context, String key, String value){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(Context context,String key, String defValue){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    public static void putInt(Context context, String key, int value){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }

    public static int getInt(Context context,String key, int defValue){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }

    public static void putBoolean(Context context, String key, Boolean value){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public static Boolean getBoolean(Context context,String key, Boolean defValue){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    public static void remove(Context context,String key){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        sp.edit().remove(key).commit();
    }

    public static void clear(Context context){
        SharedPreferences sp = context.getSharedPreferences(CONFIG,Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }
}
