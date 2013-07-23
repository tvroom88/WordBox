package com.workbox.mainTabView;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.example.wordboxapp.R;
import com.utils.CompFactory;
import com.utils.MarginPadding;

public class MarketActivity extends Activity {

	int type=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		MarketActivity();
		
	}
	public void MarketActivity(){
		setContentView(R.layout.activity_market);
		
		
		String MarketButtonTitle[] ={"1.WordBox", "2.WordTitle","3.WordTitle","4.WordTitle","5.WordTitle","6.WordTitle"};
		String MarketRightTitle[] = {"Basic  100개", "Basic 100개", "Basic 100개", "Basic 100개", "Basic 100개", "Basic 100개"};


		for(int i=0;i<MarketButtonTitle.length;i++){

		
			TextView tv1 = new TextView(this);

			//왼쪽 버튼 타이틀 부분-----------------------------------------------------------------------------------------------

			//wordList 아이콘 부분---------------------------------
			TextView WordCount = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLACK, "100개", 10, new MarginPadding(18,8,0,0),new MarginPadding(), -1,
					ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

			//중앙 텍스트 브분--------------------------------------
			TextView WordTitle = CompFactory.detailTextView(this, Color.rgb(0, 164, 255), Color.WHITE, MarketButtonTitle[i], 15, new MarginPadding(), 
					new MarginPadding(),RelativeLayout.CENTER_IN_PARENT,ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
			RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
			layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
			WordTitle.setLayoutParams(layoutParams);
			WordTitle.setGravity(Gravity.CENTER);

			//마지막 text부분--------------------------------------
			TextView correctPercent = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.WHITE, "맞은단어 0%", 8, 
					new MarginPadding(), new MarginPadding(),RelativeLayout.ALIGN_PARENT_BOTTOM,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

			correctPercent.setGravity(Gravity.CENTER);


			//relativelayout쪽 부분
			RelativeLayout MarketWordTitle = CompFactory.detailRelativeLayout(this, 200, 200, Gravity.CENTER_VERTICAL, 
					new MarginPadding(20, 20, 0, 20), new MarginPadding(0, 0, 0, 0), R.drawable.wordlist);

			MarketWordTitle.setId(1);
			MarketWordTitle.addView(WordCount);
			MarketWordTitle.addView(WordTitle);
			MarketWordTitle.addView(correctPercent);
			//왼쪽 버튼 타디틀 부분 끝------------------------------------------------------------------------------------------------


			//오른쪽 부분 타이틀
			//텍스트 "Basic"
			
			TextView Basic = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLACK, "Basic", 30, 
					new MarginPadding(0,60,0,0),new MarginPadding(), RelativeLayout.ALIGN_PARENT_LEFT,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
			
				Basic.setId(2);
			
			//단어 갯수 부분
			TextView WordCount1 = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLACK, "100개", 15, 
					new MarginPadding(),new MarginPadding(20,88,0,0), RelativeLayout.CENTER_VERTICAL,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
			RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(
					ViewGroup.LayoutParams.WRAP_CONTENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
			layoutParams1.addRule(RelativeLayout.RIGHT_OF,Basic.getId());
			WordCount1.setLayoutParams(layoutParams1);
			WordCount1.setId(3);
			
			
			TextView TOFLE = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLACK, "TOFLE", 15, 
					new MarginPadding(0,0,0,0),new MarginPadding(0,0,0,20), RelativeLayout.CENTER_VERTICAL,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
				RelativeLayout.LayoutParams layoutParam2 = new RelativeLayout.LayoutParams(
					ViewGroup.LayoutParams.WRAP_CONTENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
				layoutParam2.addRule(RelativeLayout.BELOW,Basic.getId());
				TOFLE.setLayoutParams(layoutParam2);
				
				//sum 계산
				TextView Sum = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLACK, "$0.99", 20, 
						new MarginPadding(0,0,0,0),new MarginPadding(80,80,0,0),-1,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
				
				
					RelativeLayout.LayoutParams layoutParam3 = new RelativeLayout.LayoutParams(
						ViewGroup.LayoutParams.WRAP_CONTENT,
						ViewGroup.LayoutParams.WRAP_CONTENT);
					layoutParam3.addRule(RelativeLayout.RIGHT_OF,WordCount1.getId());
					Sum.setLayoutParams(layoutParam3);
					
					
					
			//오른쪽 relativelayout 부분
			RelativeLayout MarketWordTitle1 = CompFactory.detailRelativeLayout(this, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 
					-1, new MarginPadding(40,0,0,0), new MarginPadding(), -1);

		
			MarketWordTitle1.addView(Basic);
			MarketWordTitle1.addView(WordCount1);
			MarketWordTitle1.addView(TOFLE);
			MarketWordTitle1.addView(Sum);
			//relativelayout 끝 ----------------------------------------------
			
			
			//tablerow 꾸민부분
			TableLayout.LayoutParams buttonParams1 = new TableLayout.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.MATCH_PARENT);
			
			TableRow tablerow1 = new TableRow(this);
			tablerow1.addView(MarketWordTitle);
			tablerow1.addView(MarketWordTitle1);
			tablerow1.setBackgroundResource(R.drawable.marketlist);
			tablerow1.setLayoutParams(buttonParams1);

			final Dialog dialog = new Dialog(this);
			
			//tablerow onclicklistener 부분
			tablerow1.setOnClickListener(new OnClickListener() {
				
				
				
				@Override
				public void onClick(View v) {
					type=1;
					AlertDialog.Builder alert = new AlertDialog.Builder(dialog.getContext());
					alert.setMessage("단어를 구입하시겠습니까???")
					.setCancelable(true)		
					.setNegativeButton("구입합니다",
							new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// 'YES'
							
						}
					})
					.setPositiveButton("구입안합니다",
							new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// 'No'
							return;
						}
					}).show();
					

				}
			});//onclicklistener 끝나는 부분

			
			//tablelayout
			TableLayout tableLayout1 = (TableLayout)findViewById(R.id.tablelayout1);
			tableLayout1.addView(tablerow1);
		}
	}
	
	
	

	public boolean onKeyDown(int ketCode, KeyEvent event){

	if(ketCode==KeyEvent.KEYCODE_BACK){
		if(type==0){


		}else{
			MarketActivity();
			return true;
		}
	}
	return false;
}
}
