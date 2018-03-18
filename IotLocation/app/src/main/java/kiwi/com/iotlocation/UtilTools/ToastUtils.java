package kiwi.com.iotlocation.UtilTools;

import android.content.Context;
import android.widget.Toast;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.smarthome.UtilTools
 * 文件名：  ToastUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 11:25
 * 描  述： Toast 统一管理类
 */

public class ToastUtils {
    private ToastUtils() {
        throw new UnsupportedOperationException("can not create");
    }

    public static boolean isOpen = true;

    /**
     * 短时间显示Toast
     */
    public static void showShort(Context context,CharSequence message){
        if(isOpen)
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    /**
     * 短时间显示Toast
     */
    public static void showShort(Context context,int message){
        if(isOpen)
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    /**
     * 长时间显示Toast
     */
    public static void showLong(Context context,CharSequence message){
        if(isOpen)
            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

    /**
     * 长时间显示Toast
     */
    public static void showLong(Context context,int message){
        if(isOpen)
            Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

    /**
     * 自定义显示Toast
     */
    public static void show(Context context,CharSequence message,int duration){
        if(isOpen)
            Toast.makeText(context,message,duration).show();
    }

    /**
     * 自定义显示Toast
     */
    public static void show(Context context,int message,int duration){
        if(isOpen)
            Toast.makeText(context,message,duration).show();
    }
}
