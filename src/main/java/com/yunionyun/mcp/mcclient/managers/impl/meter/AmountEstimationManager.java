package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class AmountEstimationManager extends MeterManager {
	public AmountEstimationManager() {
		this(EndpointType.InternalURL);
	}

	public AmountEstimationManager(EndpointType endpointType) {
		super(
				"amount_estimation",
				"amount_estimations",
				endpointType,
				new String[]{"amount"},
				new String[]{});
	}
}
