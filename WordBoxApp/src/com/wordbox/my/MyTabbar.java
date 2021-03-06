 package com.wordbox.my;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.example.wordboxapp.R;

public class MyTabbar extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        
        Resources res = getResources();
		final TabHost tabHost = getTabHost();
		TabSpec spec;
		Intent intent;
		

		// 첫번째 탭(1)
		intent = new Intent(this, MylistActivity.class);
		spec = tabHost.newTabSpec("tab1").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildTabViewAt(0).setBackgroundResource(R.drawable.test1);
		
		// 두번째 탭(2)
		intent = new Intent(this, Mypage.class);
		spec = tabHost.newTabSpec("tab2").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildTabViewAt(1).setBackgroundResource(R.drawable.learning1);
		
		//(3) 파란색 없앨려고 없애줄 부분
		/*intent = new Intent(this, SettingActivity.class);
		spec = tabHost.newTabSpec("tag3").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		
		tabHost.getTabWidget().getChildTabViewAt(2).setVisibility(View.GONE);*/
		
		
		
		tabHost.getTabWidget().getChildTabViewAt(0).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				tabHost.getTabWidget().getChildTabViewAt(0).setBackgroundResource(R.drawable.test1);
				tabHost.getTabWidget().getChildTabViewAt(1).setBackgroundResource(R.drawable.learning1);
				return false;
			}
		});
		
		tabHost.getTabWidget().getChildTabViewAt(1).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				tabHost.getTabWidget().getChildTabViewAt(0).setBackgroundResource(R.drawable.test2);	
				tabHost.getTabWidget().getChildTabViewAt(1).setBackgroundResource(R.drawable.learning2);
				return false;
			}
		});

		
	}


}
