package mono.io.grpc;


public class LoadBalancer_SubchannelStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.LoadBalancer.SubchannelStateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSubchannelState:(Lio/grpc/ConnectivityStateInfo;)V:GetOnSubchannelState_Lio_grpc_ConnectivityStateInfo_Handler:Xamarin.Grpc.LoadBalancer/ISubchannelStateListenerInvoker, Xamarin.Grpc.Api\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.LoadBalancer+ISubchannelStateListenerImplementor, Xamarin.Grpc.Api", LoadBalancer_SubchannelStateListenerImplementor.class, __md_methods);
	}


	public LoadBalancer_SubchannelStateListenerImplementor ()
	{
		super ();
		if (getClass () == LoadBalancer_SubchannelStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.LoadBalancer+ISubchannelStateListenerImplementor, Xamarin.Grpc.Api", "", this, new java.lang.Object[] {  });
		}
	}


	public void onSubchannelState (io.grpc.ConnectivityStateInfo p0)
	{
		n_onSubchannelState (p0);
	}

	private native void n_onSubchannelState (io.grpc.ConnectivityStateInfo p0);

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
