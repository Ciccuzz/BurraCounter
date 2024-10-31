package com.burracounter.controller;


import com.burracounter.dto.PlayerDto;
import com.burracounter.mapper.PlayerMapper;
import com.burracounter.model.Player;
import com.burracounter.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerController {


    private final PlayerService playerService;
    private final PlayerMapper playerMapper;

    @PostMapping("/players")
    public ResponseEntity<PlayerDto> createPlayer(@RequestBody PlayerDto playerDto) {
        Player player = playerService.createPlayer(playerMapper.toModel(playerDto));
        return ResponseEntity.ok(playerMapper.toDto(player));
    }

    @GetMapping("/players")
    public ResponseEntity<List<PlayerDto>> getPlayer() {
        List<Player> players = playerService.getPlayers();
        return ResponseEntity.ok(playerMapper.modelToDto_List(players));
    }

    @PatchMapping("/players/{playerId}")
    public ResponseEntity<PlayerDto> updatePlayer(@PathVariable int playerId, @RequestBody PlayerDto playerDto) {
        Player updatedPlayer = playerService.updatePlayerScores(playerId, playerMapper.toModel(playerDto));
        return ResponseEntity.ok(playerMapper.toDto(updatedPlayer));
    }

    @DeleteMapping("/players/{playerId}")
    public ResponseEntity<String> deletePlayer(@PathVariable int playerId) {
        playerService.deletePlayer(playerId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Player deleted successfully.");
    }
}
