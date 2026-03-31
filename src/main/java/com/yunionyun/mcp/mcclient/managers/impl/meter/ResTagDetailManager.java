package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class ResTagDetailManager extends MeterManager {
	public ResTagDetailManager() {
		this(EndpointType.InternalURL);
	}

	public ResTagDetailManager(EndpointType endpointType) {
		super(
				"res_tag_detail",
				"res_tag_details",
				endpointType,
				new String[]{"key", "value", "tag_cost"},
				new String[]{});
	}
}
