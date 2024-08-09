package mono.com.google.firebase.auth;


public class FirebaseAuth_IdTokenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.auth.FirebaseAuth.IdTokenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onIdTokenChanged:(Lcom/google/firebase/auth/FirebaseAuth;)V:GetOnIdTokenChanged_Lcom_google_firebase_auth_FirebaseAuth_Handler:Firebase.Auth.FirebaseAuth/IIdTokenListenerInvoker, Xamarin.Firebase.Auth\n" +
			"";
		mono.android.Runtime.register ("Firebase.Auth.FirebaseAuth+IIdTokenListenerImplementor, Xamarin.Firebase.Auth", FirebaseAuth_IdTokenListenerImplementor.class, __md_methods);
	}


	public FirebaseAuth_IdTokenListenerImplementor ()
	{
		super ();
		if (getClass () == FirebaseAuth_IdTokenListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Auth.FirebaseAuth+IIdTokenListenerImplementor, Xamarin.Firebase.Auth", "", this, new java.lang.Object[] {  });
		}
	}


	public void onIdTokenChanged (com.google.firebase.auth.FirebaseAuth p0)
	{
		n_onIdTokenChanged (p0);
	}

	private native void n_onIdTokenChanged (com.google.firebase.auth.FirebaseAuth p0);

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
