package com.kuber.kuberproject.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kuber.kuberproject.model.nseindia_eodequitybhavcopy_readydata;
import com.kuber.kuberproject.model.nseindia_eodequitybhavcopy_readydataId;



@Repository

public interface nseindia_eodequitybhavcopy_readydatarepository extends JpaRepository<nseindia_eodequitybhavcopy_readydata, nseindia_eodequitybhavcopy_readydataId>{

}
