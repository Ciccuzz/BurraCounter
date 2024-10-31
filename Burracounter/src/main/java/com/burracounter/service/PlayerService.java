package com.burracounter.service;

import com.burracounter.entity.PlayerEntity;
import com.burracounter.mapper.PlayerMapper;
import com.burracounter.model.Player;
import com.burracounter.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerMapper playerMapper;
    private final PlayerRepository playerRepository;


    public Player createPlayer(Player player) {
        PlayerEntity playerEntity = playerRepository.save(playerMapper.toEntity(player));
        return playerMapper.toModel(playerEntity);
    }

    public List<Player> getPlayers() {
        List<PlayerEntity> playerEntities = playerRepository.findAll();
        return playerMapper.entityToModel_List(playerEntities);
    }

    public Player updatePlayerScores(int playerId, Player player) {
        return null;
    }

    public void deletePlayer(int playerId) {
        if (playerRepository.existsById(playerId)) {
            playerRepository.deleteById(playerId);
        } else throw new IllegalArgumentException(String.format("Player with id %s does not exist", playerId));
    }
}
