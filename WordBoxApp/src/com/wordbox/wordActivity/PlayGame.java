package com.wordbox.wordActivity;

import android.app.ActivityGroup;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wordboxapp.R;
import com.wordbox.gameview.FourProblemGameView;
import com.wordbox.gameview.OXGameView;

public class PlayGame extends ActivityGroup 
{
	int type = 0;
	PlayGame playGame = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GameView();

	}//

	//Game First View
	public void GameView()
	{
		setContentView(R.layout.play_game);

		//첫번쨰 나눔(초급)
		TextView textView1 = (TextView)findViewById(R.id.textView1);
		textView1.setBackgroundColor(Color.GRAY);
		textView1.setHeight(80);
		textView1.setPadding(30, 20, 0, 0);
		textView1.setTextColor(Color.WHITE);

		//1번쨰 버튼 
		RelativeLayout flashCardLayout = (RelativeLayout)findViewById(R.id.relativelayot1);
		ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
		imageView1.setBackgroundResource(R.drawable.sample);
		imageView1.setMinimumHeight(100);
		imageView1.setMinimumWidth(100);

		//2번쨰 나눔(중급)
		TextView textView2 = (TextView)findViewById(R.id.textView2);
		textView2.setBackgroundColor(Color.GRAY);
		textView2.setHeight(80);
		textView2.setPadding(30, 20, 0, 0);
		textView2.setTextColor(Color.WHITE);

		//2번쨰버튼
		RelativeLayout FourProblemLayout = (RelativeLayout)findViewById(R.id.relativelayot2);
		ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
		imageView2.setBackgroundResource(R.drawable.wordlist);

		//3번쨰 버튼
		RelativeLayout OXProblemLayout = (RelativeLayout)findViewById(R.id.relativelayot3);
		ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
		imageView3.setBackgroundResource(R.drawable.ox_quiz_main);
		imageView3.setMinimumHeight(100);
		imageView3.setMinimumWidth(100);

		//------------------------onclicklistener---------------------------------------	

		flashCardLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				type = 1;
				
			}
		});


		FourProblemLayout.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = 2;
				FourProblemGameView.FourProblemView(playGame);
			}
		});


		OXProblemLayout.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				type = 3;
				OXGameView.OXView(playGame);
			}
		});

	}

	public void onBackPressed()
	{

		if(type != 0)
		{
			GameView();
			type=0;
		}else 
		{
			super.onBackPressed();

		}
	}//BackPressed 끝

}

