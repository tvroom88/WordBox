package com.workbox.mainTabView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

import com.example.wordboxapp.R;
import com.utils.CompFactory;
import com.utils.MarginPadding;

public class SettingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setting();
		
	        
	}
	
	public void setting(){
		
		setContentView(R.layout.activity_setting);
	
		//만든사람들------------------------------------------
		
		TextView MPText1 = CompFactory.detailTextView(this, Color.TRANSPARENT, Color.BLUE, "만든사람들", 15, new MarginPadding(0,20,0,0), new MarginPadding(), 
				Gravity.CENTER_HORIZONTAL, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
		MPText1.setGravity(Gravity.CENTER_HORIZONTAL);
		
		RelativeLayout MadePeople = (RelativeLayout)findViewById(R.id.MadePeople);
		MadePeople.addView(MPText1);
		
		
		//이재훈, 이재홍, 안명희 부분-------------------------------
		LayoutParams textParam1 = new LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
			textParam1.weight=1;
		TextView MPText2 = new TextView(this);
		MPText2.setText("이재훈" + "\n" + "iphone");
		MPText2.setGravity(Gravity.CENTER);
		MPText2.setLayoutParams(textParam1);
		
		
		LayoutParams textParam2 = new LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
			textParam2.weight=1;
		TextView MPText3 = new TextView(this);
		MPText3.setText("이재홍" + "\n" + "android");
		MPText3.setGravity(Gravity.CENTER);
		MPText3.setLayoutParams(textParam2);
		
		LayoutParams textParam3 = new LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
			textParam3.weight=1;
		TextView MPText4 = new TextView(this);
		MPText4.setText("안명희" + "\n" + "design");
		MPText4.setGravity(Gravity.CENTER);
		MPText4.setLayoutParams(textParam3);
	
		LinearLayout MadePeoPle1 = (LinearLayout)findViewById(R.id.MadePeople2);
		MadePeoPle1.addView(MPText2);
		MadePeoPle1.addView(MPText3);
		MadePeoPle1.addView(MPText4);
		
		
		//아래 이미지 부분--------------------------
		RelativeLayout.LayoutParams Params1 = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
			Params1.setMargins(160, 0, 0, 0);
		
		final ImageView img1 = new ImageView(this);
		img1.setBackgroundResource(R.drawable.settingimage1);
		img1.setLayoutParams(Params1);
		
		img1.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO 자동 생성된 메소드 스텁
				  if(MotionEvent.ACTION_DOWN == event.getAction()){
				       //액션 정의
					  img1.setBackgroundResource(R.drawable.settingimage11);
				   }
				      if(MotionEvent.ACTION_UP == event.getAction()){
				      //액션 정의
				   img1.setBackgroundResource(R.drawable.settingimage1);
				 }
				     
				return true;
			}
		});
		
		RelativeLayout.LayoutParams Params2 = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
			Params2.setMargins(0, 8, 160, 0);
			Params2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			
		ImageView img2 = new ImageView(this);
		img2.setBackgroundResource(R.drawable.settingimage2);
		img2.setLayoutParams(Params2);
		
		RelativeLayout.LayoutParams Params3 = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
			Params3.setMargins(160, 0, 0, 0);
	
			
		ImageView img3 = new ImageView(this);
		img3.setBackgroundResource(R.drawable.settingimage3);
		img3.setLayoutParams(Params3);
		
		RelativeLayout.LayoutParams Params4 = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
			Params4.setMargins(0, 8, 160, 0);
			Params4.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			
		ImageView img4 = new ImageView(this);
		img4.setBackgroundResource(R.drawable.settingimage4);
		img4.setLayoutParams(Params4);
		
		RelativeLayout imagelayout1 = (RelativeLayout)findViewById(R.id.settinglayout1);
		imagelayout1.addView(img1);
		imagelayout1.addView(img2);
		
		
		RelativeLayout imagelayout2 = (RelativeLayout)findViewById(R.id.settinglayout2);
		imagelayout2.addView(img3);
		imagelayout2.addView(img4);
		
		
		
		RelativeLayout.LayoutParams LoginParam = new RelativeLayout.LayoutParams(
				500,
				80);
			LoginParam.addRule(RelativeLayout.CENTER_HORIZONTAL);
			
		TextView LoginText = new TextView(this);
		
		LoginText.setText("로그인");
		LoginText.setGravity(Gravity.CENTER);
		LoginText.setTextSize(20);
		LoginText.setTextColor(Color.BLACK);
		LoginText.setBackgroundColor(Color.WHITE);
		LoginText.setBackgroundResource(R.layout.textviewshapess);
		LoginText.setLayoutParams(LoginParam);
		
		
		RelativeLayout LoginLayout = (RelativeLayout)findViewById(R.id.loginlayout);
		LoginLayout.addView(LoginText);
	}
	
	
	 
}
