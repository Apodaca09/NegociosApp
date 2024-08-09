package mono.io.grpc.internal;


public class ManagedClientTransport_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.internal.ManagedClientTransport.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_transportInUse:(Z)V:GetTransportInUse_ZHandler:Xamarin.Grpc.Core.Internal.IManagedClientTransportListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_transportReady:()V:GetTransportReadyHandler:Xamarin.Grpc.Core.Internal.IManagedClientTransportListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_transportShutdown:(Lio/grpc/Status;)V:GetTransportShutdown_Lio_grpc_Status_Handler:Xamarin.Grpc.Core.Internal.IManagedClientTransportListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_transportTerminated:()V:GetTransportTerminatedHandler:Xamarin.Grpc.Core.Internal.IManagedClientTransportListenerInvoker, Xamarin.Grpc.Core\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.Core.Internal.IManagedClientTransportListenerImplementor, Xamarin.Grpc.Core", ManagedClientTransport_ListenerImplementor.class, __md_methods);
	}


	public ManagedClientTransport_ListenerImplementor ()
	{
		super ();
		if (getClass () == ManagedClientTransport_ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.Core.Internal.IManagedClientTransportListenerImplementor, Xamarin.Grpc.Core", "", this, new java.lang.Object[] {  });
		}
	}


	public void transportInUse (boolean p0)
	{
		n_transportInUse (p0);
	}

	private native void n_transportInUse (boolean p0);


	public void transportReady ()
	{
		n_transportReady ();
	}

	private native void n_transportReady ();


	public void transportShutdown (io.grpc.Status p0)
	{
		n_transportShutdown (p0);
	}

	private native void n_transportShutdown (io.grpc.Status p0);


	public void transportTerminated ()
	{
		n_transportTerminated ();
	}

	private native void n_transportTerminated ();

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
