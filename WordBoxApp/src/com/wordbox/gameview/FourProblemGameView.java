package com.wordbox.gameview;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import com.example.wordboxapp.R;
import com.utils.CompFactory;

public class FourProblemGameView {
	public static void FourProblemView(Activity activity)
	{
		activity.setContentView(R.layout.fourproblem);

		String Word[] = {"apple","ballon","cat"};
		String Mean1[] = {"pear"};
		String Mean2[] = {"apple"};
		String Mean3[] = {"peach"};
		String Mean4[] = {"bear"};	

		int a=0;

		TextView tv1 = new TextView(activity);
		tv1.setGravity(Gravity.RIGHT);
		tv1.setText(a+"/100");
		tv1.setPadding(0, 20, 0, 0);
		//-----------------------------------------------------------
		LayoutParams tvparam1 = new LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.WRAP_CONTENT,
				0.0F);
		tvparam1.height=400;
		tvparam1.topMargin=30;
		tvparam1.gravity=Gravity.CENTER_HORIZONTAL;


		TextView tv2 = new TextView(activity);
		tv2.setText(Word[0]);
		tv2.setBackgroundResource(R.drawable.four);
		tv2.setGravity(Gravity.CENTER);
		tv2.setTextSize(80);
		tv2.setPadding(0, 0, 0, 10);
		tv2.setLayoutParams(tvparam1);

		//¹öÆ°
		Button answer1 = CompFactory.makeButton(activity, Mean1[0], Color.GRAY, Color.WHITE, Gravity.CENTER_HORIZONTAL);
		LayoutParams btnparam1 = new LayoutParams();
		btnparam1.topMargin=30;
		answer1.setLayoutParams(btnparam1);

		LayoutParams btnparam2 = new LayoutParams();
		btnparam2.topMargin=20;
		Button btn2 = new Button(activity);
		btn2.setText(Mean2[0]);
		btn2.setBackgroundColor(Color.GRAY);
		btn2.setTextColor(Color.WHITE);
		btn2.setGravity(Gravity.CENTER_HORIZONTAL);
		btn2.setLayoutParams(btnparam2);

		LayoutParams btnparam3 = new LayoutParams();
		btnparam3.topMargin=20;
		Button btn3 = new Button(activity);
		btn3.setText(Mean3[0]);
		btn3.setBackgroundColor(Color.GRAY);
		btn3.setTextColor(Color.WHITE);
		btn3.setGravity(Gravity.CENTER_HORIZONTAL);
		btn3.setLayoutParams(btnparam3);

		LayoutParams btnparam4 = new LayoutParams();
		btnparam4.topMargin=20;
		Button btn4 = new Button(activity);
		btn4.setText(Mean4[0]);
		btn4.setBackgroundColor(Color.GRAY);
		btn4.setTextColor(Color.WHITE);
		btn4.setGravity(Gravity.CENTER_HORIZONTAL);
		btn4.setLayoutParams(btnparam4);

		LinearLayout linearlayout1 = (LinearLayout)activity.findViewById(R.id.LinearLayout1);
		linearlayout1.addView(tv1);
		linearlayout1.addView(tv2);
		linearlayout1.addView(answer1);
		linearlayout1.addView(btn2);		
		linearlayout1.addView(btn3);
		linearlayout1.addView(btn4);
	}
}
