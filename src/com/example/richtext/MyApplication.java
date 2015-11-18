package com.example.richtext;

import com.example.richtext.imageloader.core.ImageLoader;
import com.example.richtext.imageloader.core.ImageLoaderConfiguration;
import com.example.richtext.utils.DebugTraceTool;

import android.app.Application;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		DebugTraceTool.debugTraceE(this, "application onCreate");
		
		// 初始化图片加载控件
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
		ImageLoader.getInstance().init(config);
	}

}