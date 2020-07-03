package com.gavincook.lds.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gavincook.lds.dao.TeamRepository;
import com.gavincook.lds.model.Team;
import com.gavincook.lds.model.TeamListResponse;

@RestController
@RequestMapping("teams")
public class TeamController {
	
	private final TeamRepository teamRepository;

	@Autowired
	public TeamController(final TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	@GetMapping
	public ResponseEntity<TeamListResponse> getTeams() {

		final TeamListResponse response = new TeamListResponse();

		final List<Team> teams = teamRepository.findAll();

		if (teams != null) {
			response.setTeams(teams);
			response.setResults(teams.size());
		}

		return ResponseEntity.ok().body(response);
	}

	@GetMapping("/{resourceId}")
	public ResponseEntity<TeamListResponse> getTeam(@PathVariable final Long resourceId) {

		final TeamListResponse response = new TeamListResponse();

		final List<Team> teams = teamRepository.findByResourceId(resourceId);
		
		if (teams != null) {
			response.setTeams(teams);
			response.setResults(teams.size());
		}
		
		return ResponseEntity.ok().body(response);
	}

}
