package kiwi.com.iotutils.UtilTools;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * 项目名：  IotUtils
 * 包  名：  kiwi.smarthome.UtilTools
 * 文件名：  FontUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 0:07
 * 描  述： 设置字体工具类
 */

public class FontUtils {

    /**
     * 设置字体
     * @param context
     * @param view
     */
    public static void setFont(Context context, TextView view, String file){
        Typeface tf = Typeface.createFromAsset(context.getAssets(), file);
        view.setTypeface(tf);
    }

}
