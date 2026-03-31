package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillAlertManager extends MeterManager {
	public BillAlertManager() {
		this(EndpointType.InternalURL);
	}

	public BillAlertManager(EndpointType endpointType) {
		super("bill_alert", "bill_alerts", endpointType, new String[]{}, new String[]{});
	}
}
