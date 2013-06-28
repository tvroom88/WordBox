package com.wordbox.market;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

import com.example.wordboxapp.R;

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
      
            
        
                 LayoutParams RelativeLayoutParam1 = new LayoutParams();
                 	RelativeLayoutParam1.width=200;
                 	RelativeLayoutParam1.height=200;
                 	RelativeLayoutParam1.gravity=Gravity.CENTER_VERTICAL;
                 	RelativeLayoutParam1.topMargin=20;
                 	RelativeLayoutParam1.leftMargin=20;
                 	RelativeLayoutParam1.bottomMargin=20;
                 	
                 	RelativeLayout MarketWordTitle = new RelativeLayout(this); 
                 	MarketWordTitle.setBackgroundResource(R.drawable.wordlist);
                 	MarketWordTitle.setPadding(0, 10, 0, 0);
                 	MarketWordTitle.setLayoutParams(RelativeLayoutParam1);
                 	
                 	RelativeLayout.LayoutParams TextViewParam1 = new RelativeLayout.LayoutParams(
                 			ViewGroup.LayoutParams.WRAP_CONTENT,
                 			ViewGroup.LayoutParams.WRAP_CONTENT);
                 		TextViewParam1.leftMargin=18;
                 		
                 	TextView WordTitleButtonTextView1 = new TextView(this); 
                 	WordTitleButtonTextView1.setText("100개");
                 	WordTitleButtonTextView1.setLayoutParams(TextViewParam1);
                 	WordTitleButtonTextView1.setTextSize(10);
                 	
                 	
                 	RelativeLayout.LayoutParams TextViewParam2 = new RelativeLayout.LayoutParams(
                 			ViewGroup.LayoutParams.WRAP_CONTENT,
                 			ViewGroup.LayoutParams.WRAP_CONTENT);
                 		TextViewParam2.addRule(RelativeLayout.CENTER_IN_PARENT);
             	
                 	TextView WordTitleButtonTextView2 = new TextView(this);
                 	WordTitleButtonTextView2.setText(MarketButtonTitle[i]);
                 	WordTitleButtonTextView2.setLayoutParams(TextViewParam2);
             		
                 	
                 	
                 	MarketWordTitle.addView(WordTitleButtonTextView1);
                 	MarketWordTitle.addView(WordTitleButtonTextView2);
                 	//imgbutton.setScaleType(ScaleType.CENTER_CROP);
//            		SpannableStringBuilder sp = new SpannableStringBuilder(textView.getText());
//            	    sp.setSpan(new ForegroundColorSpan(Color.BLUE), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            	 
//            	    textView.setText(sp);
            	
            		
            		   
            	LayoutParams param2 = new LayoutParams();
            		param2.gravity = Gravity.CENTER_VERTICAL;
            		tv1.setLayoutParams(param2); 
                 	tv1.setText(MarketTitle[i]);
                 	tv1.setGravity(Gravity.CENTER_VERTICAL);
                
              
                TableLayout.LayoutParams buttonParams1 = new TableLayout.LayoutParams();
             		buttonParams1.width=680;
             		buttonParams1.topMargin=50;
             		tablerow1.setLayoutParams(buttonParams1);
             	
                 
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
                
            tablerow1.addView(MarketWordTitle);    
        	tablerow1.addView(tv1);
        	tablerow1.setBackgroundResource(R.drawable.marketlist);
            tableLayout1.addView(tablerow1);
            
        }
    
        
	}

	

}
