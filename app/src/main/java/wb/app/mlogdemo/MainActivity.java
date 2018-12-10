package wb.app.mlogdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import wb.app.library.MLog;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MLog";
  private static final String STRING = "hello world";
  private static final String STRING_LONG = "standard 模式这是默认模式，每次激活Activity时都会创\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "比如：A -> B (singleInstance) -> C，完全退出后，在此启动，首先打开的是B。\n"
      + "standard 模式这是默认模式，每次激活Activity时都会创\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "比如：A -> B (singleInstance) -> C，完全退出后，在此启动，首先打开的是B。\n"
      + "standard 模式这是默认模式，每次激活Activity时都会创\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "比如：A -> B (singleInstance) -> C，完全退出后，在此启动，首先打开的是B。\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "比如：A -> B (singleInstance) -> C，完全退出后，在此启动，首先打开的是B。\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "比如：A -> B (singleInstance) -> C，完全退出后，在此启动，首先打开的是B。\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n"
      + "栈顶，即使栈中已经存在该Activity的实例，只要不在栈顶，都会创建新的实例。使用场景如新闻类或者阅读\n"
      + "类App的内容页面。singleTask 模式如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的 \n"
      + "onNewIntent() )。重用时，会让该实例回到栈顶，因此在它上面的实例将会被移出栈。如果栈中不存在该实\n"
      + "例，将会创建新的实例放入栈中。使用场景如浏览器的主界面。不管从多少个应用启动浏览器，只会启动主界面\n"
      + "一次，其余情况都会走onNewIntent，并且会清空主界面上面的其他页面。singleInstance 模式在一个新\n"
      + "栈中创建该Activity的实例，并让多个应用共享该栈中的该Activity实例。一旦该模式的Activity实例已\n"
      + "经存在于某个栈中，任何应用再激活该Activity时都会重用该栈中的实例( 会调用实例的 onNewIntent() )。\n"
      + "其效果相当于多个应用共享一个应用，不管谁激活该 Activity 都会进入同一个应用中。使用场景如闹铃提醒，\n"
      + "将闹铃提醒与闹铃设置分离。singleInstance不要用于中间页面，如果用于中间页面，跳转会有问题，\n"
      + "建Activity实例，并放入任务栈中。使用场景：大多数Activity。singleTop 模式如果在任务的栈顶正好\n"
      + "存在该Activity的实例，就重用该实例( 会调用实例的 onNewIntent() )，否则就会创建新的实例并放入\n";
  private static final String JSON = "{\"data\":{\"default\":{\"cvalue\":\"厦门\",\"cid\":1},\"future\":[\"大理\",\"三亚\",\"京都\",\"宁波\",\"福州\",\"曼谷\",\"大连\"],\"page\":{\"pageCount\":1,\"pageSize\":1000,\"pagesNo\":1,\"result\":[{\"isInland\":\"1\",\"cvalue\":\"厦门\",\"cid\":1},{\"isInland\":\"1\",\"cvalue\":\"杭州\",\"cid\":3},{\"isInland\":\"1\",\"cvalue\":\"南京\",\"cid\":5},{\"isInland\":\"1\",\"cvalue\":\"苏州\",\"cid\":6},{\"isInland\":\"1\",\"cvalue\":\"成都\",\"cid\":8},{\"isInland\":\"1\",\"cvalue\":\"重庆\",\"cid\":9},{\"isInland\":\"1\",\"cvalue\":\"武汉\",\"cid\":16},{\"isInland\":\"1\",\"cvalue\":\"西安\",\"cid\":17},{\"isInland\":\"1\",\"cvalue\":\"青岛\",\"cid\":21},{\"isInland\":\"1\",\"cvalue\":\"合肥\",\"cid\":110},{\"isInland\":\"1\",\"cvalue\":\"长沙\",\"cid\":344},{\"isInland\":\"1\",\"cvalue\":\"台北\",\"cid\":2335},{\"isInland\":\"0\",\"cvalue\":\"首尔\",\"cid\":2369}],\"resultCount\":13,\"rowCount\":13,\"rowEnd\":13,\"rowStart\":0}},\"errorCode\":\"0x0\",\"exception\":\"\",\"msg\":\"success\",\"result\":true}";
  private static final String JSON_LONG = "{\"data\":[{\"en\":\"No Paprika No Dinner\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_001\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_001_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_001_23s.png\",\"intro\":\"爽了嘴巴，卖了菊花\",\"isHot\":false,\"rgb\":\"8d7063\",\"sceneContent\":\"所谓“辣”，可算是一种销魂蚀骨的体验，我告诉你，你有胆去吗？\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_001.png_15\",\"sceneId\":1,\"sceneName\":\"无辣不欢\",\"sceneTitle\":[\"餐厅\"],\"width\":\"602\"},{\"en\":\"Night Snack\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_002\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_002_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_002_23s.png\",\"intro\":\"朋友圈刷存在感的神技\",\"isHot\":false,\"rgb\":\"9d4d5d\",\"sceneContent\":\"午夜12点后，是都市人夜晚最温情的记忆，不仅是一场好梦，还要想想如何温暖你的胃与心？何必在街头茫然的徘徊，这些还没打烊的店，也许可以给你这个夜猫子一些安慰\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_002.png_15\",\"sceneId\":2,\"sceneName\":\"深夜食堂\",\"sceneTitle\":[\"餐厅\"],\"width\":\"602\"},{\"en\":\"I`m the best nanny\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_003\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_003_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_003_23s.png\",\"intro\":\"我还是个宝宝，不知道什么叫乖乖听话\",\"isHot\":false,\"rgb\":\"937e6a\",\"sceneContent\":\"不是熊孩子难带，而是你带他去错了地方，get到新技能了吗？\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_003.png_15\",\"sceneId\":3,\"sceneName\":\"家有熊孩子\",\"sceneTitle\":[\"美食\",\"住宿\",\"娱乐\"],\"width\":\"602\"},{\"en\":\"LOL\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_004\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_004_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_004_23s.png\",\"intro\":\"“滚床单嘛？”“滚！”\",\"isHot\":false,\"rgb\":\"ad8b8b\",\"sceneContent\":\"住惯了千篇一律的连锁酒店，融入感情的民宿却更易打动人心，它不再是匆匆下榻而过的冰冷房间，每一间民宿都能改变你的生活节奏，让你慢下来，在这儿，别怕时光浪费\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_004.png_15\",\"sceneId\":4,\"sceneName\":\"滚滚床单\",\"sceneTitle\":[\"精品民宿\"],\"width\":\"602\"},{\"en\":\"Buffet Dinner My Love\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_005\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_005_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_005_23s.png\",\"intro\":\"进阶奥义：爬着进，滚着出\",\"isHot\":false,\"rgb\":\"a1a187\",\"sceneContent\":\"在美食界里，自助餐绝对是每个吃货心目中的“必战之地”，它考验着你的食量和美食神经，要修炼成一个合格的吃货，不吃回本哪行，地址都给你了，还在等啥呢。\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_005.png_15\",\"sceneId\":5,\"sceneName\":\"给钱随便吃\",\"sceneTitle\":[\"自助餐\"],\"width\":\"602\"},{\"en\":\"Cafe Compass\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_006\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_006_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_006_23s.png\",\"intro\":\"撩妹不在咖啡馆,就在去咖啡馆的路上\",\"isHot\":false,\"rgb\":\"9b9b92\",\"sceneContent\":\"“如果我不在咖啡馆，那么我就在去咖啡馆的路上”。总喜欢在一家咖啡店里度过悠闲的时光，一杯苦涩入口，再悠悠转化成耐人寻味的甘甜，这时再配上可口的点心，鼻口心间都是浓浓的馨香，打开这份地图，把生活变成一份热爱。\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_006.png_15\",\"sceneId\":6,\"sceneName\":\"咖啡时光\",\"sceneTitle\":[\"咖啡馆\"],\"width\":\"602\"},{\"en\":\"Light Meal\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_007\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_007_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_007_23s.png\",\"intro\":\"你养什么？我养生\",\"isHot\":false,\"rgb\":\"8e827c\",\"sceneContent\":\"盛夏已至，阳气旺盛的时节，食欲自然不抵春秋。就让轻食来开味！画风清淡的绿色低脂，却可以让身体变得异常轻盈。以及，三月不减肥,四五六七月徒伤悲这种事情还需要我来提醒你吗？\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_007.png_15\",\"sceneId\":7,\"sceneName\":\"轻食主义\",\"sceneTitle\":[\"餐厅\"],\"width\":\"602\"},{\"en\":\"The best Sushi\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_008\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_008_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_008_23s.png\",\"intro\":\"错过了这些，你就等着难过吧\",\"isHot\":false,\"rgb\":\"d8d8d8\",\"sceneContent\":\"如果说火锅是吃货们在冬天的必修课，那么日料大概就是夏天里的真爱伴侣了。凉凉的生鱼再配上一杯温热且清爽的抹茶，简直就是一场舒服的胃部massage\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_008.png_15\",\"sceneId\":8,\"sceneName\":\"芥末大作战\",\"sceneTitle\":[\"日本料理\"],\"width\":\"602\"},{\"en\":\"Join A,Party\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_009\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_009_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_009_23s.png\",\"intro\":\"记得叫上隔壁老王家儿子的同学的表哥的朋友\",\"isHot\":false,\"rgb\":\"977b72\",\"sceneContent\":\"还有什么事比一大帮没心没肺的好友相聚玩耍更美好呢！能挤得下这么多人，还得吃的过瘾，玩得起来，除了这些地方也没谁了！\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_009.png_15\",\"sceneId\":9,\"sceneName\":\"Party组织者\",\"sceneTitle\":[\"聚会\",\"轰趴\"],\"width\":\"602\"},{\"en\":\"Different Delicious\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_010\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_010_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_010_23s.png\",\"intro\":\"身未动，嘴已远\",\"isHot\":false,\"rgb\":\"7a664f\",\"sceneContent\":\"都说美食无国界，无论是哪种方式，什么样的心境，都能邂逅属于这个美好世界的不同可能，是时候换个口味调动一下你的味蕾达\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_010.png_15\",\"sceneId\":10,\"sceneName\":\"异国食尚\",\"sceneTitle\":[\"餐厅\"],\"width\":\"602\"},{\"en\":\"Good good study\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_011\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_011_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_011_23s.png\",\"intro\":\"学海无涯，回头是岸\",\"isHot\":false,\"rgb\":\"91838c\",\"sceneContent\":\"对爱书者而言，书店，是灵魂寄托的地方。毕竟，心境是自己的，阅读是寂寞的，不要被任何人左右。读一本好书胜过行万里路。一座独立的书店，满溢的人文气息，你愿意做一个爱看书的学霸吗？毕竟，学霸无论在哪都是自带光环的！\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_011.png_15\",\"sceneId\":11,\"sceneName\":\"好好学习\",\"sceneTitle\":[\"书店\"],\"width\":\"602\"},{\"en\":\"Brain Storm\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_012\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_012_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_012_23s.png\",\"intro\":\"神一样的对手和猪一样的队友，这里都有\",\"isHot\":false,\"rgb\":\"b79089\",\"sceneContent\":\"玩腻了无脑型的休闲手游,是不是偶尔也想来点烧脑和刺激的体验？喏，给你一个拼智商，斗学霸的好机会！哦对了，希望你不要碰到猪一样的队友......\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_012.png_15\",\"sceneId\":12,\"sceneName\":\"头脑风暴\",\"sceneTitle\":[\"密室\",\"桌游\"],\"width\":\"602\"},{\"en\":\"Foodie`s Club\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_013\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_013_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_013_23s.png\",\"intro\":\"每个人的身体里都有个胖子，只不过有的人装得下，有的人装不下\",\"isHot\":false,\"rgb\":\"98898d\",\"sceneContent\":\"吃货们的世界，只要有得吃，什么烦恼什么压力，通通都是浮云。可是吃货也分高中低等级，美味往往都藏在城市里的各个角落，作为一名成功的吃货，这些好店掘地三尺也要找出来啊！\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_013.png_15\",\"sceneId\":13,\"sceneName\":\"吃货的借口\",\"sceneTitle\":[\"餐厅\"],\"width\":\"602\"},{\"en\":\"Deep Sleep\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_014\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_014_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_014_23s.png\",\"intro\":\"要有梦想，还得要有个合适的地方做它\",\"isHot\":false,\"rgb\":\"8792a4\",\"sceneContent\":\"为了让大家可以睡个好觉，我们也是操碎了心。\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_014.png_15\",\"sceneId\":14,\"sceneName\":\"民宿小筑\",\"sceneTitle\":[\"酒店\",\"民宿\"],\"width\":\"602\"},{\"en\":\"Go To Town\",\"height\":\"690\",\"iconUrl\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_015\",\"iconUrlBig\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_015_23b.png\",\"iconUrlSmall\":\"http://7vzrp0.com5.z0.glb.clouddn.com/scene/code_015_23s.png\",\"intro\":\"老司机：没时间了，先上车再买票\",\"isHot\":false,\"rgb\":\"a7977a\",\"sceneContent\":\"能站着绝对不坐着，能坐着绝对不躺着，能出门作妖绝不甘心宅到发霉。有条件要出去浪，没条件创造条件也要浪，人生苦短，寻欢作乐刻不容缓。\",\"sceneCover\":\"http://7xo7f0.com1.z0.glb.clouddn.com/scene/code_015.png_15\",\"sceneId\":15,\"sceneName\":\"寻欢作乐\",\"sceneTitle\":[\"一个不下雪的圣诞夜 音乐也许是最梦幻搭配\"],\"width\":\"602\"}],\"errorCode\":\"0x0\",\"exception\":\"\",\"msg\":\"success\",\"result\":true}";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void LogString(View view) {
    MLog.d(STRING);
    MLog.i(STRING);
    MLog.e(STRING);
  }

  public void LogStringWithTag(View view) {
    MLog.d(TAG, STRING);
    MLog.i(TAG, STRING);
    MLog.e(TAG, STRING);
  }

  public void LogJson(View view) {
    MLog.json(JSON);
  }

  public void LogLongContent(View view) {
    MLog.d(STRING_LONG);
    MLog.json(JSON_LONG);
  }
}
