package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillingDimensionAnalysisManager extends MeterManager {
	public BillingDimensionAnalysisManager() {
		this(EndpointType.InternalURL);
	}

	public BillingDimensionAnalysisManager(EndpointType endpointType) {
		super(
				"billsdimensionsanalysis",
				"billsdimensionsanalysis",
				endpointType,
				new String[]{
					"id",
					"name",
					"usage_type",
					"resource_type",
					"brand",
					"description",
				},
				new String[]{});
	}
}
