package com.workbox.mainTabView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

import com.example.wordboxapp.R;
import com.utils.CompFactory;
import com.utils.MarginPadding;

public class MarketActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_market);
		String MarketTitle[] = {"1.WordBox  100개단어" + "\n" + "wordbox","2.WordBox  100개단어" 
				+ "\n" + "wordbox","3.WordBox  100개단어" + "\n" + "wordbox","4.WordBox  100개단어" + "\n" + "wordbox",
				"5.WordBox  100개단어" + "\n" + "wordbox","6.WordBox  100개단어" + "\n" + "wordbox"};

		String MarketButtonTitle[] ={"1.WordBox", "2.WordTitle","3.WordTitle","4.WordTitle","5.WordTitle","6.WordTitle"};
		TableLayout tableLayout1 = (TableLayout)findViewById(R.id.tablelayout1);

		for(int i=0;i<MarketTitle.length;i++){

			TableRow tablerow1 = new TableRow(this);
			TextView tv1 = new TextView(this);

			
			//wordList 아이콘 부분
			RelativeLayout MarketWordTitle = CompFactory.detailRelativeLayout(this, 200, 200, Gravity.CENTER_VERTICAL, new MarginPadding(20, 20, 0, 20), new MarginPadding(0, 10, 0, 0), R.drawable.wordlist);
			
			TextView WordCount = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLACK, "100개", 10, new MarginPadding(0,18,0,0),new MarginPadding());
			
			
//			RelativeLayout.LayoutParams TextViewParam1 = new RelativeLayout.LayoutParams(
//					ViewGroup.LayoutParams.WRAP_CONTENT,
//					ViewGroup.LayoutParams.WRAP_CONTENT);
//			TextViewParam1.leftMargin=18;
//			
//			
//			//위에 100개 텍스트뷰
//			TextView WordTitleButtonTextView1 = new TextView(this); 
//			WordTitleButtonTextView1.setText("100개");
//			WordTitleButtonTextView1.setLayoutParams(TextViewParam1);
//			WordTitleButtonTextView1.setTextSize(10);
			

			//중앙 텍스트 브분
			TextView WordTitle = CompFactory.detailTextView(this, Color.rgb(0, 164, 255), Color.WHITE, MarketButtonTitle[i], 15, new MarginPadding(), new MarginPadding());
			RelativeLayout.LayoutParams TextViewParam2 = new RelativeLayout.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
			TextViewParam2.addRule(RelativeLayout.CENTER_IN_PARENT);
			WordTitle.setLayoutParams(TextViewParam2);
			WordTitle.setGravity(Gravity.CENTER);
		

			MarketWordTitle.addView(WordCount);
			MarketWordTitle.addView(WordTitle);
			//imgbutton.setScaleType(ScaleType.CENTER_CROP);
			//            		SpannableStringBuilder sp = new SpannableStringBuilder(textView.getText());
			//            	    sp.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			//            	 
			//            	    textView.setText(sp);
			
			

			TableLayout.LayoutParams buttonParams1 = new TableLayout.LayoutParams();
			buttonParams1.width=680;
			buttonParams1.topMargin=50;
			tablerow1.setLayoutParams(buttonParams1);

			
			
			//tablerow onclicklistener 부분
			tablerow1.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {

					AlertDialog.Builder alert = new AlertDialog.Builder(getParent());
					alert.setMessage("단어를 구입하시겠습니까???")

					.setCancelable(false)		
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

			
			//tablerow를 tablelayout안에 넣는 부분
			tablerow1.addView(MarketWordTitle);    
			tablerow1.addView(tv1);
			tablerow1.setBackgroundResource(R.drawable.marketlist);
			tableLayout1.addView(tablerow1);
		}
	}

	private MarginPadding padding(int i, int j, int k, int l) {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}

	private MarginPadding margin(int i, int j, int k, int l) {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}
}
