package com.workbox.mainTabView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

import com.example.wordboxapp.R;
import com.utils.CompFactory;
import com.utils.HorizontalPager;
import com.utils.MarginPadding;
import com.wordbox.gameview.FourProblemGameView;
import com.wordbox.gameview.OXGameView;

public class WordActivity extends Activity {
	int type=0;
	WordActivity wordactivity = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		WordList();

	}



	private final HorizontalPager.OnScreenSwitchListener onScreenSwitchListener =
			new HorizontalPager.OnScreenSwitchListener() {
		@Override
		public void onScreenSwitched(final int screen) {

			Log.d("HorizontalPager", "switched to screen: " + screen);
		}
	};


	public void WordList(){
		type = 0;
		HorizontalScrollView scrollView = (HorizontalScrollView)findViewById(R.id.wordListScrollView);
		//Get From Server
		String WordTitle[] = {"Toefl", "Toeic", "Teps", "Toefl", "Toeic", "Teps"};
		//int WordIDs[] = {1,2,3,4,5,6};
		HorizontalPager realViewSwitcher = new HorizontalPager(this);

		int a = WordTitle.length / 4;
		// Add some views to it
		for (int i = 0; i < 3; i++) {


			RelativeLayout WordTitleButtonUp1 = CompFactory.detailRelativeLayout(this, 250, 250, 
					-1,new MarginPadding(70,140,0,0),new MarginPadding(), R.drawable.wordlist);

			WordTitleButtonUp1.addView(WordCount());
			WordTitleButtonUp1.addView(WordTitle());
			WordTitleButtonUp1.addView(CorrectPercent());


			RelativeLayout WordTitleButtonUp2 = CompFactory.detailRelativeLayout(this, 250, 250, 
					-1,new MarginPadding(70,140,0,0),new MarginPadding(), R.drawable.wordlist);


			WordTitleButtonUp2.addView(WordCount());
			WordTitleButtonUp2.addView(WordTitle());
			WordTitleButtonUp2.addView(CorrectPercent());


			//상단 버튼 부분
			LinearLayout WordTitleLayoutUp = CompFactory.getdetailLinearLayoutParam(this, ViewGroup.LayoutParams.MATCH_PARENT, 
					ViewGroup.LayoutParams.WRAP_CONTENT, -1, -1f, LinearLayout.HORIZONTAL);

			WordTitleLayoutUp.addView(WordTitleButtonUp1);//addView
			WordTitleLayoutUp.addView(WordTitleButtonUp2);


			RelativeLayout WordTitleButtonDown1 = CompFactory.detailRelativeLayout(this, 250, 250, 
					-1,new MarginPadding(70,140,0,0),new MarginPadding(), R.drawable.wordlist);


			WordTitleButtonDown1.addView(WordCount());
			WordTitleButtonDown1.addView(WordTitle());
			WordTitleButtonDown1.addView(CorrectPercent());

			RelativeLayout WordTitleButtonDown2 = CompFactory.detailRelativeLayout(this, 250, 250, 
					-1,new MarginPadding(70,140,0,0),new MarginPadding(), R.drawable.wordlist);


			WordTitleButtonDown2.addView(WordCount());
			WordTitleButtonDown2.addView(WordTitle());
			WordTitleButtonDown2.addView(CorrectPercent());

			//하단 버튼 부분
			LinearLayout WordTitleLayoutDown = CompFactory.getdetailLinearLayoutParam(this, ViewGroup.LayoutParams.MATCH_PARENT, 
					ViewGroup.LayoutParams.WRAP_CONTENT, -1, -1f, LinearLayout.HORIZONTAL);

			WordTitleLayoutDown.addView(WordTitleButtonDown1);

			WordTitleLayoutDown.addView(WordTitleButtonDown2);



			LinearLayout WordTitleLayout = CompFactory.getdetailLinearLayoutParam(this, ViewGroup.LayoutParams.MATCH_PARENT, 
					ViewGroup.LayoutParams.MATCH_PARENT, -1, -1f, LinearLayout.VERTICAL);
		

			WordTitleLayout.addView(WordTitleLayoutUp);//addView
			WordTitleLayout.addView(WordTitleLayoutDown);//addView
			realViewSwitcher.addView(WordTitleLayout);


			WordTitleButtonUp1.setOnClickListener(new OnClickListener() {	
				@Override
				public void onClick(View v) {		
					wordList();

				}
			});
			WordTitleButtonUp2.setOnClickListener(new OnClickListener() {	
				@Override
				public void onClick(View v) {		
					wordList();

				}
			});
			WordTitleButtonDown1.setOnClickListener(new OnClickListener() {	
				@Override
				public void onClick(View v) {		
					wordList();

				}
			});
			WordTitleButtonDown2.setOnClickListener(new OnClickListener() {	
				@Override
				public void onClick(View v) {		
					wordList();
				}
			});

		}

		// set as content view
		setContentView(realViewSwitcher);
		realViewSwitcher.setOnScreenSwitchListener(onScreenSwitchListener);

	}

	public View WordCount(){
		TextView WordCount = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLACK, "100개", 10, new MarginPadding(18,8,0,0),new MarginPadding(), -1,
				ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
		return WordCount;
	}
	public View WordTitle(){
		TextView WordTitle = CompFactory.detailTextView(this, Color.rgb(0, 164, 255), Color.WHITE, "TOFLE", 15, new MarginPadding(), 
				new MarginPadding(),RelativeLayout.CENTER_IN_PARENT,ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
		WordTitle.setGravity(Gravity.CENTER_HORIZONTAL);

		return WordTitle;
	}
	public View CorrectPercent(){	
		TextView correctPercent = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.WHITE, "맞은단어 0%", 8, 
				new MarginPadding(), new MarginPadding(),RelativeLayout.ALIGN_PARENT_BOTTOM,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);	

		correctPercent.setGravity(Gravity.CENTER);
		return correctPercent;
	}

	
//------------------------------------------------WordList-----------------------------------------------------------
public void wordList()
{
	type = 1;
	String Words[] = {"TOFLE Word","TOFLE Word","TOFLE Word","TOFLE Word","TOFLE Word","TOFLE Word"};
	String Means[] = {"TOFLE Word","TOFLE Word","TOFLE Word","TOFLE Word","TOFLE Word","TOFLE Word"};
	

	setContentView(R.layout.activity_tofle_word);
	TableLayout tableLayout = (TableLayout)findViewById(R.id.tablelayout1);
	Bundle b = getIntent().getExtras();
	
	for(int i=0;i<Words.length;i++){
		
		LayoutParams buttonParams1 = new LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		buttonParams1.gravity=Gravity.CENTER;
		buttonParams1.leftMargin=20;
	

		//button 꾸밈
		TextView tv1 = new TextView(this);
		tv1.setText(Words[i]);
		tv1.setTextSize(15);
		tv1.setTextColor(Color.BLACK);
		tv1.setLayoutParams(buttonParams1);
		tv1.setGravity(Gravity.CENTER);
		
		LayoutParams buttonParams2 = new LayoutParams();
		buttonParams2.gravity=Gravity.CENTER;
		
		TextView tv2 = new TextView(this);
		tv2.setText("  :  ");
		tv2.setTextSize(15);
		tv2.setTextColor(Color.BLACK);
		tv2.setLayoutParams(buttonParams2);
		tv2.setGravity(Gravity.CENTER);
		
		
		LayoutParams buttonParams3 = new LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		buttonParams3.gravity=Gravity.CENTER;
		
		TextView tv3 = new TextView(this);
		tv3.setText(Means[i]);
		tv3.setTextSize(15);
		tv3.setTextColor(Color.BLACK);
		tv3.setLayoutParams(buttonParams3);
		tv3.setGravity(Gravity.CENTER);

		LayoutParams buttonParams4 = new LayoutParams();
		buttonParams3.height=150;

		TableRow tablerow1 = new TableRow(this);
		tablerow1.addView(tv1);
		tablerow1.addView(tv2);
		tablerow1.addView(tv3);
		tablerow1.setBackgroundResource(R.drawable.wordlistbg);
		tablerow1.setLayoutParams(buttonParams4);
		tablerow1.setMinimumHeight(150);
		
		tableLayout.addView(tablerow1);
	}
	//--------------아래 탭바---------------

	final LinearLayout barLayout = (LinearLayout)findViewById(R.id.wordListNav);
	
	Button leftBarButton = (Button)findViewById(R.id.wordListLeftNav);
	//leftBarButton.setHeight(100);
	
	Button rightBarButton = (Button)findViewById(R.id.wordListRightNav);
	//rightBarButton.setHeight(100);
	

	leftBarButton.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			wordList();
			barLayout.setBackgroundResource(R.drawable.word_list_navi_02);
			
		}
	});

	rightBarButton.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			GameView();
			barLayout.setBackgroundResource(R.drawable.word_list_navi_01);
			
		}
	});
	

}

//--------------------------------------------GameView------------------------------------------------
public void GameView()
{
	int correctCount[] = {1,2,3,4,5};
	int a = 20;
	
	type = 1;
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
	
	ProgressBar flashCardProgressBar1 = (ProgressBar)findViewById(R.id.progressBar1);
	flashCardProgressBar1.setProgress(a);
	ProgressBar flashCardProgressBar2 = (ProgressBar)findViewById(R.id.progressBar2);
	flashCardProgressBar2.setProgress(a);

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

	ProgressBar flashCardProgressBar3 = (ProgressBar)findViewById(R.id.progressBar3);
	flashCardProgressBar3.setProgress(a);
	ProgressBar flashCardProgressBar4 = (ProgressBar)findViewById(R.id.progressBar4);
	flashCardProgressBar4.setProgress(a);

	//3번쨰 버튼
	RelativeLayout OXProblemLayout = (RelativeLayout)findViewById(R.id.relativelayot3);
	ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
	imageView3.setBackgroundResource(R.drawable.ox_quiz_main);
	imageView3.setMinimumHeight(100);
	imageView3.setMinimumWidth(100);
	
	ProgressBar flashCardProgressBar5 = (ProgressBar)findViewById(R.id.progressBar5);
	flashCardProgressBar5.setProgress(a);
	ProgressBar flashCardProgressBar6 = (ProgressBar)findViewById(R.id.progressBar6);
	flashCardProgressBar6.setProgress(a);


	//------------------------onclicklistener---------------------------------------	

	flashCardLayout.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			type = 2;
			
		}
	});


	FourProblemLayout.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			type = 2;
			FourProblemGameView.FourProblemView(wordactivity);
		}
	});


	OXProblemLayout.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View v){
			type = 2;
			OXGameView.OXView(wordactivity);
		}
	});
	
	
	

	final LinearLayout barLayout = (LinearLayout)findViewById(R.id.wordListNav);
	
	Button leftBarButton = (Button)findViewById(R.id.wordListLeftNav);
	//leftBarButton.setHeight(100);
	
	Button rightBarButton = (Button)findViewById(R.id.wordListRightNav);
	//rightBarButton.setHeight(100);
	

	leftBarButton.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			wordList();
			barLayout.setBackgroundResource(R.drawable.word_list_navi_02);
			
		}
	});

	rightBarButton.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			GameView();
			barLayout.setBackgroundResource(R.drawable.word_list_navi_01);
			
		}
	});

	}

	public boolean onKeyDown(int ketCode, KeyEvent event){

	if(ketCode==KeyEvent.KEYCODE_BACK){
		if(type==0){  


		}else if(type==2){
			GameView();
			return true;
		}else{
			WordList();
			return true;
		}
	}
	return false;
}

}
