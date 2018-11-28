package com.saimon.sh.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class Sponsor {
	
	@Column(name="kit_manufacturer")
	private String kitMaker;
	
	@Column(name="kit_sponsor")
	private String kitSponsor;
	
	public String getKitMaker() {
		return kitMaker;
	}
	public void setKitMaker(String kitMaker) {
		this.kitMaker = kitMaker;
	}
	public String getKitSponsor() {
		return kitSponsor;
	}
	public void setKitSponsor(String kitSponsor) {
		this.kitSponsor = kitSponsor;
	}

}
