package cn.wagentim.sitecollection.handles.kfc;

import cn.wagentim.connecthelper.core.ConnectManager;
import cn.wagentim.connecthelper.webs.WebSite;
import cn.wagentim.sitecollection.settings.GlobalSettings;
import de.wagentim.qlogger.logger.Log;

public class KFCHandler
{
	private final WebSite kfc;

	public KFCHandler(WebSite kfc)
	{
		this.kfc = kfc;
	}

	public void fetchCoupons()
	{
		fetchCoupons(GlobalSettings.getDownloadLocation());
	}

	private void fetchCoupons(final String saveLocation)
	{
		KFC.logger.log(Log.LEVEL_INFO, "KFCHandler#fetchCoupons: start...");
		String s = ConnectManager.getWebPage(kfc.getStartURL());
		KFC.logger.log(Log.LEVEL_INFO, "KFCHandler#fetchCoupons: parser the page %1", kfc.getStartURL());
		KFCParser.parserCouponLink(s);
	}
}