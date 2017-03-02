## MLog

Android logger, simple and pretty (updating)

#### Features

- Show Thread information, Class information and Method information
- Pretty-print for json content
- Jump to source
- No Logcat 4000 limit

### Download

JCenter

<pre>
dependencies {
    compile ''
}
</pre>

### Usage

first init MLog in your Application

<pre>
public void onCreate() {
    super.onCreate();

    MLog.init(BuildConfig.DEBUG);
  }
</pre>

then log

<pre>
MLog.d();
MLog.i();
MLog.e();
MLog.json();
</pre>
