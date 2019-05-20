package com.kuber.kuberproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kuber.kuberproject.model.nseindia_eodequitybhavcopy_readydata;
import com.kuber.kuberproject.model.nseindia_eodequitybhavcopy_readydataId;
import com.kuber.kuberproject.repository.nseindia_eodequitybhavcopy_readydatarepository;
import com.kuber.kuberproject.service.nseindia_eodequitybhavcopy_readydataservice;
import com.kuber.kuberproject.service.nseindia_eodequitybhavcopy_readydataserviceimpl;



@RestController
@RequestMapping({"/nieebcreadydatacontroller"})
public class nseindiaeodequitybhavcopyreadydatacontroller {


	private nseindia_eodequitybhavcopy_readydatarepository nieebcreadydatarepository;
	
	 public nseindiaeodequitybhavcopyreadydatacontroller(nseindia_eodequitybhavcopy_readydatarepository nieebcreadydatarepository) {
		super();
		this.nieebcreadydatarepository = nieebcreadydatarepository;
	}

	@GetMapping
	    public List findAll(){
	    	
	        return nieebcreadydatarepository.findAll();
	   }
	
	
	
	 @GetMapping(path = {"/{dateid}/{symbolid}"})
	    public ResponseEntity<nseindia_eodequitybhavcopy_readydata> findById(@PathVariable String dateid,@PathVariable String symbolid){
	    	
	//    	String dateid="20070102";
	//   	 String symbolid="ABB";
	    	
	    	return nieebcreadydatarepository.findById(new nseindia_eodequitybhavcopy_readydataId(dateid,symbolid))
	                .map(record -> ResponseEntity.ok().body(record))
	                .orElse(ResponseEntity.notFound().build());
	    }

	
	

	
}
