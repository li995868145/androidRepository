package kiwi.com.iotutils.UtilTools;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * 项目名：  IotUtils
 * 包  名：  kiwi.com.iotutils.UtilTools
 * 文件名：  KeyBoardUtils
 * 创建者：  kiwi
 * 时  间：  2018/3/17 18:21
 * 描  述： 软键盘工具类
 */

public class KeyBoardUtils {

    /**
     * 打开软键盘
     */
    public static void openKeyBoard(Context context, EditText editText){
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);

        boolean b = imm.showSoftInput(editText,InputMethodManager.RESULT_SHOWN);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    /**
     * 关闭软键盘
     */
    public static void closeKeyBoard(Context context,EditText meditText){
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(meditText.getWindowToken(), 0);
    }
}
