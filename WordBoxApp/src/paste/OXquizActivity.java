package paste;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wordboxapp.R;

public class OXquizActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oxquiz);
		
		
		String Word1[] = {"Apple"};
		String Mean1[] = {"사과"};
		
		int a=0;
		
		//----100개중 맞은 갯수
		TextView tv1 = new TextView(this);
		tv1.setGravity(Gravity.RIGHT);
		tv1.setText(a+"/100");
		tv1.setPadding(0, 20, 0, 0);
		
	
//이미지 안에 텍스트뷰 부분		
		TextView tv2 = new TextView(this);
		tv2.setText(Word1[0]);
		tv2.setTextSize(50);
		tv2.setGravity(Gravity.CENTER);
		
		
		TextView tv3 = new TextView(this);
		tv3.setText(Mean1[0]);
		tv3.setTextSize(50);
		tv3.setGravity(Gravity.CENTER);

		LinearLayout.LayoutParams linearParam1 = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.WRAP_CONTENT,
		0.0F);
			linearParam1.height=400;
			linearParam1.topMargin=30;
			linearParam1.gravity=Gravity.CENTER_HORIZONTAL;
	
		
		LinearLayout linearlayout2 = new LinearLayout(this);
		linearlayout2.setOrientation(LinearLayout.VERTICAL);
		linearlayout2.setBackgroundResource(R.drawable.four);
		linearlayout2.setLayoutParams(linearParam1);
		linearlayout2.addView(tv2);
		linearlayout2.addView(tv3);
		linearlayout2.setGravity(Gravity.CENTER);
		//linearlayout2.setPadding(0, 50, 0, 0);
		
		//버튼 부분1
		LinearLayout.LayoutParams btnparam1 = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT,
			0.0F);
			btnparam1.width=200;
			btnparam1.height=200;
			btnparam1.rightMargin=50;
		final Button btn1 = new Button(this);
		btn1.setBackgroundResource(R.drawable.ox_yes2);
		btn1.setGravity(Gravity.CENTER);
		btn1.setLayoutParams(btnparam1);
		
		
		//버튼 부분2
		LinearLayout.LayoutParams btnparam2 = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT,
				0.0F);
			btnparam2.width=200;
			btnparam2.height=200;
			btnparam2.leftMargin=50;
		final Button btn2 = new Button(this);
		btn2.setBackgroundResource(R.drawable.ox_no2);
		btn2.setGravity(Gravity.CENTER);
		btn2.setLayoutParams(btnparam2);
		
		
		LinearLayout.LayoutParams linearParam2 = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.MATCH_PARENT,
				1F);
		
			
		//버튼 넣은 linearlayout
		LinearLayout linearlayout3 = new LinearLayout(this);
		linearlayout3.setOrientation(LinearLayout.HORIZONTAL);
		linearlayout3.setGravity(Gravity.CENTER);
		linearlayout3.addView(btn1);
		linearlayout3.addView(btn2);
		linearlayout3.setLayoutParams(linearParam2);
			
			
		//----마지막 View에 추가한부분
		LinearLayout linearlayout1 = (LinearLayout)findViewById(R.id.LinearLayout1);
		linearlayout1.addView(tv1);
		linearlayout1.addView(linearlayout2);
		linearlayout1.addView(linearlayout3);
		//----------------------
		
		btn1.setOnTouchListener(new OnTouchListener() { //버튼 터치시 이벤트        
	            public boolean onTouch(View v, MotionEvent event) {
	                if(event.getAction() == MotionEvent.ACTION_DOWN) // 버튼을 누르고 있을 때
	                	btn1.setBackgroundResource(R.drawable.ox_yes1);
	                if(event.getAction() == MotionEvent.ACTION_UP){ //버튼에서 손을 떼었을 때 
	                	btn1.setBackgroundResource(R.drawable.ox_yes2); 
	                }
	                return false;
	            }
	        }); 
	
		btn2.setOnTouchListener(new OnTouchListener() { //버튼 터치시 이벤트        
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) // 버튼을 누르고 있을 때
                	btn2.setBackgroundResource(R.drawable.ox_no1);
                if(event.getAction() == MotionEvent.ACTION_UP){ //버튼에서 손을 떼었을 때 
                	btn2.setBackgroundResource(R.drawable.ox_no2); 
                }
                return false;
            }
        }); 

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.oxquiz, menu);
		return true;
	}

}
