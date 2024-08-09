package crc64f5844edce43316e7;


public class Mapping_CustomPathDrawable
	extends android.graphics.drawable.Drawable
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_setAlpha:(I)V:GetSetAlpha_IHandler\n" +
			"n_setColorFilter:(Landroid/graphics/ColorFilter;)V:GetSetColorFilter_Landroid_graphics_ColorFilter_Handler\n" +
			"n_getOpacity:()I:GetGetOpacityHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.Maui.Core.Rotator.Mapping+CustomPathDrawable, Syncfusion.Maui.Core", Mapping_CustomPathDrawable.class, __md_methods);
	}


	public Mapping_CustomPathDrawable ()
	{
		super ();
		if (getClass () == Mapping_CustomPathDrawable.class) {
			mono.android.TypeManager.Activate ("Syncfusion.Maui.Core.Rotator.Mapping+CustomPathDrawable, Syncfusion.Maui.Core", "", this, new java.lang.Object[] {  });
		}
	}


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public void setAlpha (int p0)
	{
		n_setAlpha (p0);
	}

	private native void n_setAlpha (int p0);


	public void setColorFilter (android.graphics.ColorFilter p0)
	{
		n_setColorFilter (p0);
	}

	private native void n_setColorFilter (android.graphics.ColorFilter p0);


	public int getOpacity ()
	{
		return n_getOpacity ();
	}

	private native int n_getOpacity ();

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
