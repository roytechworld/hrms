package com.pts.procureline.service;

import org.springframework.stereotype.Service;

import com.pts.procureline.model.Consultant;

@Service
public interface ConsultantService {

	public int consultantData(Consultant consultant);
}
