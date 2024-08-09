package mono.com.google.firebase.auth;


public class FirebaseAuth_AuthStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.auth.FirebaseAuth.AuthStateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthStateChanged:(Lcom/google/firebase/auth/FirebaseAuth;)V:GetOnAuthStateChanged_Lcom_google_firebase_auth_FirebaseAuth_Handler:Firebase.Auth.FirebaseAuth/IAuthStateListenerInvoker, Xamarin.Firebase.Auth\n" +
			"";
		mono.android.Runtime.register ("Firebase.Auth.FirebaseAuth+IAuthStateListenerImplementor, Xamarin.Firebase.Auth", FirebaseAuth_AuthStateListenerImplementor.class, __md_methods);
	}


	public FirebaseAuth_AuthStateListenerImplementor ()
	{
		super ();
		if (getClass () == FirebaseAuth_AuthStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Auth.FirebaseAuth+IAuthStateListenerImplementor, Xamarin.Firebase.Auth", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAuthStateChanged (com.google.firebase.auth.FirebaseAuth p0)
	{
		n_onAuthStateChanged (p0);
	}

	private native void n_onAuthStateChanged (com.google.firebase.auth.FirebaseAuth p0);

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
