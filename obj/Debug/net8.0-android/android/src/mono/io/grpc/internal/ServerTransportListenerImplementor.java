package mono.io.grpc.internal;


public class ServerTransportListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.internal.ServerTransportListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_streamCreated:(Lio/grpc/internal/ServerStream;Ljava/lang/String;Lio/grpc/Metadata;)V:GetStreamCreated_Lio_grpc_internal_ServerStream_Ljava_lang_String_Lio_grpc_Metadata_Handler:Xamarin.Grpc.Core.Internal.IServerTransportListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_transportReady:(Lio/grpc/Attributes;)Lio/grpc/Attributes;:GetTransportReady_Lio_grpc_Attributes_Handler:Xamarin.Grpc.Core.Internal.IServerTransportListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_transportTerminated:()V:GetTransportTerminatedHandler:Xamarin.Grpc.Core.Internal.IServerTransportListenerInvoker, Xamarin.Grpc.Core\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.Core.Internal.IServerTransportListenerImplementor, Xamarin.Grpc.Core", ServerTransportListenerImplementor.class, __md_methods);
	}


	public ServerTransportListenerImplementor ()
	{
		super ();
		if (getClass () == ServerTransportListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.Core.Internal.IServerTransportListenerImplementor, Xamarin.Grpc.Core", "", this, new java.lang.Object[] {  });
		}
	}


	public void streamCreated (io.grpc.internal.ServerStream p0, java.lang.String p1, io.grpc.Metadata p2)
	{
		n_streamCreated (p0, p1, p2);
	}

	private native void n_streamCreated (io.grpc.internal.ServerStream p0, java.lang.String p1, io.grpc.Metadata p2);


	public io.grpc.Attributes transportReady (io.grpc.Attributes p0)
	{
		return n_transportReady (p0);
	}

	private native io.grpc.Attributes n_transportReady (io.grpc.Attributes p0);


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
