package com.pts.procureline.service;
/**
 *   @author Pradipto Roy (Java Developer in PTS Development team)
 *
 */
import org.springframework.stereotype.Service;

import com.pts.procureline.model.Consultant;

@Service
public interface ConsultantService {

	public int consultantData(Consultant consultant);
}
