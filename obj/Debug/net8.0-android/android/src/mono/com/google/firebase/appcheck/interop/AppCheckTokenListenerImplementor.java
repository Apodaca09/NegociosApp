package mono.com.google.firebase.appcheck.interop;


public class AppCheckTokenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.appcheck.interop.AppCheckTokenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAppCheckTokenChanged:(Lcom/google/firebase/appcheck/AppCheckTokenResult;)V:GetOnAppCheckTokenChanged_Lcom_google_firebase_appcheck_AppCheckTokenResult_Handler:Firebase.AppCheck.Interop.IAppCheckTokenListenerInvoker, Xamarin.Firebase.AppCheck.Interop\n" +
			"";
		mono.android.Runtime.register ("Firebase.AppCheck.Interop.IAppCheckTokenListenerImplementor, Xamarin.Firebase.AppCheck.Interop", AppCheckTokenListenerImplementor.class, __md_methods);
	}


	public AppCheckTokenListenerImplementor ()
	{
		super ();
		if (getClass () == AppCheckTokenListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.AppCheck.Interop.IAppCheckTokenListenerImplementor, Xamarin.Firebase.AppCheck.Interop", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAppCheckTokenChanged (com.google.firebase.appcheck.AppCheckTokenResult p0)
	{
		n_onAppCheckTokenChanged (p0);
	}

	private native void n_onAppCheckTokenChanged (com.google.firebase.appcheck.AppCheckTokenResult p0);

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
