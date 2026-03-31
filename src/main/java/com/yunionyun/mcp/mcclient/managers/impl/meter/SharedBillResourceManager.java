package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class SharedBillResourceManager extends MeterManager {
	public SharedBillResourceManager() {
		this(EndpointType.InternalURL);
	}

	public SharedBillResourceManager(EndpointType endpointType) {
		super(
				"shared_bill",
				"shared_bills",
				endpointType,
				new String[]{
					"account",
					"platform",
					"region",
					"manager_project",
					"res_id",
					"res_type",
					"res_name",
					"charge_type",
					"res_fee",
				},
				new String[]{});
	}
}
