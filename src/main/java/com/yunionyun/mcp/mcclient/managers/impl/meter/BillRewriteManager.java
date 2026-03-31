package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillRewriteManager extends MeterManager {
	public BillRewriteManager() {
		this(EndpointType.InternalURL);
	}

	public BillRewriteManager(EndpointType endpointType) {
		super(
				"bill_rewrite",
				"bill_rewrites",
				endpointType,
				new String[]{"do", "status"},
				new String[]{});
	}
}
