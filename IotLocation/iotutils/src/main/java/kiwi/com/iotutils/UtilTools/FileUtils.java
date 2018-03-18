package kiwi.com.iotutils.UtilTools;

import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * Created by 99586 on 2018/3/10.
 */

public class FileUtils {

    /**
     * 函 数 名：isSdCardExist
     * 函数功能：判断SDCard是否存在 [当没有外挂SD卡时，内置ROM也被识别为存在sd卡]
     * 函数参数：无
     * 函数返回：true or false
     */
    public static boolean isSdCardExist() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    /**
     * 函 数 名：getSdCardPath
     * 函数功能：获取SD卡根目录路径
     * 函数参数：无
     * 函数返回：null or  path
     */
    public static String getSdCardPath() {

        boolean exist = isSdCardExist();
        String sdpath = "";

        if (exist) {
            sdpath = Environment.getExternalStorageDirectory()
                    .getAbsolutePath();
        } else {
            sdpath = "";
        }
        return sdpath;
    }

    /**
     * 函 数 名：getDefaultFilePath
     * 函数功能：获取文件默认路径
     * 函数参数：name 文件名
     * 函数返回：null or  path
     */
    public static String getDefaultFilePath(String name) {
        String filepath = "";
        File file = new File(Environment.getExternalStorageDirectory(), name);
        if (file.exists()) {
            filepath = file.getAbsolutePath();
        } else {
            filepath = "";
        }
        return filepath;
    }

    /**
     * 函 数 名：readFromStream
     * 函数功能：读取输入流中内容
     * 函数参数：inputStream 输入流， charsetName 字符集
     * 函数返回：读取到的字符串
     */
    public static String readFromStream(InputStream inputStream, String charsetName) {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, charsetName);
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer sb = new StringBuffer("");
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


    /**
     * 函 数 名：readFromStream
     * 函数功能：读取输入流中内容
     * 函数参数：
     * @param buffer   写入文件的内容
     * @param folder   保存文件的文件夹名称
     * @param append   是否追加写入，true为追加写入，false为重写文件
     * @param autoLine 针对追加模式，true为增加时换行，false为增加时不换行
     * 函数返回：无
     */
    public synchronized static void writeFileToSDCard(final byte[] buffer,final String folder,final String fileName,
                                                      final boolean append,final boolean autoLine) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean sdCardExist = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
                String folderPath = "";

                if (sdCardExist) {
                    //TextUtils为android自带的帮助类
                    if (TextUtils.isEmpty(folder)) {
                        //如果folder为空，则直接保存在sd卡的根目录
                        folderPath = Environment.getExternalStorageDirectory()
                                + File.separator;
                    } else {
                        folderPath = Environment.getExternalStorageDirectory()
                                + File.separator + folder + File.separator;
                    }
                } else {
                    return;
                }

                File fileDir = new File(folderPath);
                if (!fileDir.exists()) {
                    if (!fileDir.mkdirs()) {
                        return;
                    }
                }
                File file;
                //判断文件名是否为空
                if (TextUtils.isEmpty(fileName)) {
                    file = new File(folderPath + "app_log.txt");
                } else {
                    file = new File(folderPath + fileName);
                }
                RandomAccessFile raf = null;
                FileOutputStream out = null;
                try {
                    if (append) {
                        //如果为追加则在原来的基础上继续写文件
                        raf = new RandomAccessFile(file, "rw");
                        raf.seek(file.length());
                        raf.write(buffer);
                        if (autoLine) {
                            raf.write("\n".getBytes());
                        }
                    } else {
                        //重写文件，覆盖掉原来的数据
                        out = new FileOutputStream(file);
                        out.write(buffer);
                        out.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (raf != null) {
                            raf.close();
                        }
                        if (out != null) {
                            out.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    //////////////////////////////////////////////////////////////////////////
}
