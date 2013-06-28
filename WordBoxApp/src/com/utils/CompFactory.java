package com.utils;
import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CompFactory {

	public static TextView makeTextView(Activity activity, int BGColor, int height, int TextColor)
	{
		TextView textView = new TextView(activity);
		textView.setBackgroundColor(BGColor);
		textView.setHeight(height);
		textView.setPadding(30, 20, 0, 0);
		textView.setTextColor(TextColor);
		
		return textView;
	}
	
	public static Button makeButton(Activity activity, String text, int BGColor, int textColor, int gravity)
	{
		Button btn = new Button(activity);
		btn.setText(text);
		btn.setBackgroundColor(BGColor);
		btn.setTextColor(textColor);
		btn.setGravity(gravity);
		
		return btn;
	}
	
	public static LinearLayout.LayoutParams getLinearLayoutParam(int width, int height, int weight)
	{
		LinearLayout.LayoutParams linearLayout = new LinearLayout.LayoutParams(width,height,weight);
		return linearLayout;
	}
}
