package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillAnalysisReportManager extends MeterManager {
	public BillAnalysisReportManager() {
		this(EndpointType.InternalURL);
	}

	public BillAnalysisReportManager(EndpointType endpointType) {
		super(
				"bill_analysis_report",
				"bill_analysis_reports",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
