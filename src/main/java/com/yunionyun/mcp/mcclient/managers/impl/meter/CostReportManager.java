package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class CostReportManager extends MeterManager {
	public CostReportManager() {
		this(EndpointType.InternalURL);
	}

	public CostReportManager(EndpointType endpointType) {
		super(
				"costreport",
				"costreports",
				endpointType,
				new String[]{
					"period_type",
					"day",
					"colon_timer",
					"disable",
					"emails",
					"scope",
					"start_run",
				},
				new String[]{});
	}
}
