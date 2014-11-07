package cn.wagentim.sitecollections.sites;

import cn.wagentim.connecthelper.threads.ICallback;
import cn.wagentim.connecthelper.webs.WebSite;

public abstract class AbstractWebSite implements WebSite, ICallback
{
	abstract protected void exec();
}
