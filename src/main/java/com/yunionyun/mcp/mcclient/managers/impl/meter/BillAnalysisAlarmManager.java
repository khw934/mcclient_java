package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillAnalysisAlarmManager extends MeterManager {
	public BillAnalysisAlarmManager() {
		this(EndpointType.InternalURL);
	}

	public BillAnalysisAlarmManager(EndpointType endpointType) {
		super(
				"bill_analysis_alarm",
				"bill_analysis_alarms",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
