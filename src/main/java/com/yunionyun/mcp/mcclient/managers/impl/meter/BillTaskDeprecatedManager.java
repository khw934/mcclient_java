package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillTaskDeprecatedManager extends MeterManager {
	public BillTaskDeprecatedManager() {
		this(EndpointType.InternalURL);
	}

	public BillTaskDeprecatedManager(EndpointType endpointType) {
		super("bill_task", "bill_tasks", endpointType, new String[]{"status"}, new String[]{});
	}
}
