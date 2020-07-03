package com.gavincook.lds.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gavincook.lds.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

	List<Team> findByResourceId(Long resourceId);

}
