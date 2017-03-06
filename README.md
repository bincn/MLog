## MLog

Android logger, simple and pretty (updating)

#### Features

- Show Thread information, Class information and Method information
- Pretty-print for json content
- Jump to source
- No Logcat 4000 limit

### Download

Gradle

<pre>
dependencies {
    compile 'com.github.mawb23.mlog:library:0.6.0'
}
</pre>

### Usage

init MLog in your Application

<pre>
public void onCreate() {
    super.onCreate();

    MLog.init(BuildConfig.DEBUG);
  }
</pre>

then use

<pre>
MLog.d();
MLog.i();
MLog.e();
MLog.json();
</pre>

### License

<pre>
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>