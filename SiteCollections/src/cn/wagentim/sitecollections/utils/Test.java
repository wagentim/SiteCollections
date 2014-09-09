package cn.wagentim.sitecollections.utils;

import cn.wagentim.sitecollection.handles.kfc.KFC;
import cn.wagentim.sitecollection.handles.kfc.KFCHandler;

public class Test
{
	public static final void main(String[] args)
	{
		KFC kfc = new KFC();
		KFCHandler handler = new KFCHandler(kfc);
		handler.fetchCoupons();
	}
}
