package com.yunionyun.mcp.mcclient.managers.impl.meter;

import com.yunionyun.mcp.mcclient.EndpointType;
import com.yunionyun.mcp.mcclient.managers.MeterManager;

/** @author zxc */
public class BillProductManager extends MeterManager {
	public BillProductManager() {
		this(EndpointType.InternalURL);
	}

	public BillProductManager(EndpointType endpointType) {
		super(
				"bill_product",
				"bill_products",
				endpointType,
				new String[]{"id", "provider", "product_type", "origin_res_type", "created_at"},
				new String[]{});
	}
}
