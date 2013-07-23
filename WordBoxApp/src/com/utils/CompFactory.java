package com.utils;
import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

public class CompFactory {

	/*layout Family*/
	public static RelativeLayout simpleRelativeLayout()
	{
		return null;
	}
	
	public static RelativeLayout detailRelativeLayout(Activity activity, int width, int height, int gravity, MarginPadding margin, MarginPadding padding, int Bg)
	{
		LayoutParams layoutParam = new LayoutParams();
		layoutParam.width= width;
		layoutParam.height= height;
		if(gravity!=-1)
		layoutParam.gravity= gravity;
		layoutParam.setMargins(margin.left, margin.top, margin.right, margin.bottom);
		
		RelativeLayout relativeLayout = new RelativeLayout(activity); 
		if(Bg!=-1)
		relativeLayout.setBackgroundResource(Bg);
		relativeLayout.setPadding(padding.left, padding.top, padding.right, padding.bottom);
		relativeLayout.setLayoutParams(layoutParam);

		return relativeLayout;
	}
	
	
	public static TextView detailTextView(Activity activity, int BGColor, int TextColor, String text, int textsize,  MarginPadding margin, MarginPadding padding, int gravity,int width, int height)
	{
		RelativeLayout.LayoutParams layoutParam = new RelativeLayout.LayoutParams(
				width,
				height);
		layoutParam.setMargins(margin.left, margin.top, margin.right, margin.bottom);
		
		if(gravity != -1)
			layoutParam.addRule(gravity);

		TextView textView = new TextView(activity); 
		textView.setText(text);
		textView.setLayoutParams(layoutParam);
		textView.setTextSize(textsize);
		if(BGColor!=-1)
		textView.setBackgroundColor(BGColor);
		textView.setPadding(padding.left, padding.top, padding.right, padding.bottom);
		if(TextColor!=-1)
		textView.setTextColor(TextColor);
		
		return textView;
	}
	
	public static Button makeButton(Activity activity, String text, int BGColor, int textColor,int BG,int width, int height)
	{
		
		LayoutParams btnparam1 = new LayoutParams(
				ViewGroup.LayoutParams.MATCH_PARENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		if(width!=-1)
			btnparam1.width=width;
		if(height!=-1)
			btnparam1.height=height;
		Button btn = new Button(activity);
		btn.setText(text);
		btn.setBackgroundColor(BGColor);
		btn.setTextColor(textColor);
		if(BG!=-1)
		btn.setBackgroundResource(BG);
		btn.setLayoutParams(btnparam1);
		
		return btn;
	}
	
	public static LinearLayout.LayoutParams getLinearLayoutParam(int width, int height, int weight)
	{
		LinearLayout.LayoutParams linearLayout = new LinearLayout.LayoutParams(width,height,weight);
		return linearLayout;
	}
	
	public static LinearLayout getdetailLinearLayoutParam(Activity activity,int width, int height,int gravity, float weight,int orientation)
	{
		LayoutParams layoutParam = new LayoutParams();
		layoutParam.width= width;
		layoutParam.height= height;
		if(gravity!=-1)
		layoutParam.gravity= gravity;
		if(weight!=-1f)
		layoutParam.weight=weight;
		
		LinearLayout linearlayout = new LinearLayout(activity);
		linearlayout.setOrientation(orientation);
		linearlayout.setLayoutParams(layoutParam);
		return linearlayout;
	}
}
