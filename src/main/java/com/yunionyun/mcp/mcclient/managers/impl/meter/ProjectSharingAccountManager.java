package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class ProjectSharingAccountManager extends MeterManager {
	public ProjectSharingAccountManager() {
		this(EndpointType.InternalURL);
	}

	public ProjectSharingAccountManager(EndpointType endpointType) {
		super(
				"project_sharing_account",
				"project_sharing_accounts",
				endpointType,
				new String[]{},
				new String[]{});
	}
}
