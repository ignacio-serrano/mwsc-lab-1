package com.gft.ioso.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TeamController {
	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeams(@PathVariable long id) {
		return teamRepository.findOne(id);
	}
}
