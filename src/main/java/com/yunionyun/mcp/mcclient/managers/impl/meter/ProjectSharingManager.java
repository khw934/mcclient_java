package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class ProjectSharingManager extends MeterManager {
	public ProjectSharingManager() {
		this(EndpointType.InternalURL);
	}

	public ProjectSharingManager(EndpointType endpointType) {
		super("project_sharing", "project_sharings", endpointType, new String[]{}, new String[]{});
	}
}
