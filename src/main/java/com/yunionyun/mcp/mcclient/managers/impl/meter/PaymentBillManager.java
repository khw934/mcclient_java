package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class PaymentBillManager extends MeterManager {
	public PaymentBillManager() {
		this(EndpointType.InternalURL);
	}

	public PaymentBillManager(EndpointType endpointType) {
		super(
				"payment_bill",
				"payment_bills",
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
