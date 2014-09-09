package cn.wagentim.sitecollection.handles.kfc;

import cn.wagentim.connecthelper.core.ConnectManager;
import cn.wagentim.connecthelper.webs.WebSite;

public class KFCHandler
{
	private final WebSite kfc;

	public KFCHandler(WebSite kfc)
	{
		this.kfc = kfc;
	}

	public void fetchCoupons()
	{
		String s = ConnectManager.standardGet(kfc.getStartURL());

	}
}