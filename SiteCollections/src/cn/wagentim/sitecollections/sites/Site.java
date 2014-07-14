package cn.wagentim.sitecollections.sites;

public interface Site
{
	String getURL();
	String getUserName();
	String getPassword();
	boolean isAnonymous();
}
