package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class OfflineExportManager extends MeterManager {
	public OfflineExportManager() {
		this(EndpointType.InternalURL);
	}

	public OfflineExportManager(EndpointType endpointType) {
		super("offline_export", "offline_exports", endpointType, new String[]{}, new String[]{});
	}
}
