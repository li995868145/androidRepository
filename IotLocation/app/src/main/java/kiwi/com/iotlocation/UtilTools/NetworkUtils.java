package kiwi.com.iotlocation.UtilTools;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.com.iotutils.UtilTools
 * 文件名：  NetworkUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 18:34
 * 描  述： 网络相关工具类
 */

public class NetworkUtils {

    /**
     * 判断网络是否连接
     */
    public static boolean isConnetcd(Context context){

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if(cm != null){
            NetworkInfo ni = cm.getActiveNetworkInfo();

            if(ni != null && ni.isConnected()){
                return true;
            }
        }
        return false;
    }

    /**
     * 判断设备是否是wifi连接
     */
    public static boolean isWifiConnected(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm == null)
            return false;
        return cm.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_WIFI;
    }
}
