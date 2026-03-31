package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillsanalysisRecalculateManager extends MeterManager {
	public BillsanalysisRecalculateManager() {
		this(EndpointType.InternalURL);
	}

	public BillsanalysisRecalculateManager(EndpointType endpointType) {
		super(
				"billsanalysisrecalculate",
				"billsanalysisrecalculates",
				endpointType,
				new String[]{"project", "project_id", "domain", "domain_id", "amount", "year_amount"},
				new String[]{});
	}
}
