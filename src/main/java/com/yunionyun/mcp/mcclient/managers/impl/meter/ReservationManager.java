package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class ReservationManager extends MeterManager {
	public ReservationManager() {
		this(EndpointType.InternalURL);
	}

	public ReservationManager(EndpointType endpointType) {
		super(
				"reservation",
				"reservations",
				endpointType,
				new String[]{
					"id",
					"cloudaccount_id",
					"resource_type",
					"reservation_years",
					"lookback_days",
					"payment_option",
					"offering_class",
					"category",
					"cpp_region",
					"spec",
					"instance_amount",
					"monthly_savings_amount",
					"upfront_cost",
					"average_utilization",
					"monthly_cost",
					"total_savings_amount",
					"total_savings_percentage",
					"currency",
					"details",
				},
				new String[]{});
	}
}
