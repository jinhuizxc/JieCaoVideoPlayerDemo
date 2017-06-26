# JieCaoVideoPlayerDemo
练手项目！
# 就看天气
[![Bulid Status](https://travis-ci.org/xcc3641/SeeWeather.svg?branch=master)](https://travis-ci.org/xcc3641/SeeWeather)

就看天气该应用就是如同它的名字一样，只做一个单纯、简单的看天气软件。这么多天气软件，你选择了我，这是我的幸运。


从15年10月上线，到目前经历两次重大改版，一次代码的重构，一次界面的大幅度改动，目的都是为了你们。
在开源的过程中，收到了很多来自有趣的你们的邮件。我也曾遇到过棘手的问题无处咨询又谷歌不到。那个时候的我，也可能是现在的你。所以我希望能够帮助到你。

----
# 简介
就看天气——是一款遵循 **Material Design** 风格的只看天气的APP。
- 卡片展现（当前天气情况，未来几小时天气情况，生活建议，一周七天概况）
- 缓存数据，减少网络请求，保证离线查看
- 内置两套图标（设置里更改）

----
权限说明

'''xml

<!--用于进行网络定位-->
	<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
	<!--用于访问GPS定位-->
	<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
	<!--获取运营商信息，用于支持提供运营商信息相关的接口-->
	<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
	<!--用于访问wifi网络信息，wifi信息会用于进行网络定位-->
	<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
	<!--这个权限用于获取wifi的获取权限，wifi信息会用来进行网络定位-->
	<uses-permission android:name="android.permission.CHANGE_WIFI_STATE"/>
	<!--用于访问网络，网络定位需要上网-->
	<uses-permission android:name="android.permission.INTERNET"/>
	<!--用于读取手机当前的状态-->
	<uses-permission android:name="android.permission.READ_PHONE_STATE"/>
	<!--写入扩展存储，向扩展卡写入数据，用于写入缓存定位数据-->
	<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
	<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>


'''
