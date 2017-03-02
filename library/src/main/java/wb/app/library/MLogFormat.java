package wb.app.library;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.UnknownHostException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * 日志格式化类
 * <p>
 * Created by W.b on 2017/2/7.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class MLogFormat {

  // JSON 格式化首行缩进量
  private static final int JSON_INDENT = 4;
  // XML 格式化首行缩进量
  private static final int XML_INDENT = 4;
  // 换行符
  private static String LINE_SEPARATOR = lineSeparator();

  private static final char VERTICAL_BORDER_CHAR = '║';
  // Length: 100.
  private static final String TOP_HORIZONTAL_BORDER
      = "╔═════════════════════════════════════════════════"
      + "══════════════════════════════════════════════════";
  // Length: 100.
  private static final String BOTTOM_HORIZONTAL_BORDER
      = "╚═════════════════════════════════════════════════"
      + "══════════════════════════════════════════════════";

  // 控制台打印内容的格式
  private static final String PRINT_CONSOLE_FORMAT_MESSAGE
      = "%1$s.%2$s (%3$s:%4$d) Thread:%5$s" + LINE_SEPARATOR + "%6$s";

  /**
   * 格式化打印到控制台的信息
   *
   * @param message 信息
   * @param element 堆栈元素
   */
  public static String formatMessage(@NonNull String message, @NonNull StackTraceElement element) {
    String fileName = element.getFileName();
    int lineNumber = element.getLineNumber();
    String methodName = element.getMethodName();
    String threadName = Thread.currentThread().getName();
    return String.format(PRINT_CONSOLE_FORMAT_MESSAGE, getName(fileName, false), methodName, fileName, lineNumber, threadName, message);
  }

  /**
   * 获取类名
   */
  public static String getName(@NonNull String string, boolean end) {
    int dot = string.lastIndexOf('.');

    if (dot != -1) {
      if (end) {
        return string.substring(dot + 1);
      } else {
        return string.substring(0, dot);
      }
    }

    return string;
  }

  /**
   * Json 格式化
   */
  public static String formatJson(String json) {
    String formatJson = "";
    if (TextUtils.isEmpty(json)) {
      return formatJson;
    }

    try {
      if (json.startsWith("{")) {
        JSONObject jsonObject = new JSONObject(json);
        formatJson = jsonObject.toString(JSON_INDENT);
      } else if (json.startsWith("[")) {
        JSONArray jsonArray = new JSONArray(json);
        formatJson = jsonArray.toString(JSON_INDENT);
      } else {
        formatJson = json;
      }
    } catch (JSONException e) {
      formatJson = json;
    }

    return formatJson;
  }

  /**
   * XML 格式化
   */
  public static String formatXml(String xml) {
    String formatXML = "";
    if (xml == null || xml.trim().length() == 0) {
      return formatXML;
    }
    try {
      Source xmlInput = new StreamSource(new StringReader(xml));
      StreamResult xmlOutput = new StreamResult(new StringWriter());
      Transformer transformer = TransformerFactory.newInstance().newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
          String.valueOf(XML_INDENT));
      transformer.transform(xmlInput, xmlOutput);
      formatXML = xmlOutput.getWriter().toString().replaceFirst(">", ">" + LINE_SEPARATOR);
    } catch (Exception e) {
      formatXML = xml;

    }
    return formatXML;
  }

  /**
   * Throwable 格式化
   */
  public static String formatThrowable(Throwable throwable) {
    if (throwable == null) {
      return "";
    }
    Throwable t = throwable;
    while (t != null) {
      if (t instanceof UnknownHostException) {
        return "";
      }
      t = t.getCause();
    }

    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    throwable.printStackTrace(pw);
    pw.flush();
    return sw.toString();
  }

  /**
   * 格式化多个参数
   */
  public static String formatArgs(String format, Object... args) {
    if (format != null) {
      return String.format(format, args);
    } else {
      StringBuilder sb = new StringBuilder();
      for (int i = 0, N = args.length; i < N; i++) {
        if (i != 0) {
          sb.append(", ");
        }
        sb.append(args[i]);
      }
      return sb.toString();
    }
  }

  /**
   * 分割内容并格式化
   */
  public static String formatBorder(String[] segments) {
    if (segments == null || segments.length == 0) {
      return "";
    }
    String[] nonNullSegments = new String[segments.length];
    int nonNullCount = 0;
    for (String segment : segments) {
      if (segment != null) {
        nonNullSegments[nonNullCount++] = segment;
      }
    }
    if (nonNullCount == 0) {
      return "";
    }

    StringBuilder msgBuilder = new StringBuilder();
    msgBuilder.append(TOP_HORIZONTAL_BORDER).append(LINE_SEPARATOR);
    for (int i = 0; i < nonNullCount; i++) {
      msgBuilder.append(appendVerticalBorder(nonNullSegments[i]));
      if (i == nonNullCount - 1) {
        msgBuilder.append(LINE_SEPARATOR).append(BOTTOM_HORIZONTAL_BORDER);
      }
    }
    return msgBuilder.toString();
  }

  /**
   * 在每一行的开头拼接分隔符
   */
  private static String appendVerticalBorder(String msg) {
    StringBuilder borderedMsgBuilder = new StringBuilder(msg.length() + 10);
    String[] lines = msg.split(LINE_SEPARATOR);
    for (int i = 0, N = lines.length; i < N; i++) {
      if (i != 0) {
        borderedMsgBuilder.append(LINE_SEPARATOR);
      }
      String line = lines[i];
      borderedMsgBuilder.append(VERTICAL_BORDER_CHAR).append(' ').append(line);
    }
    return borderedMsgBuilder.toString();
  }

  /**
   * 获取系统换行符
   */
  @TargetApi(Build.VERSION_CODES.KITKAT)
  private static String lineSeparator() {
    try {
      Class.forName("android.os.Build");
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
        return System.lineSeparator();
      }
    } catch (Exception ignored) {
    }
    return "\n";
  }
}
