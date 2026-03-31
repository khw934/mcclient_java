package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class ProgressManager extends MeterManager {
	public ProgressManager() {
		this(EndpointType.InternalURL);
	}

	public ProgressManager(EndpointType endpointType) {
		super("progress", "progresses", endpointType, new String[]{}, new String[]{});
	}
}
