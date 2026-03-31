package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BigqueryOptionManager extends MeterManager {
	public BigqueryOptionManager() {
		this(EndpointType.InternalURL);
	}

	public BigqueryOptionManager(EndpointType endpointType) {
		super(
				"bigquery_option",
				"bigquery_options",
				endpointType,
				new String[]{"status"},
				new String[]{});
	}
}
