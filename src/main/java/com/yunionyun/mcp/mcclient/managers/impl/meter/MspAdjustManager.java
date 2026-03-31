package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MspAdjustManager extends MeterManager {
	public MspAdjustManager() {
		this(EndpointType.InternalURL);
	}

	public MspAdjustManager(EndpointType endpointType) {
		super("msp_adjust", "msp_adjusts", endpointType, new String[]{}, new String[]{});
	}
}
