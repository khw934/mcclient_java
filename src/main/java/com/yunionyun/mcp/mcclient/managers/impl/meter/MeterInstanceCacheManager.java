package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MeterInstanceCacheManager extends MeterManager {
	public MeterInstanceCacheManager() {
		this(EndpointType.InternalURL);
	}

	public MeterInstanceCacheManager(EndpointType endpointType) {
		super(
				"meter_instance_cache",
				"meter_instance_caches",
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
