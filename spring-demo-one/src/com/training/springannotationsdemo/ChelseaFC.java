package com.training.springannotationsdemo;

import org.springframework.stereotype.Component;

@Component("theClub")
public class ChelseaFC implements FootballTeam {

	@Override
	public String getTeamName() {
		return "This is the Chelsea Football Club";
	}

}
