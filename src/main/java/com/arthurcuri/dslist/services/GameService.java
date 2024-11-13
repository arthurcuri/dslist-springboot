package com.arthurcuri.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arthurcuri.dslist.dtos.GameDTO;
import com.arthurcuri.dslist.dtos.GameMinDTO;
import com.arthurcuri.dslist.entities.Game;
import com.arthurcuri.dslist.projections.GameMinProjection;
import com.arthurcuri.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long ListId){
        List<GameMinProjection> result = gameRepository.searchByList(ListId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
