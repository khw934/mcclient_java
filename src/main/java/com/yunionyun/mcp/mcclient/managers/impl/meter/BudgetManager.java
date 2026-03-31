package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BudgetManager extends MeterManager {
	public BudgetManager() {
		this(EndpointType.InternalURL);
	}

	public BudgetManager(EndpointType endpointType) {
		super(
				"budget",
				"budgets",
				endpointType,
				new String[]{
					"period_type",
					"start_time",
					"end_time",
					"brand",
					"cloudaccount_id",
					"cloudaccount",
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
					"alerts",
					"availability_status",
					"budget_scope",
				},
				new String[]{});
	}
}
