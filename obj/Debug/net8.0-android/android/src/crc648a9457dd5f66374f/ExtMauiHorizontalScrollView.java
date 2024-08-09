package crc648a9457dd5f66374f;


public class ExtMauiHorizontalScrollView
	extends android.widget.HorizontalScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_isHorizontalScrollBarEnabled:()Z:GetIsHorizontalScrollBarEnabledHandler\n" +
			"n_setHorizontalScrollBarEnabled:(Z)V:GetSetHorizontalScrollBarEnabled_ZHandler\n" +
			"n_computeScroll:()V:GetComputeScrollHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Hosting.ExtMauiHorizontalScrollView, Syncfusion.Maui.Core", ExtMauiHorizontalScrollView.class, __md_methods);
	}


	public ExtMauiHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == ExtMauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Hosting.ExtMauiHorizontalScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}


	public ExtMauiHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ExtMauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Hosting.ExtMauiHorizontalScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public ExtMauiHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ExtMauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Hosting.ExtMauiHorizontalScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public ExtMauiHorizontalScrollView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ExtMauiHorizontalScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Hosting.ExtMauiHorizontalScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public boolean isHorizontalScrollBarEnabled ()
	{
		return n_isHorizontalScrollBarEnabled ();
	}

	private native boolean n_isHorizontalScrollBarEnabled ();


	public void setHorizontalScrollBarEnabled (boolean p0)
	{
		n_setHorizontalScrollBarEnabled (p0);
	}

	private native void n_setHorizontalScrollBarEnabled (boolean p0);


	public void computeScroll ()
	{
		n_computeScroll ();
	}

	private native void n_computeScroll ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
