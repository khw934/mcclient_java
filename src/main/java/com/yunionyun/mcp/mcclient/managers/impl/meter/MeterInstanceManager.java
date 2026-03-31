package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MeterInstanceManager extends MeterManager {
	public MeterInstanceManager() {
		this(EndpointType.InternalURL);
	}

	public MeterInstanceManager(EndpointType endpointType) {
		super(
				"meter_instance",
				"meter_instances",
				endpointType,
				new String[]{
					"id",
					"name",
					"account_id",
					"brand",
					"resource_type",
					"spec",
					"exist",
					"created_at",
					"deleted_at",
					"external_id",
					"invalid",
				},
				new String[]{});
	}
}
