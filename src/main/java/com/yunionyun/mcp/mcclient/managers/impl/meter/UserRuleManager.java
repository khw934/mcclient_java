package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class UserRuleManager extends MeterManager {
	public UserRuleManager() {
		this(EndpointType.InternalURL);
	}

	public UserRuleManager(EndpointType endpointType) {
		super("user_rule", "user_rules", endpointType, new String[]{}, new String[]{});
	}
}
