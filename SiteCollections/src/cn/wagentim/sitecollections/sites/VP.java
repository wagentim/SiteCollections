package cn.wagentim.sitecollections.sites;


public class VP implements WebSite
{
	public String getUserName()
	{
		return "wagentim@hotmail.com";
	}

	public String getPassword()
	{
		return "huang78";
	}

	@Override
	public String getHost()
	{
		return "secure.de.vente-privee.com/";
	}
	
	@Override
	public String getScheme()
	{
		return "https";
	}

	@Override
	public String getPath()
	{
		return "/authentication/portal/DE";
	}
}
