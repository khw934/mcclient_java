package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MeterEventManager extends MeterManager {
	public MeterEventManager() {
		this(EndpointType.InternalURL);
	}

	public MeterEventManager(EndpointType endpointType) {
		super(
				"meter_event",
				"meter_events",
				endpointType,
				new String[]{
					"id",
					"account_id",
					"brand",
					"resource_type",
					"usage_type",
					"associate_id",
					"resource_id",
					"model",
					"spec",
					"quantity",
					"status",
					"usage_start_time",
					"usage_end_time",
					"tenant_id",
					"domain_id",
				},
				new String[]{});
	}
}
