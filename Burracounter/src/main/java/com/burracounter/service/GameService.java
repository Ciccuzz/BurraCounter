package com.burracounter.service;


import com.burracounter.dto.GameDto;
import com.burracounter.entity.GameEntity;
import com.burracounter.mapper.GameMapper;
import com.burracounter.model.Game;
import com.burracounter.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {


    private final GameMapper gameMapper;
    private final GameRepository gameRepository;

    public Game createGame(Game game) {
        GameEntity gameEntity = gameRepository.save(gameMapper.toEntity(game));
        return gameMapper.toModel(gameEntity);
    }

    public List<Game> getGames() {
        List<GameEntity> gameEntities = gameRepository.findAll();
        return gameMapper.entityToModel_List(gameEntities);
    }

    public Game updateTeamScores(int gameId, Game game) {
        return gameRepository.findById(gameId)
                .map(gameEntity -> gameRepository.save(gameMapper.getEntityWithNewScore(gameEntity, getIncreasedScore(game.score1(), gameEntity), getIncreasedScore(game.score2(), gameEntity))))
                .map(gameMapper::toModel)
                .orElseThrow(() -> new RuntimeException("The game  id is not found"));
    }

    public GameDto editTeamScores(int gameId, int teamId, int editedTotalScore) {
        return null;
    }

    public void deleteGame(int gameId) {
        if (gameRepository.existsById(gameId)) {
            gameRepository.deleteById(gameId);
        } else throw new IllegalArgumentException(String.format("Game with id %s does not exist", gameId));
    }


    private int getIncreasedScore(int score, GameEntity gameEntity) {
        return score + gameEntity.getScore1();
    }
}
