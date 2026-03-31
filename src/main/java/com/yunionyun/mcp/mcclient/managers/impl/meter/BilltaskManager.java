package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BilltaskManager extends MeterManager {
	public BilltaskManager() {
		this(EndpointType.InternalURL);
	}

	public BilltaskManager(EndpointType endpointType) {
		super("billtask", "billtasks", endpointType, new String[]{}, new String[]{});
	}
}
