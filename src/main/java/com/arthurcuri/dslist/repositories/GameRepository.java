package com.arthurcuri.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurcuri.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
