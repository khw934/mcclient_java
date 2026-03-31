package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillsanalysisManager extends MeterManager {
	public BillsanalysisManager() {
		this(EndpointType.InternalURL);
	}

	public BillsanalysisManager(EndpointType endpointType) {
		super(
				"billsanalysis",
				"billsanalysises",
				endpointType,
				new String[]{"project", "project_id", "domain", "domain_id", "amount", "year_amount"},
				new String[]{});
	}
}
