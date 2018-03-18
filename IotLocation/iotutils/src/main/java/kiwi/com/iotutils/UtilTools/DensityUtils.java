package kiwi.com.iotutils.UtilTools;

import android.content.Context;
import android.util.TypedValue;

/**
 * 项目名：  SmartHome
 * 包  名：  kiwi.smarthome.UtilTools
 * 文件名：  DensityUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 11:34
 * 描  述： 单位转换管理类
 */

public class DensityUtils {

    private DensityUtils(){
        throw new UnsupportedOperationException("DensityUtils");
    }

    /**
     * dp 转 px
     */
    public static int dp2px(Context context,float dpVal){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dpVal,
                context.getResources().getDisplayMetrics());
    }

    /**
     * sp 转 px
     */
    public static int sp2px(Context context,float spVal){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,spVal,
                context.getResources().getDisplayMetrics());
    }

    /**
     * px 转 dp
     */
    public static float px2dp(Context context,float pxVal){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * px 转 sp
     */
    public static float px2sp(Context context,float pxVal){
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (pxVal / scale);
    }
}
