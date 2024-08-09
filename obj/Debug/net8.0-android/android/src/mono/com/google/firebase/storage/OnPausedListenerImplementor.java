package mono.com.google.firebase.storage;


public class OnPausedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.storage.OnPausedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPaused:(Ljava/lang/Object;)V:Getsnapshot_Ljava_lang_Object_Handler:Firebase.Storage.IOnPausedListenerInvoker, Xamarin.Firebase.Storage\n" +
			"";
		mono.android.Runtime.register ("Firebase.Storage.IOnPausedListenerImplementor, Xamarin.Firebase.Storage", OnPausedListenerImplementor.class, __md_methods);
	}


	public OnPausedListenerImplementor ()
	{
		super ();
		if (getClass () == OnPausedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Storage.IOnPausedListenerImplementor, Xamarin.Firebase.Storage", "", this, new java.lang.Object[] {  });
		}
	}


	public void onPaused (java.lang.Object p0)
	{
		n_onPaused (p0);
	}

	private native void n_onPaused (java.lang.Object p0);

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
