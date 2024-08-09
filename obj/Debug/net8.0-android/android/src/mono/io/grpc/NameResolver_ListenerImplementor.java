package mono.io.grpc;


public class NameResolver_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.grpc.NameResolver.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAddresses:(Ljava/util/List;Lio/grpc/Attributes;)V:GetOnAddresses_Ljava_util_List_Lio_grpc_Attributes_Handler:Xamarin.Grpc.NameResolver/IListenerInvoker, Xamarin.Grpc.Api\n" +
			"n_onError:(Lio/grpc/Status;)V:GetOnError_Lio_grpc_Status_Handler:Xamarin.Grpc.NameResolver/IListenerInvoker, Xamarin.Grpc.Api\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Grpc.NameResolver+IListenerImplementor, Xamarin.Grpc.Api", NameResolver_ListenerImplementor.class, __md_methods);
	}


	public NameResolver_ListenerImplementor ()
	{
		super ();
		if (getClass () == NameResolver_ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Xamarin.Grpc.NameResolver+IListenerImplementor, Xamarin.Grpc.Api", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAddresses (java.util.List p0, io.grpc.Attributes p1)
	{
		n_onAddresses (p0, p1);
	}

	private native void n_onAddresses (java.util.List p0, io.grpc.Attributes p1);


	public void onError (io.grpc.Status p0)
	{
		n_onError (p0);
	}

	private native void n_onError (io.grpc.Status p0);

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
