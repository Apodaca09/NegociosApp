package mono.io.grpc.internal;


public class ServerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.internal.ServerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_serverShutdown:()V:GetServerShutdownHandler:Xamarin.Grpc.Core.Internal.IServerListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_transportCreated:(Lio/grpc/internal/ServerTransport;)Lio/grpc/internal/ServerTransportListener;:GetTransportCreated_Lio_grpc_internal_ServerTransport_Handler:Xamarin.Grpc.Core.Internal.IServerListenerInvoker, Xamarin.Grpc.Core\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.Core.Internal.IServerListenerImplementor, Xamarin.Grpc.Core", ServerListenerImplementor.class, __md_methods);
	}


	public ServerListenerImplementor ()
	{
		super ();
		if (getClass () == ServerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.Core.Internal.IServerListenerImplementor, Xamarin.Grpc.Core", "", this, new java.lang.Object[] {  });
		}
	}


	public void serverShutdown ()
	{
		n_serverShutdown ();
	}

	private native void n_serverShutdown ();


	public io.grpc.internal.ServerTransportListener transportCreated (io.grpc.internal.ServerTransport p0)
	{
		return n_transportCreated (p0);
	}

	private native io.grpc.internal.ServerTransportListener n_transportCreated (io.grpc.internal.ServerTransport p0);

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
