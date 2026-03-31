package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class PredictionManager extends MeterManager {
	public PredictionManager() {
		this(EndpointType.InternalURL);
	}

	public PredictionManager(EndpointType endpointType) {
		super(
				"prediction",
				"predictions",
				endpointType,
				new String[]{
					"brand",
					"account_id",
					"cloudprovider_id",
					"resource_type",
					"origin_res_type",
					"project_type",
					"charge_type",
					"domain_id",
					"tenant_id",
					"currency",
					"provider",
					"account",
					"cloudprovider_name",
					"domain",
					"project",
					"year",
					"month",
					"day",
					"week_day",
					"unix_epoch",
					"amount",
					"prediction",
					"intercept",
					"slope0",
					"slope1",
					"future",
					"since",
				},
				new String[]{});
	}
}
