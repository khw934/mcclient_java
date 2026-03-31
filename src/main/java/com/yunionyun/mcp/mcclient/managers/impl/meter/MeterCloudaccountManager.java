package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class MeterCloudaccountManager extends MeterManager {
	public MeterCloudaccountManager() {
		this(EndpointType.InternalURL);
	}

	public MeterCloudaccountManager(EndpointType endpointType) {
		super(
				"meter_cloudaccount",
				"meter_cloudaccounts",
				endpointType,
				new String[]{
					"id",
					"name",
					"status",
					"provider",
					"brand",
					"project_domain",
					"domain_id",
					"share_mode",
					"tenant",
					"tenant_id",
					"balance",
					"amount",
					"amount_sec",
				},
				new String[]{});
	}
}
