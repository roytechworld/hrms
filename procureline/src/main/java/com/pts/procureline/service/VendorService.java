package com.pts.procureline.service;

import org.springframework.stereotype.Service;

import com.pts.procureline.model.Vendor;

@Service
public interface VendorService {
	public int vendorData(Vendor vndor);
}
