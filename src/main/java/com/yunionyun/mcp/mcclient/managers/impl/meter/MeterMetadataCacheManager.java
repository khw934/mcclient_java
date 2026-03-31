package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MeterMetadataCacheManager extends MeterManager {
	public MeterMetadataCacheManager() {
		this(EndpointType.InternalURL);
	}

	public MeterMetadataCacheManager(EndpointType endpointType) {
		super(
				"meter_metadata_cache",
				"meter_metadata_cache",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
