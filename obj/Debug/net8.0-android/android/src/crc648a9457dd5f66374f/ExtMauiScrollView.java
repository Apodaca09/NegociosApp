package crc648a9457dd5f66374f;


public class ExtMauiScrollView
	extends androidx.core.widget.NestedScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_computeScroll:()V:GetComputeScrollHandler\n" +
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Hosting.ExtMauiScrollView, Syncfusion.Maui.Core", ExtMauiScrollView.class, __md_methods);
	}


	public ExtMauiScrollView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ExtMauiScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Hosting.ExtMauiScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public ExtMauiScrollView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ExtMauiScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Hosting.ExtMauiScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public ExtMauiScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ExtMauiScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Hosting.ExtMauiScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public void computeScroll ()
	{
		n_computeScroll ();
	}

	private native void n_computeScroll ();


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
