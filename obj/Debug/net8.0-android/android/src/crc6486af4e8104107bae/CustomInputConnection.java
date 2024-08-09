package crc6486af4e8104107bae;


public class CustomInputConnection
	extends android.view.inputmethod.BaseInputConnection
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_sendKeyEvent:(Landroid/view/KeyEvent;)Z:GetSendKeyEvent_Landroid_view_KeyEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Platform.CustomInputConnection, Syncfusion.Maui.Core", CustomInputConnection.class, __md_methods);
	}


	public CustomInputConnection (android.view.View p0, boolean p1)
	{
		super (p0, p1);
		if (getClass () == CustomInputConnection.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Platform.CustomInputConnection, Syncfusion.Maui.Core", "Android.Views.View, Mono.Android:System.Boolean, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public boolean sendKeyEvent (android.view.KeyEvent p0)
	{
		return n_sendKeyEvent (p0);
	}

	private native boolean n_sendKeyEvent (android.view.KeyEvent p0);

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
