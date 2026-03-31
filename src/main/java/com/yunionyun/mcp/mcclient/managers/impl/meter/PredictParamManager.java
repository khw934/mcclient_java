package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class PredictParamManager extends MeterManager {
	public PredictParamManager() {
		this(EndpointType.InternalURL);
	}

	public PredictParamManager(EndpointType endpointType) {
		super(
				"predict_param",
				"predict_params",
				endpointType,
				new String[]{"day", "value1", "value2", "value3", "value4", "value5"},
				new String[]{});
	}
}
