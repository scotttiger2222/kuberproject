package com.kuber.kuberproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kuber.kuberproject.repository.nseindia_eodequitybhavcopy_readydatarepository;

@Service
public interface nseindia_eodequitybhavcopy_readydataservice{

	public List findAll();
}
