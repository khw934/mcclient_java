package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillingDimensionManager extends MeterManager {
	public BillingDimensionManager() {
		this(EndpointType.InternalURL);
	}

	public BillingDimensionManager(EndpointType endpointType) {
		super(
				"billsdimension",
				"billsdimensions",
				endpointType,
				new String[]{"id", "name", "dimension_type", "dimension_items"},
				new String[]{});
	}
}
