package mono.io.grpc.internal;


public class StreamListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.internal.StreamListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_messagesAvailable:(Lio/grpc/internal/StreamListener$MessageProducer;)V:GetMessagesAvailable_Lio_grpc_internal_StreamListener_MessageProducer_Handler:Xamarin.Grpc.Core.Internal.IStreamListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_onReady:()V:GetOnReadyHandler:Xamarin.Grpc.Core.Internal.IStreamListenerInvoker, Xamarin.Grpc.Core\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.Core.Internal.IStreamListenerImplementor, Xamarin.Grpc.Core", StreamListenerImplementor.class, __md_methods);
	}


	public StreamListenerImplementor ()
	{
		super ();
		if (getClass () == StreamListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.Core.Internal.IStreamListenerImplementor, Xamarin.Grpc.Core", "", this, new java.lang.Object[] {  });
		}
	}


	public void messagesAvailable (io.grpc.internal.StreamListener.MessageProducer p0)
	{
		n_messagesAvailable (p0);
	}

	private native void n_messagesAvailable (io.grpc.internal.StreamListener.MessageProducer p0);


	public void onReady ()
	{
		n_onReady ();
	}

	private native void n_onReady ();

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
