package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class ShieldBillManager extends MeterManager {
	public ShieldBillManager() {
		this(EndpointType.InternalURL);
	}

	public ShieldBillManager(EndpointType endpointType) {
		super("shield_bill", "shield_bills", endpointType, new String[]{}, new String[]{});
	}
}
