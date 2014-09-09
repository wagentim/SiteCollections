package cn.wagentim.sitecollection.handles.kfc;

import cn.wagentim.basicutils.BasicUtils;
import de.wagentim.qlogger.logger.Log;

public class KFCParser
{
	public static void parserCouponLink(String s)
	{
		if( BasicUtils.isNullOrEmpty(s) )
		{
			KFC.logger.log(Log.LEVEL_WARN, "The Input web site content is Null or Empty");
			return;
		}
		
		
	}

}
