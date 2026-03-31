package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillTagManager extends MeterManager {
	public BillTagManager() {
		this(EndpointType.InternalURL);
	}

	public BillTagManager(EndpointType endpointType) {
		super(
				"bill_tag",
				"bill_tags",
				endpointType,
				new String[]{"id", "key", "value", "res_type", "month_amount", "year_amount"},
				new String[]{});
	}
}
