package com.kuber.kuberproject.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class nseindia_eodequitybhavcopy_readydata implements Serializable{
	
	@EmbeddedId
	private nseindia_eodequitybhavcopy_readydataId nseineoeqbhredata;
	
	private String open;
	private String high;
	private String low;
	private String close;
	private String prevclose;
	private String tottrdqty;
	private String tottrdval;
	private String totaltrades;

}
