package com.utils;
import android.app.Activity;
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
		layoutParam.gravity= Gravity.CENTER_VERTICAL;
		layoutParam.setMargins(margin.left, margin.top, margin.right, margin.bottom);
		
		RelativeLayout relativeLayout = new RelativeLayout(activity); 
		relativeLayout.setBackgroundResource(Bg);
		relativeLayout.setPadding(padding.left, padding.top, padding.right, padding.bottom);
		relativeLayout.setLayoutParams(layoutParam);

		return relativeLayout;
	}
	
	
	public static TextView detailTextView(Activity activity, int BGColor, int TextColor, String text, int textsize,  MarginPadding margin, MarginPadding padding)
	{
		RelativeLayout.LayoutParams layoutParam = new RelativeLayout.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		layoutParam.setMargins(margin.left, margin.top, margin.right, margin.bottom);

		TextView textView = new TextView(activity); 
		textView.setText(text);
		textView.setLayoutParams(layoutParam);
		textView.setTextSize(textsize);
		textView.setBackgroundColor(BGColor);
		textView.setPadding(padding.left, padding.top, padding.right, padding.bottom);
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
