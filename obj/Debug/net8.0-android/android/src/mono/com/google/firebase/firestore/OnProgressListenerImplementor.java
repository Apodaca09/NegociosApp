package mono.com.google.firebase.firestore;


public class OnProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.firestore.OnProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgress:(Ljava/lang/Object;)V:GetOnProgress_Ljava_lang_Object_Handler:Firebase.Firestore.IOnProgressListenerInvoker, Xamarin.Firebase.Firestore\n" +
			"";
		mono.android.Runtime.register ("Firebase.Firestore.IOnProgressListenerImplementor, Xamarin.Firebase.Firestore", OnProgressListenerImplementor.class, __md_methods);
	}


	public OnProgressListenerImplementor ()
	{
		super ();
		if (getClass () == OnProgressListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Firestore.IOnProgressListenerImplementor, Xamarin.Firebase.Firestore", "", this, new java.lang.Object[] {  });
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
