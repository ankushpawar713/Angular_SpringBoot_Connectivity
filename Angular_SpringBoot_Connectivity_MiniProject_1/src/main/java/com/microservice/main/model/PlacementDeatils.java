package com.microservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlacementDeatils {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     int placementId;
     String companyName;
     String ctc;
	public int getPlacementId() {
		return placementId;
	}
	public void setPlacementId(int placementId) {
		this.placementId = placementId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCtc() {
		return ctc;
	}
	public void setCtc(String ctc) {
		this.ctc = ctc;
	}
     
	
}
