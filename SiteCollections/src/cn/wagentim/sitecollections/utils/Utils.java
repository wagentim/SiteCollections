package cn.wagentim.sitecollections.utils;

import cn.wagentim.basicutils.BasicUtils;
import cn.wagentim.sitecollections.sites.Site;

public class Utils
{
	public static final boolean isInvalidSite(final Site site)
	{
		return (null == site) ||
				(BasicUtils.isNullOrEmpty(site.getURL()));
	}
}
