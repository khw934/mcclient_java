package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillBasicInfoManager extends MeterManager {
	public BillBasicInfoManager() {
		this(EndpointType.InternalURL);
	}

	public BillBasicInfoManager(EndpointType endpointType) {
		super(
				"bill_basic_info",
				"bill_basic_infos",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
