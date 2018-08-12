package com.pts.procureline.service;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.pts.procureline.model.Admin;
import com.pts.procureline.model.Vendor;


@Service
public interface VendorService {
	public int vendorData(Vendor vndor);
	
	
	public int vendorDatasaveup(Vendor admin,Session session) ;
}
