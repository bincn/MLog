package wb.app.library;

import android.text.TextUtils;
import android.util.Log;

/**
 * 日志工具
 * <p>
 * Created by W.b on 2017/1/22.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class MLog {

    // 打印 Json 的级别, 默认使用 Log.d() 级别
    private static final int JSON = Log.DEBUG;
    // 限制每条 Log 最大输出
    private static final int CHUNK_SIZE = 3200;
    // 默认显示 Log
    private static boolean mIsShowLog = true;

    public static void init(boolean isShowLog) {
        mIsShowLog = isShowLog;
    }

    public static void d(String message) {
        print(false, Log.DEBUG, null, message);
    }

    public static void d(String tag, String message) {
        print(false, Log.DEBUG, tag, message);
    }

    public static void i(String message) {
        print(false, Log.INFO, null, message);
    }

    public static void i(String tag, String message) {
        print(false, Log.INFO, tag, message);
    }

    public static void e(String message) {
        print(false, Log.ERROR, null, message);
    }

    public static void e(String tag, String message) {
        print(false, Log.ERROR, tag, message);
    }

    public static void json(String message) {
        print(true, JSON, null, message);
    }

    public static void json(String tag, String message) {
        print(true, JSON, tag, message);
    }

    /**
     * 日志打印
     *
     * @param level   级别
     * @param tag     标签
     * @param message 信息
     */
    private static void print(boolean isJson, int level, String tag, String message) {
        if (!mIsShowLog) {
            return;
        }

        //获取方法的调用堆栈数组
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //本地方法的调用堆栈信息
        StackTraceElement element = elements[4];
        if (TextUtils.isEmpty(tag)) {
            tag = MLogFormat.getName(element.getClassName(), true);
        }

        if (isJson && level == JSON) {
            print(true, level, tag, message, element);
        } else {
            print(false, level, tag, message, element);
        }
    }

    /**
     * 日志打印
     *
     * @param isJson  是否打印 Json
     * @param level   级别
     * @param tag     标签
     * @param message 信息
     * @param element 堆栈元素
     */
    private static void print(boolean isJson, int level, String tag, String message, StackTraceElement element) {
        if (isJson) {
            message = MLogFormat.formatJson(message);
        }
        String formatMessage = MLogFormat.formatMessage(message, element);
        println(level, tag, MLogFormat.formatBorder(new String[]{formatMessage}));
    }

    /**
     * 分割要打印的内容，确保日志不会被系统截断
     *
     * @param level   级别
     * @param tag     标签
     * @param message 消息
     */
    private static void println(int level, String tag, String message) {
        if (message.length() <= CHUNK_SIZE) {
            printChunk(level, tag, message);
            return;
        }

        int msgLength = message.length();
        int start = 0;
        int end = start + CHUNK_SIZE;
        while (start < msgLength) {
            printChunk(level, tag, message.substring(start, end));

            start = end;
            end = Math.min(start + CHUNK_SIZE, msgLength);
        }
    }

    /**
     * 调用系统的日志打印方法
     *
     * @param level   级别
     * @param tag     标签
     * @param message 消息
     */
    private static void printChunk(int level, String tag, String message) {
        android.util.Log.println(level, tag, message);
    }
}
