package com.kuber.kuberproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kuber.kuberproject.repository.nseindia_eodequitybhavcopy_readydatarepository;

@Service
public class nseindia_eodequitybhavcopy_readydataserviceimpl {

private	nseindia_eodequitybhavcopy_readydatarepository nieebcreadydataservicerepositrory;
	
	
public List findAll(){
	
     return nieebcreadydataservicerepositrory.findAll();
    


}
}