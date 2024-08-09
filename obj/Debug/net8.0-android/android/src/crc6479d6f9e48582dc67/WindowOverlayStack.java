package crc6479d6f9e48582dc67;


public class WindowOverlayStack
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Internals.WindowOverlayStack, Syncfusion.Maui.Core", WindowOverlayStack.class, __md_methods);
	}


	public WindowOverlayStack (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == WindowOverlayStack.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.WindowOverlayStack, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}


	public WindowOverlayStack (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == WindowOverlayStack.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.WindowOverlayStack, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public WindowOverlayStack (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == WindowOverlayStack.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.WindowOverlayStack, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public WindowOverlayStack (android.content.Context p0)
	{
		super (p0);
		if (getClass () == WindowOverlayStack.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Internals.WindowOverlayStack, Syncfusion.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

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
