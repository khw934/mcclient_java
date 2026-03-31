package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BlockingAccountManager extends MeterManager {
	public BlockingAccountManager() {
		this(EndpointType.InternalURL);
	}

	public BlockingAccountManager(EndpointType endpointType) {
		super(
				"blocking_account",
				"blocking_accounts",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
