package com.example.howwearegoingtodo.api;

import com.example.howwearegoingtodo.entity.Player;
import com.example.howwearegoingtodo.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping
    Iterable<Player> getPlayers() {
        return  playerRepository.findAll();
    }
}

