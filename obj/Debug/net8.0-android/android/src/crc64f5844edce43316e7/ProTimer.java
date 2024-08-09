package crc64f5844edce43316e7;


public class ProTimer
	extends java.util.TimerTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Rotator.ProTimer, Syncfusion.Maui.Core", ProTimer.class, __md_methods);
	}


	public ProTimer ()
	{
		super ();
		if (getClass () == ProTimer.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Rotator.ProTimer, Syncfusion.Maui.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public ProTimer (crc64f5844edce43316e7.PlatformRotator p0)
	{
		super ();
		if (getClass () == ProTimer.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Rotator.ProTimer, Syncfusion.Maui.Core", "Syncfusion.Maui.Core.Rotator.PlatformRotator, Syncfusion.Maui.Core", this, new java.lang.Object[] { p0 });
		}
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
