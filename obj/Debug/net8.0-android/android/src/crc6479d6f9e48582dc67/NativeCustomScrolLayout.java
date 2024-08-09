package crc6479d6f9e48582dc67;


public class NativeCustomScrolLayout
	extends crc6452ffdc5b34af3a0f.MauiScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onGenericMotionEvent:(Landroid/view/MotionEvent;)Z:GetOnGenericMotionEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Internals.NativeCustomScrolLayout, Syncfusion.Maui.Core", NativeCustomScrolLayout.class, __md_methods);
	}


	public NativeCustomScrolLayout (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativeCustomScrolLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.NativeCustomScrolLayout, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public NativeCustomScrolLayout (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == NativeCustomScrolLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.NativeCustomScrolLayout, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public NativeCustomScrolLayout (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == NativeCustomScrolLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.NativeCustomScrolLayout, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public boolean onGenericMotionEvent (android.view.MotionEvent p0)
	{
		return n_onGenericMotionEvent (p0);
	}

	private native boolean n_onGenericMotionEvent (android.view.MotionEvent p0);

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
