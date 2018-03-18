package kiwi.com.iotutils.UtilTools;

import android.os.Environment;
import android.os.StatFs;

import java.io.File;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.smarthome.UtilTools
 * 文件名：  SDCardUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 17:07
 * 描  述： SD 卡辅助管理类
 */

public class SDCardUtils {

    private SDCardUtils(){
        throw new UnsupportedOperationException("SDCardUtils");
    }

    /**
     * 判断SD卡是否可用
     * @return bool
     */
    public static boolean isSDCardEnable(){
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    /**
     * 获取SD路径
     */
    public static String getSDCardPath(){
        return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
    }

}
