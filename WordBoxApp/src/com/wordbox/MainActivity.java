package com.wordbox;

import android.app.TabActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;

import com.example.wordboxapp.R;
import com.utils.CompFactory;
import com.wordbox.my.MyTabbar;
import com.wordbox.my.MylistActivity;
import com.workbox.mainTabView.MarketActivity;
import com.workbox.mainTabView.SettingActivity;
import com.workbox.mainTabView.WordActivity;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		Resources res = getResources();
		final TabHost tabHost = getTabHost(); 
		TabSpec spec;
		Intent intent;

		TabWidget WordWidget = getTabWidget();
		WordWidget.setLayoutParams(CompFactory.getLinearLayoutParam(LayoutParams.WRAP_CONTENT, 120,0)); //너비 700인듯
		
		tabHost.setBackgroundColor(Color.rgb(232, 232, 231));
		
		// 탭엑티비티 무조건 0번째 탭이 선택되어지는 버그를 회피하기 위한 코드
		intent = new Intent(this, BlankActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

		spec = tabHost.newTabSpec("").setIndicator("").setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildTabViewAt(0).setVisibility(View.GONE);
	
		
		// 첫번째 탭(1)
		intent = new Intent(this, MarketActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		spec = tabHost.newTabSpec("tag1").setIndicator(""
				/*getResources().getDrawable(R.drawable.market)*/)
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);
		tabHost.getTabWidget().getChildTabViewAt(1).setLayoutParams(CompFactory.getLinearLayoutParam(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,1));
		tabHost.getTabWidget().getChildTabViewAt(1).setPadding(0, 0, 0, 0);
		
		// 두번째 탭(2)
		intent = new Intent(this, WordActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		spec = tabHost.newTabSpec("tag2").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word);
		tabHost.getTabWidget().getChildTabViewAt(2).setLayoutParams(CompFactory.getLinearLayoutParam(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,1));
		// 세번째 탭(3)
		intent = new Intent(this, MylistActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		spec = tabHost.newTabSpec("tag3").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
		tabHost.getTabWidget().getChildTabViewAt(3).setLayoutParams(CompFactory.getLinearLayoutParam(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,1));
		// 세번째 탭(4)
		intent = new Intent(this, SettingActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		spec = tabHost.newTabSpec("tag4").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		tabHost.getTabWidget().getChildTabViewAt(4).setLayoutParams(CompFactory.getLinearLayoutParam(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,1));
		
		intent = new Intent(this, SettingActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		spec = tabHost.newTabSpec("tag5").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		
		tabHost.setCurrentTab(2);
		
		//----------------------------------------------------------------------------
		tabHost.getTabWidget().getChildTabViewAt(5).setVisibility(View.GONE);
		tabHost.getTabWidget().setBackgroundColor(Color.WHITE);
		//-----------------------------------------------------------------------
			tabHost.getTabWidget().getChildAt(1).setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO 자동 생성된 메소드 스텁
				tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market);
				tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word1);
				tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
				tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
				return false;
				}
			});
			//--------------------------------
			tabHost.getTabWidget().getChildAt(2).setOnTouchListener(new OnTouchListener(){


				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO 자동 생성된 메소드 스텁
					tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);
					tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word);
					tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
					tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
					return false;
					}
				});
			//--------------------------------------
			tabHost.getTabWidget().getChildAt(3).setOnTouchListener(new OnTouchListener(){


				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO 자동 생성된 메소드 스텁
					tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);
					tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word1);
					tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my);
					tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
					return false;
							
					
							
							
							
					}
				});
			//-----------------------------
			tabHost.getTabWidget().getChildAt(4).setOnTouchListener(new OnTouchListener(){


				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO 자동 생성된 메소드 스텁
					tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.market1);
					tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.word1);
					tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.my1);
					tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting);
					return false;
					}
				});
		}
		
		
	}
	
/*
 for(int i=1;i<4; i++){
tabHost.getTabWidget().getChildAt(i).setOnTouchListener(new OnTouchListener(){


	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO 자동 생성된 메소드 스텁
		 * if(i=1){
		 * tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
			tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
			tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
			tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		 * 
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		tabHost.getTabWidget().getChildAt(4).setBackgroundResource(R.drawable.setting1);
		return false;
		}
	});
	
}
*/
