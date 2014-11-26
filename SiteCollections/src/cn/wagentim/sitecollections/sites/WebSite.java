package cn.wagentim.sitecollections.sites;

public interface WebSite
{
	String getHost();

	String getScheme();

	String getPath();
	
	String getUserName();
	
	String getPassword();
}
