package cn.wagentim.sitecollections.sites;

import cn.wagentim.connecthelper.core.IConnectConfigure;

public class VP extends AbstractWebSite
{
	@Override
	public int getConnectType()
	{
		return IConnectConfigure.USER_LOGIN;
	}

	public String getUserName()
	{
		return "wagentim@hotmail.com";
	}

	public String getPassword()
	{
		return "huang78";
	}

	@Override
	public String getName()
	{
		return "VP";
	}

	public String getURL()
	{
		return "https://secure.de.vente-privee.com/vp4/Login/Portal_DE.aspx?CountryCode=DE";
	}

}
