package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class RateSetManager extends MeterManager {
	public RateSetManager() {
		this(EndpointType.InternalURL);
	}

	public RateSetManager(EndpointType endpointType) {
		super("rateset", "ratesets", endpointType, new String[]{"id", "name"}, new String[]{});
	}
}
