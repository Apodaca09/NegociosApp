package crc640360c8a960a6805b;


public class StaticTextLayout
	extends android.text.StaticLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getLineCount:()I:GetGetLineCountHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Graphics.Internals.StaticTextLayout, Syncfusion.Maui.Core", StaticTextLayout.class, __md_methods);
	}


	public StaticTextLayout (java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, boolean p6)
	{
		super (p0, p1, p2, p3, p4, p5, p6);
		if (getClass () == StaticTextLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Graphics.Internals.StaticTextLayout, Syncfusion.Maui.Core", "Java.Lang.ICharSequence, Mono.Android:Android.Text.TextPaint, Mono.Android:System.Int32, System.Private.CoreLib:Android.Text.Layout+Alignment, Mono.Android:System.Single, System.Private.CoreLib:System.Single, System.Private.CoreLib:System.Boolean, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5, p6 });
		}
	}


	public StaticTextLayout (java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8, android.text.TextUtils.TruncateAt p9, int p10)
	{
		super (p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		if (getClass () == StaticTextLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Graphics.Internals.StaticTextLayout, Syncfusion.Maui.Core", "Java.Lang.ICharSequence, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib:Android.Text.TextPaint, Mono.Android:System.Int32, System.Private.CoreLib:Android.Text.Layout+Alignment, Mono.Android:System.Single, System.Private.CoreLib:System.Single, System.Private.CoreLib:System.Boolean, System.Private.CoreLib:Android.Text.TextUtils+TruncateAt, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 });
		}
	}


	public StaticTextLayout (java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8)
	{
		super (p0, p1, p2, p3, p4, p5, p6, p7, p8);
		if (getClass () == StaticTextLayout.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Graphics.Internals.StaticTextLayout, Syncfusion.Maui.Core", "Java.Lang.ICharSequence, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib:Android.Text.TextPaint, Mono.Android:System.Int32, System.Private.CoreLib:Android.Text.Layout+Alignment, Mono.Android:System.Single, System.Private.CoreLib:System.Single, System.Private.CoreLib:System.Boolean, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5, p6, p7, p8 });
		}
	}


	public int getLineCount ()
	{
		return n_getLineCount ();
	}

	private native int n_getLineCount ();

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
