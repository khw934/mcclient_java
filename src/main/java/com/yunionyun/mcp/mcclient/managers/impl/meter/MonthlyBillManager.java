package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MonthlyBillManager extends MeterManager {
	public MonthlyBillManager() {
		this(EndpointType.InternalURL);
	}

	public MonthlyBillManager(EndpointType endpointType) {
		super(
				"monthly_bill",
				"monthly_bills",
				endpointType,
				new String[]{
					"account",
					"account_id",
					"charge_type",
					"region",
					"region_id",
					"domain",
					"domain_id",
					"project",
					"tenant_id",
					"brand",
					"resource_id",
					"resource_type",
					"resource_name",
					"rate",
					"reserved",
					"spec",
					"usage_type",
					"associate_id",
					"day",
					"price_unit",
					"currency",
					"cloudprovider_id",
					"cloudprovider_name",
					"amount",
					"gross_amount",
					"usage",
				},
				new String[]{});
	}
}
