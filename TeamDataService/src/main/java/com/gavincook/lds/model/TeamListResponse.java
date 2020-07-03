package com.gavincook.lds.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TeamListResponse {
	Integer results;
	List<Team> teams = new ArrayList<>(); 
}
