package crc64f75742c42e58f319;


public class PhoneVerificationStateChangeCallbacks
	extends com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVerificationCompleted:(Lcom/google/firebase/auth/PhoneAuthCredential;)V:GetOnVerificationCompleted_Lcom_google_firebase_auth_PhoneAuthCredential_Handler\n" +
			"n_onVerificationFailed:(Lcom/google/firebase/FirebaseException;)V:GetOnVerificationFailed_Lcom_google_firebase_FirebaseException_Handler\n" +
			"n_onCodeSent:(Ljava/lang/String;Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;)V:GetOnCodeSent_Ljava_lang_String_Lcom_google_firebase_auth_PhoneAuthProvider_ForceResendingToken_Handler\n" +
			"n_onCodeAutoRetrievalTimeOut:(Ljava/lang/String;)V:GetOnCodeAutoRetrievalTimeOut_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Plugin.Firebase.Auth.Platforms.Android.PhoneNumber.PhoneVerificationStateChangeCallbacks, Plugin.Firebase.Auth", PhoneVerificationStateChangeCallbacks.class, __md_methods);
	}


	public PhoneVerificationStateChangeCallbacks ()
	{
		super ();
		if (getClass () == PhoneVerificationStateChangeCallbacks.class) {
			mono.android.TypeManager.Activate ("Plugin.Firebase.Auth.Platforms.Android.PhoneNumber.PhoneVerificationStateChangeCallbacks, Plugin.Firebase.Auth", "", this, new java.lang.Object[] {  });
		}
	}


	public void onVerificationCompleted (com.google.firebase.auth.PhoneAuthCredential p0)
	{
		n_onVerificationCompleted (p0);
	}

	private native void n_onVerificationCompleted (com.google.firebase.auth.PhoneAuthCredential p0);


	public void onVerificationFailed (com.google.firebase.FirebaseException p0)
	{
		n_onVerificationFailed (p0);
	}

	private native void n_onVerificationFailed (com.google.firebase.FirebaseException p0);


	public void onCodeSent (java.lang.String p0, com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken p1)
	{
		n_onCodeSent (p0, p1);
	}

	private native void n_onCodeSent (java.lang.String p0, com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken p1);


	public void onCodeAutoRetrievalTimeOut (java.lang.String p0)
	{
		n_onCodeAutoRetrievalTimeOut (p0);
	}

	private native void n_onCodeAutoRetrievalTimeOut (java.lang.String p0);

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
