package mono.com.google.firebase.installations.internal;


public class FidListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.installations.internal.FidListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFidChanged:(Ljava/lang/String;)V:GetOnFidChanged_Ljava_lang_String_Handler:Firebase.Installations.Internal.IFidListenerInvoker, Xamarin.Firebase.Installations.InterOp\n" +
			"";
		mono.android.Runtime.register ("Firebase.Installations.Internal.IFidListenerImplementor, Xamarin.Firebase.Installations.InterOp", FidListenerImplementor.class, __md_methods);
	}


	public FidListenerImplementor ()
	{
		super ();
		if (getClass () == FidListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Installations.Internal.IFidListenerImplementor, Xamarin.Firebase.Installations.InterOp", "", this, new java.lang.Object[] {  });
		}
	}


	public void onFidChanged (java.lang.String p0)
	{
		n_onFidChanged (p0);
	}

	private native void n_onFidChanged (java.lang.String p0);

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
