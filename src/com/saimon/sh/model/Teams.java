package com.saimon.sh.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;


//@NamedNativeQuery(name="insert_into_teams", query="insert into Teams(teamName, sponsor, pastSponsors) values (?,?,?)")
@Component
@Entity
@Table(name="team_details")
public class Teams {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int teamId;
	@Column(name="team_name")
	private String teamName;
	
	@Embedded
	private Sponsor sponsor;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="club_past_sponsors",joinColumns=@JoinColumn(name="team_id"))
	@GenericGenerator(name="sequence-gen",strategy="increment")
	@CollectionId(columns=@Column(name="sponsor_id"),generator="sequence-gen",type= @Type(type="long"))
	private Collection<Sponsor> pastSponsors = new ArrayList<Sponsor>();
	
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Sponsor getSponsor() {
		return sponsor;
	}
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}
	public Collection<Sponsor> getPastSponsors() {
		return pastSponsors;
	}
	public void setPastSponsors(Collection<Sponsor> pastSponsors) {
		this.pastSponsors = pastSponsors;
	}

}