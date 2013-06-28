	package com.wordbox.my;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

import com.example.wordboxapp.R;

public class MylistActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mylist);
	
		String[] arraylist = {"TOEIC" + "\n" + "기초단어100개","TOEIC" + "\n" + "기초단어100개","TOEIC" + "\n" + "기초단어100개","TOEIC" + "\n" + "기초단어100개"};
		String[] arraylist1 = {"1.Tofle기초" +"\n" + "현재 진행률 : ","2.Tofle기초"+"\n" +"현재 진행률","3.Tofle기초" +"\n" +"현재 진행률","4.Tofle기초" + "\n" + "현재 진행률"};
		
		TableLayout tableLayout = (TableLayout)findViewById(R.id.tablelayout);
		
		
		
		for(int i=0;i<arraylist.length;i++){
			
			//tablerow부분
			TableRow tablerow1 = new TableRow(this);
			
			TableLayout.LayoutParams tablerowParam = new TableLayout.LayoutParams(
		    		ViewGroup.LayoutParams.WRAP_CONTENT,
		    		ViewGroup.LayoutParams.WRAP_CONTENT);
				//tablerowParam.height=100;
				tablerowParam.setMargins(0, 20, 0, 0);

			tablerow1.setLayoutParams(tablerowParam); 
			tablerow1.setBackgroundResource(R.drawable.my_page3);
			
			//왼쪽부분
			//relativelayout부분
			RelativeLayout relativelayout1 = new RelativeLayout(this);
			
				TableRow.LayoutParams relativeParam = new TableRow.LayoutParams(
		    		ViewGroup.LayoutParams.MATCH_PARENT,
		    		ViewGroup.LayoutParams.MATCH_PARENT);
			relativelayout1.setLayoutParams(relativeParam); 
			
			
			//textview1
			RelativeLayout.LayoutParams param1 = new RelativeLayout.LayoutParams(
					RelativeLayout.LayoutParams.MATCH_PARENT,
					RelativeLayout.LayoutParams.MATCH_PARENT);
			param1.addRule(RelativeLayout.CENTER_VERTICAL);
				param1.width=250;
				param1.height=100;
			    
			    
			    TextView tv1 = new TextView(this);
			    tv1.setId(1);
			    tv1.setPadding(60, 0, 0, 0);
			    tv1.setGravity(Gravity.CENTER_VERTICAL);
			    tv1.setText(arraylist[i]);
			    SpannableStringBuilder sp1 = new SpannableStringBuilder(tv1.getText());
				sp1.setSpan(new  AbsoluteSizeSpan(50), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
				sp1.setSpan(new  ForegroundColorSpan(Color.rgb(41, 172, 198)), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			    tv1.setText(sp1);//41,172,198
			    tv1.setLayoutParams(param1); 
			   
			    //------------------------------------------------------------------------------------
			    //오른쪽 부분
				//linearlayout2
				
				RelativeLayout.LayoutParams linearParam = new RelativeLayout.LayoutParams(
			    		ViewGroup.LayoutParams.MATCH_PARENT,
			    		ViewGroup.LayoutParams.MATCH_PARENT);
					linearParam.addRule(RelativeLayout.RIGHT_OF,tv1.getId());
					linearParam.addRule(RelativeLayout.CENTER_VERTICAL);
					linearParam.width=480;
					linearParam.height=100;
				LinearLayout linearlayout2 = new LinearLayout(this);
				linearlayout2.setId(2);
				linearlayout2.setOrientation(LinearLayout.VERTICAL);
				linearlayout2.setLayoutParams(linearParam); 
				linearlayout2.setPadding(50, 0, 0, 0);
				
			    
			   //textview2
			    LinearLayout.LayoutParams param2 = new LinearLayout.LayoutParams(
			    		LinearLayout.LayoutParams.MATCH_PARENT,
			    		LinearLayout.LayoutParams.WRAP_CONTENT);
			    	param2.width=200;
	
			    
			    TextView tv2 = new TextView(this);
			    tv2.setId(2);
			    tv2.setText(arraylist1[i]);
				SpannableStringBuilder sp2 = new SpannableStringBuilder(tv2.getText());
			    sp2.setSpan(new  AbsoluteSizeSpan(20), 10, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			    tv2.setText(sp2);
			    tv2.setLayoutParams(param2); 
			   
			    
			    //progressbar
				
			    LinearLayout.LayoutParams param3 = new LinearLayout.LayoutParams(
			    		LinearLayout.LayoutParams.WRAP_CONTENT,
			    		LinearLayout.LayoutParams.WRAP_CONTENT);
			    param3.width=200;
			    	
				AttributeSet attributes=null;
				ProgressBar mProgress = new ProgressBar(this,attributes,android.R.attr.progressBarStyleHorizontal);
				mProgress.setId(3);
				mProgress.setMax(100);
				mProgress.setProgress(20);
				mProgress.setLayoutParams(param3); 
			
				
				linearlayout2.addView(tv2);
				linearlayout2.addView(mProgress);
				
			
				//화면에 추가부분
				relativelayout1.addView(tv1);
				relativelayout1.addView(linearlayout2);
				tablerow1.addView(relativelayout1);
				tableLayout.addView(tablerow1);
			   
		}
		
		
		
	    
	}
	
	
	/*private void RelativeLayout(Relativelayot a){
		
		RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(
	    		ViewGroup.LayoutParams.WRAP_CONTENT,
	    		ViewGroup.LayoutParams.WRAP_CONTENT);
		a.setLayoutParams(param); 
	}*/
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mylist, menu);
		return true;
	}

}
