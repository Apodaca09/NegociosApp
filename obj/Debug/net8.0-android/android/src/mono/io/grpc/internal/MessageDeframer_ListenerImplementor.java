package mono.io.grpc.internal;


public class MessageDeframer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.internal.MessageDeframer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_bytesRead:(I)V:GetBytesRead_IHandler:Xamarin.Grpc.Core.Internal.MessageDeframer/IListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_deframeFailed:(Ljava/lang/Throwable;)V:GetDeframeFailed_Ljava_lang_Throwable_Handler:Xamarin.Grpc.Core.Internal.MessageDeframer/IListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_deframerClosed:(Z)V:GetDeframerClosed_ZHandler:Xamarin.Grpc.Core.Internal.MessageDeframer/IListenerInvoker, Xamarin.Grpc.Core\n" +
			"n_messagesAvailable:(Lio/grpc/internal/StreamListener$MessageProducer;)V:GetMessagesAvailable_Lio_grpc_internal_StreamListener_MessageProducer_Handler:Xamarin.Grpc.Core.Internal.MessageDeframer/IListenerInvoker, Xamarin.Grpc.Core\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.Core.Internal.MessageDeframer+IListenerImplementor, Xamarin.Grpc.Core", MessageDeframer_ListenerImplementor.class, __md_methods);
	}


	public MessageDeframer_ListenerImplementor ()
	{
		super ();
		if (getClass () == MessageDeframer_ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.Core.Internal.MessageDeframer+IListenerImplementor, Xamarin.Grpc.Core", "", this, new java.lang.Object[] {  });
		}
	}


	public void bytesRead (int p0)
	{
		n_bytesRead (p0);
	}

	private native void n_bytesRead (int p0);


	public void deframeFailed (java.lang.Throwable p0)
	{
		n_deframeFailed (p0);
	}

	private native void n_deframeFailed (java.lang.Throwable p0);


	public void deframerClosed (boolean p0)
	{
		n_deframerClosed (p0);
	}

	private native void n_deframerClosed (boolean p0);


	public void messagesAvailable (io.grpc.internal.StreamListener.MessageProducer p0)
	{
		n_messagesAvailable (p0);
	}

	private native void n_messagesAvailable (io.grpc.internal.StreamListener.MessageProducer p0);

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
