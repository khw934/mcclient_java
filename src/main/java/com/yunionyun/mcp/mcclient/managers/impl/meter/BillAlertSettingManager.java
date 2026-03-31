package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillAlertSettingManager extends MeterManager {
	public BillAlertSettingManager() {
		this(EndpointType.InternalURL);
	}

	public BillAlertSettingManager(EndpointType endpointType) {
		super(
				"bill_alert_setting",
				"bill_alert_settings",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
