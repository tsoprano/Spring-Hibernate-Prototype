package com.saimon.sh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Players {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int playerId;
	
	@Column(name="player_name")
	private String playerName;
	
	@Column(name="kit_number")
	private int kitNo;
	
	
	@OneToOne
	@JoinColumn(name="team_id")
	private Teams team;
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getKitNo() {
		return kitNo;
	}
	public void setKitNo(int kitNo) {
		this.kitNo = kitNo;
	}
	public Teams getTeam() {
		return team;
	}
	public void setTeam(Teams team) {
		this.team = team;
	}
	
	

}

