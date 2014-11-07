package cn.wagentim.sitecollection.handles.kfc;

import cn.wagentim.connecthelper.core.ConnectManager;
import cn.wagentim.sitecollections.sites.AbstractWebSite;
import de.wagentim.qlogger.channel.DefaultChannel;
import de.wagentim.qlogger.channel.LogChannel;
import de.wagentim.qlogger.service.QLoggerService;

public class KFC extends AbstractWebSite
{
	private final String START_URL = "http://www.kfc.de/";

	public static final LogChannel logger = QLoggerService.getChannel(QLoggerService.addChannel(new DefaultChannel("KFC")));

	public void exec()
	{
		ConnectManager.applyStandardConnection(START_URL, this);
	}

	@Override
	public void processFinished(Object data)
	{

	}

}
