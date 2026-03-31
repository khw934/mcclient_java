package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BucketOptionManager extends MeterManager {
	public BucketOptionManager() {
		this(EndpointType.InternalURL);
	}

	public BucketOptionManager(EndpointType endpointType) {
		super(
				"bucket_option",
				"bucket_options",
				endpointType,
				new String[]{"status"},
				new String[]{});
	}
}
