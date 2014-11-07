package cn.wagentim.sitecollections.sites;


public class VP extends AbstractWebSite
{
	public String getUserName()
	{
		return "wagentim@hotmail.com";
	}

	public String getPassword()
	{
		return "huang78";
	}

	public String getURL()
	{
		return "https://secure.de.vente-privee.com/vp4/Login/Portal_DE.aspx?CountryCode=DE";
	}

	@Override
	public void processFinished(Object data)
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void exec()
	{
		// TODO Auto-generated method stub

	}

}
