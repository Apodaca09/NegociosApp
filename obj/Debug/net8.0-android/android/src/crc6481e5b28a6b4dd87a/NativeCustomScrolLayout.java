package crc6481e5b28a6b4dd87a;


public class NativeCustomScrolLayout
	extends crc6452ffdc5b34af3a0f.MauiScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.NativeCustomScrolLayout, Syncfusion.Maui.Core", NativeCustomScrolLayout.class, __md_methods);
	}


	public NativeCustomScrolLayout (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NativeCustomScrolLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.NativeCustomScrolLayout, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public NativeCustomScrolLayout (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == NativeCustomScrolLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.NativeCustomScrolLayout, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public NativeCustomScrolLayout (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == NativeCustomScrolLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.NativeCustomScrolLayout, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);

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
