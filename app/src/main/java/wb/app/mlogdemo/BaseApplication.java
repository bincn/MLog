package wb.app.mlogdemo;

import android.app.Application;

import wb.app.library.MLog;

/**
 * Created by W.b on 2017/3/2.
 */
public class BaseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    MLog.init(BuildConfig.DEBUG);
  }
}
