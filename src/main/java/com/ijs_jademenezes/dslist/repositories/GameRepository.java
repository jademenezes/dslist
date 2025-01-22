package com.ijs_jademenezes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ijs_jademenezes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
