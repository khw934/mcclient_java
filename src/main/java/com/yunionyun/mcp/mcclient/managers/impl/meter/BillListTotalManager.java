package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillListTotalManager extends MeterManager {
	public BillListTotalManager() {
		this(EndpointType.InternalURL);
	}

	public BillListTotalManager(EndpointType endpointType) {
		super("bill_list", "bill_lists", endpointType, new String[]{}, new String[]{});
	}
}
