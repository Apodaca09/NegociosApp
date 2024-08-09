package mono.io.grpc;


public class Context_CancellationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.Context.CancellationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_cancelled:(Lio/grpc/Context;)V:GetCancelled_Lio_grpc_Context_Handler:Xamarin.Grpc.Context/ICancellationListenerInvoker, Xamarin.Grpc.Api\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.Context+ICancellationListenerImplementor, Xamarin.Grpc.Api", Context_CancellationListenerImplementor.class, __md_methods);
	}


	public Context_CancellationListenerImplementor ()
	{
		super ();
		if (getClass () == Context_CancellationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.Context+ICancellationListenerImplementor, Xamarin.Grpc.Api", "", this, new java.lang.Object[] {  });
		}
	}


	public void cancelled (io.grpc.Context p0)
	{
		n_cancelled (p0);
	}

	private native void n_cancelled (io.grpc.Context p0);

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
