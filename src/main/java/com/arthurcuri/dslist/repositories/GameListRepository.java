package com.arthurcuri.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurcuri.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
