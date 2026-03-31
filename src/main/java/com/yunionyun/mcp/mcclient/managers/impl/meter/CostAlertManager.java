package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class CostAlertManager extends MeterManager {
	public CostAlertManager() {
		this(EndpointType.InternalURL);
	}

	public CostAlertManager(EndpointType endpointType) {
		super(
				"costalert",
				"costalerts",
				endpointType,
				new String[]{
					"brand",
					"account_id",
					"account",
					"cloudprovider_id",
					"cloudprovider_name",
					"region_id",
					"region",
					"domain_id_filter",
					"domain_filter",
					"project_id_filter",
					"project_filter",
					"resource_type",
					"currency",
					"amount",
					"cost_type",
					"user_ids",
				},
				new String[]{});
	}
}
