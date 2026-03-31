package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillAnalysisAlarmRecordManager extends MeterManager {
	public BillAnalysisAlarmRecordManager() {
		this(EndpointType.InternalURL);
	}

	public BillAnalysisAlarmRecordManager(EndpointType endpointType) {
		super(
				"bill_analysis_alarm_record",
				"bill_analysis_alarm_records",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
