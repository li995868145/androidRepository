package kiwi.com.iotutils.UtilTools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * 项目名：  IoUtils
 * 包  名：  kiwi.com.iotutils.UtilTools;
 * 文件名：  AppUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 18:00
 * 描  述：  应用程序相关信息工具类
 */

public class AppUtils {

    /**
     * 获取应用程序名称
     */
    public static String getAppName(Context context){
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            int labelRes = pi.applicationInfo.labelRes;
            return context.getResources().getString(labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取应用程序版本
     */
    public static String getAppVersionName(Context context){
        PackageManager pm = context.getPackageManager();

        try {
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);

            return pi.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
