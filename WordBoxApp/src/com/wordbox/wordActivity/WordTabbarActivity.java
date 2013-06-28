 package com.wordbox.wordActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TabHost;

import com.example.wordboxapp.R;
import com.wordbox.BlankActivity;

public class WordTabbarActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word_tabbar);
		
		Resources res = getResources();
		final TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;

		// Ã¹¹øÂ° ÅÇ(1)
		intent = new Intent(this, TofleWordActivity.class);
		spec = tabHost.newTabSpec("tab1").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildTabViewAt(0).setBackgroundResource(R.drawable.see_word1);

		// µÎ¹øÂ° ÅÇ(2)
		intent = new Intent(this, PlayGame.class);
		spec = tabHost.newTabSpec("tab2").setIndicator("")
				.setContent(intent);
		tabHost.addTab(spec);
		tabHost.getTabWidget().getChildTabViewAt(1).setBackgroundResource(R.drawable.play_game1);
		

		

		tabHost.getTabWidget().getChildTabViewAt(0).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				tabHost.getTabWidget().getChildTabViewAt(0).setBackgroundResource(R.drawable.see_word1);
				tabHost.getTabWidget().getChildTabViewAt(1).setBackgroundResource(R.drawable.play_game1);
				return false;
			}
		});
		
		tabHost.getTabWidget().getChildTabViewAt(1).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				tabHost.getTabWidget().getChildTabViewAt(0).setBackgroundResource(R.drawable.see_word);			
				tabHost.getTabWidget().getChildTabViewAt(1).setBackgroundResource(R.drawable.play_game2);
				return false;
			}
		});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.word_tabbar, menu);
		return true;
	}

}
