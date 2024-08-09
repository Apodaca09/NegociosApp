package crc64909b44743ae63141;


public class CrashlyticsException
	extends java.lang.Exception
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Plugin.Firebase.Crashlytics.Platforms.Android.CrashlyticsException, Plugin.Firebase.Crashlytics", CrashlyticsException.class, __md_methods);
	}


	public CrashlyticsException ()
	{
		super ();
		if (getClass () == CrashlyticsException.class) {
			mono.android.TypeManager.Activate ("Plugin.Firebase.Crashlytics.Platforms.Android.CrashlyticsException, Plugin.Firebase.Crashlytics", "", this, new java.lang.Object[] {  });
		}
	}


	public CrashlyticsException (java.lang.String p0, java.lang.Throwable p1)
	{
		super (p0, p1);
		if (getClass () == CrashlyticsException.class) {
			mono.android.TypeManager.Activate ("Plugin.Firebase.Crashlytics.Platforms.Android.CrashlyticsException, Plugin.Firebase.Crashlytics", "System.String, System.Private.CoreLib:Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public CrashlyticsException (java.lang.String p0)
	{
		super (p0);
		if (getClass () == CrashlyticsException.class) {
			mono.android.TypeManager.Activate ("Plugin.Firebase.Crashlytics.Platforms.Android.CrashlyticsException, Plugin.Firebase.Crashlytics", "System.String, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}


	public CrashlyticsException (java.lang.Throwable p0)
	{
		super (p0);
		if (getClass () == CrashlyticsException.class) {
			mono.android.TypeManager.Activate ("Plugin.Firebase.Crashlytics.Platforms.Android.CrashlyticsException, Plugin.Firebase.Crashlytics", "Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public CrashlyticsException (java.lang.String p0, java.lang.StackTraceElement[] p1)
	{
		super ();
		if (getClass () == CrashlyticsException.class) {
			mono.android.TypeManager.Activate ("Plugin.Firebase.Crashlytics.Platforms.Android.CrashlyticsException, Plugin.Firebase.Crashlytics", "System.String, System.Private.CoreLib:Java.Lang.StackTraceElement[], Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

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
