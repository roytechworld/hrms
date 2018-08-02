package com.pts.procureline.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.pts.procureline.model.Admin;
import com.pts.procureline.model.Vendor;
import com.pts.procureline.model.VmsVendorMaster;

@Service
public interface VendorService {
	public int vendorData(Vendor vndor);
	
	public List<VmsVendorMaster> getvendorData(Session session);
	public int vendorDatasaveup(Vendor admin,Session session) ;
	
}
