package cn.wagentim.sitecollections.sites;

public class VP implements Site
{
	private static final String URL = "https://secure.de.vente-privee.com/vp4/Login/Portal_DE.aspx?CountryCode=DE";
	private static final String USER_NAME = "wagentim@hotmail.com";
	private static final String PASSWORD = "huang78";

	@Override
	public String getURL()
	{
		return URL;
	}

	@Override
	public String getUserName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAnonymous()
	{
		// TODO Auto-generated method stub
		return false;
	}

}
