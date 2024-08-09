package mono.com.google.firebase.iid.internal;


public class FirebaseInstanceIdInternal_NewTokenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNewToken:(Ljava/lang/String;)V:GetOnNewToken_Ljava_lang_String_Handler:Firebase.Iid.Internal.IFirebaseInstanceIdInternalNewTokenListenerInvoker, Xamarin.Firebase.Iid.Interop\n" +
			"";
		mono.android.Runtime.register ("Firebase.Iid.Internal.IFirebaseInstanceIdInternalNewTokenListenerImplementor, Xamarin.Firebase.Iid.Interop", FirebaseInstanceIdInternal_NewTokenListenerImplementor.class, __md_methods);
	}


	public FirebaseInstanceIdInternal_NewTokenListenerImplementor ()
	{
		super ();
		if (getClass () == FirebaseInstanceIdInternal_NewTokenListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Iid.Internal.IFirebaseInstanceIdInternalNewTokenListenerImplementor, Xamarin.Firebase.Iid.Interop", "", this, new java.lang.Object[] {  });
		}
	}


	public void onNewToken (java.lang.String p0)
	{
		n_onNewToken (p0);
	}

	private native void n_onNewToken (java.lang.String p0);

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
