package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class ProjectTagDetailManager extends MeterManager {
	public ProjectTagDetailManager() {
		this(EndpointType.InternalURL);
	}

	public ProjectTagDetailManager(EndpointType endpointType) {
		super(
				"project_tag_detail",
				"project_tag_details",
				endpointType,
				new String[]{"key", "value", "tag_cost"},
				new String[]{});
	}
}
