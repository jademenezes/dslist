package com.ijs_jademenezes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijs_jademenezes.dslist.dto.GameMinDTO;
import com.ijs_jademenezes.dslist.entities.Game;
import com.ijs_jademenezes.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		
		List<Game> result = gameRepository.findAll();
		
		List<GameMinDTO> listDto = result.stream().map(game -> new GameMinDTO(game)).toList();
		
		return listDto;
		
		
	}

}
