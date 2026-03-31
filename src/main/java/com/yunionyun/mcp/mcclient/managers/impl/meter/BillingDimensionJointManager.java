package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillingDimensionJointManager extends MeterManager {
	public BillingDimensionJointManager() {
		this(EndpointType.InternalURL);
	}

	public BillingDimensionJointManager(EndpointType endpointType) {
		super(
				"dimensionjoint",
				"dimensionjoints",
				endpointType,
				new String[]{"id", "name", "data"},
				new String[]{});
	}
}
