package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class InstanceTagDetailManager extends MeterManager {
	public InstanceTagDetailManager() {
		this(EndpointType.InternalURL);
	}

	public InstanceTagDetailManager(EndpointType endpointType) {
		super(
				"instance_tag_detail",
				"instance_tag_details",
				endpointType,
				new String[]{"key", "value", "tag_cost"},
				new String[]{});
	}
}
