package com.saimon.sh.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class DefAndGk extends  Players{
	
	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	

}