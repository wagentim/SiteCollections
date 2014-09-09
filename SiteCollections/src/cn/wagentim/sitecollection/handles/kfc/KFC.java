package cn.wagentim.sitecollection.handles.kfc;

import cn.wagentim.sitecollections.sites.AbstractWebSite;

public class KFC extends AbstractWebSite
{
	private static final String START_URL = "http://www.kfc.de/";

	@Override
	public String getStartURL()
	{
		return START_URL;
	}
}
