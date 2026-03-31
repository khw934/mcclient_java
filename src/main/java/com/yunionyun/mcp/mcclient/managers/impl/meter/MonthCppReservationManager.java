package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MonthCppReservationManager extends MeterManager {
	public MonthCppReservationManager() {
		this(EndpointType.InternalURL);
	}

	public MonthCppReservationManager(EndpointType endpointType) {
		super(
				"month_cpp_reservation",
				"month_cpp_reservations",
				endpointType,
				new String[]{
					"id",
					"cloudaccount_id",
					"reservation_id",
					"reservation_years",
					"lookback_days",
					"payment_option",
					"offering_class",
					"category",
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
					"cpp_count",
					"cpp_rate",
				},
				new String[]{});
	}
}
