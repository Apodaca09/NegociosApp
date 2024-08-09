package mono.com.google.firebase.storage;


public class OnProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.storage.OnProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgress:(Ljava/lang/Object;)V:Getsnapshot_Ljava_lang_Object_Handler:Firebase.Storage.IOnProgressListenerInvoker, Xamarin.Firebase.Storage\n" +
			"";
		mono.android.Runtime.register ("Firebase.Storage.IOnProgressListenerImplementor, Xamarin.Firebase.Storage", OnProgressListenerImplementor.class, __md_methods);
	}


	public OnProgressListenerImplementor ()
	{
		super ();
		if (getClass () == OnProgressListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Storage.IOnProgressListenerImplementor, Xamarin.Firebase.Storage", "", this, new java.lang.Object[] {  });
		}
	}


	public void onProgress (java.lang.Object p0)
	{
		n_onProgress (p0);
	}

	private native void n_onProgress (java.lang.Object p0);

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
