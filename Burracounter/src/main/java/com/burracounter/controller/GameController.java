package com.burracounter.controller;


import com.burracounter.dto.GameDto;
import com.burracounter.mapper.GameMapper;
import com.burracounter.model.Game;
import com.burracounter.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;
    private final GameMapper gameMapper;

    @PostMapping("/games")
    public ResponseEntity<GameDto> createGame(@RequestBody GameDto gameDto) {
        Game game = gameService.createGame(gameMapper.toModel(gameDto));
        return ResponseEntity.ok(gameMapper.toDto(game));
    }

    @GetMapping("/games")
    public ResponseEntity<List<GameDto>> getGame() {
        List<Game> games = gameService.getGames();
        return ResponseEntity.ok(gameMapper.modelToDto_List(games));
    }

    @PatchMapping("/games/{gameId}")
    public ResponseEntity<GameDto> updateGame(@PathVariable int gameId, @RequestBody GameDto gameDto) {
        Game updatedGame = gameService.updateTeamScores(gameId, gameMapper.toModel(gameDto));
        return ResponseEntity.ok(gameMapper.toDto(updatedGame));
    }

//    @PatchMapping("/games/{gameId}/teams/{teamId}")
//    public ResponseEntity<GameDto> updateGame(@PathVariable int gameId, @PathVariable int teamId, @RequestBody GameDto gameDto) {
//        GameDto updatedGame = gameService.updateTeamScores(gameId, teamId, gameDto);
//        return ResponseEntity.ok(updatedGame);
//    }

    @DeleteMapping("/games/{gameId}")
    public ResponseEntity<String> deleteGame(@PathVariable int gameId) {
        gameService.deleteGame(gameId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Game deleted successfully.");  //add exception handling
    }
}
