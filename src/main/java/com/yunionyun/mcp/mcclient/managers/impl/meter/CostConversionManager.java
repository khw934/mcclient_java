package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class CostConversionManager extends MeterManager {
	public CostConversionManager() {
		this(EndpointType.InternalURL);
	}

	public CostConversionManager(EndpointType endpointType) {
		super(
				"cost_conversion",
				"cost_conversions",
				endpointType,
				new String[]{
					"is_public_cloud",
					"brand",
					"cloudaccount_id",
					"cloudprovider_id",
					"owner_id",
					"domain_id_filter",
					"enable_date",
					"ratio",
					"user_rule_id",
				},
				new String[]{});
	}
}
