package mono.com.google.firebase.firestore;


public class EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.firebase.firestore.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEvent:(Ljava/lang/Object;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V:GetOnEvent_Ljava_lang_Object_Lcom_google_firebase_firestore_FirebaseFirestoreException_Handler:Firebase.Firestore.IEventListenerInvoker, Xamarin.Firebase.Firestore\n" +
			"";
		mono.android.Runtime.register ("Firebase.Firestore.IEventListenerImplementor, Xamarin.Firebase.Firestore", EventListenerImplementor.class, __md_methods);
	}


	public EventListenerImplementor ()
	{
		super ();
		if (getClass () == EventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Firebase.Firestore.IEventListenerImplementor, Xamarin.Firebase.Firestore", "", this, new java.lang.Object[] {  });
		}
	}


	public void onEvent (java.lang.Object p0, com.google.firebase.firestore.FirebaseFirestoreException p1)
	{
		n_onEvent (p0, p1);
	}

	private native void n_onEvent (java.lang.Object p0, com.google.firebase.firestore.FirebaseFirestoreException p1);

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
