package com.saimon.sh.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saimon.sh.dao.TeamsDao;
import com.saimon.sh.model.Teams;

public class TeamsDaoImpl {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		TeamsDao tDao = ctx.getBean("teamsDao", TeamsDao.class);
		
		tDao.enterDetails();
	}

}
