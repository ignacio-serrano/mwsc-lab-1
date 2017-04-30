package com.gft.ioso.lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {
	
	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		List<Team> ret = new ArrayList<>();
		
	  	Team team = new Team();
	  	team.setLocation("Harlem");
	  	team.setName("Globetrotters");
	  	Set<Player> set = new HashSet<>();
	  	set.add(new Player("Big Easy", "Showman"));
	  	set.add(new Player("Buckets", "Guard"));
	  	set.add(new Player("Dizzy", "Guard"));
	  	team.setPlayers(set);
	  	ret.add(team);
	  	
	  	team = new Team();
	  	team.setLocation("Washington");
	  	team.setName("Generals");
	  	ret.add(team);

		teamRepository.save(ret);
	}
}
