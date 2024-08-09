package crc6479d6f9e48582dc67;


public class NativeListViewScrollView
	extends crc6452ffdc5b34af3a0f.MauiScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_computeScroll:()V:GetComputeScrollHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Internals.NativeListViewScrollView, Syncfusion.Maui.Core", NativeListViewScrollView.class, __md_methods);
	}


	public NativeListViewScrollView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativeListViewScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.NativeListViewScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public NativeListViewScrollView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == NativeListViewScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.NativeListViewScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public NativeListViewScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == NativeListViewScrollView.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.NativeListViewScrollView, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);


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
