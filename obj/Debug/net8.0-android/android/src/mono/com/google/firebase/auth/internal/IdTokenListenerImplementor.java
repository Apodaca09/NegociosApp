package mono.com.google.firebase.auth.internal;


public class IdTokenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.auth.internal.IdTokenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onIdTokenChanged:(Lcom/google/firebase/internal/InternalTokenResult;)V:GetOnIdTokenChanged_Lcom_google_firebase_internal_InternalTokenResult_Handler:Firebase.Auth.Internal.IIdTokenListenerInvoker, Xamarin.Firebase.Auth.Interop\n" +
			"";
		mono.android.Runtime.register ("Firebase.Auth.Internal.IIdTokenListenerImplementor, Xamarin.Firebase.Auth.Interop", IdTokenListenerImplementor.class, __md_methods);
	}


	public IdTokenListenerImplementor ()
	{
		super ();
		if (getClass () == IdTokenListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Auth.Internal.IIdTokenListenerImplementor, Xamarin.Firebase.Auth.Interop", "", this, new java.lang.Object[] {  });
		}
	}


	public void onIdTokenChanged (com.google.firebase.internal.InternalTokenResult p0)
	{
		n_onIdTokenChanged (p0);
	}

	private native void n_onIdTokenChanged (com.google.firebase.internal.InternalTokenResult p0);

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
