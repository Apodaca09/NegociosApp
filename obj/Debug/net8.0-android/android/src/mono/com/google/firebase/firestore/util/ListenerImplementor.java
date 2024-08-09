package mono.com.google.firebase.firestore.util;


public class ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.firestore.util.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onValue:(Ljava/lang/Object;)V:GetOnValue_Ljava_lang_Object_Handler:Firebase.Firestore.Util.IListenerInvoker, Xamarin.Firebase.Firestore\n" +
			"";
		mono.android.Runtime.register ("Firebase.Firestore.Util.IListenerImplementor, Xamarin.Firebase.Firestore", ListenerImplementor.class, __md_methods);
	}


	public ListenerImplementor ()
	{
		super ();
		if (getClass () == ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Firestore.Util.IListenerImplementor, Xamarin.Firebase.Firestore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onValue (java.lang.Object p0)
	{
		n_onValue (p0);
	}

	private native void n_onValue (java.lang.Object p0);

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
