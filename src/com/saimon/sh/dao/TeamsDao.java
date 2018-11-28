package com.saimon.sh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.saimon.sh.model.Attackers;
import com.saimon.sh.model.Sponsor;
import com.saimon.sh.model.Teams;

@Repository
public class TeamsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void enterDetails() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Teams team = ctx.getBean("teams", Teams.class);
    	Sponsor sponsor1 = ctx.getBean("sponsor",Sponsor.class);
		Sponsor sponsor2 = sponsor1;
		Sponsor sponsor3 = sponsor1;
		Attackers player = ctx.getBean("attackers",Attackers.class);
		Session session=getSessionFactory().openSession();
		session.beginTransaction();

		team.setTeamName("arsenal");

		sponsor1.setKitMaker("puma");
		sponsor1.setKitSponsor("fly emirates");
		
		sponsor2.setKitMaker("nike");
		sponsor2.setKitSponsor("fly emirates");

		sponsor3.setKitMaker("nike");
		sponsor3.setKitSponsor("O2");
		
		team.getPastSponsors().add(sponsor2);
		team.getPastSponsors().add(sponsor3);
		team.setSponsor(sponsor1);

		player.setPlayerName("lacazette");
		player.setKitNo(9);
		player.setTeam(team);
		player.setPosition("striker");

		session.save(player);
		session.save(team);
		session.getTransaction().commit();
		session.close();
	}
	
}
