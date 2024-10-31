package com.burracounter.mapper;

import com.burracounter.dto.PlayerDto;
import com.burracounter.entity.PlayerEntity;
import com.burracounter.model.Player;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-31T01:43:18+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class PlayerMapperImpl implements PlayerMapper {

    @Override
    public PlayerDto toDto(Player player) {
        if ( player == null ) {
            return null;
        }

        int id = 0;
        String playerName = null;
        int wins = 0;
        int playedGames = 0;

        id = player.id();
        playerName = player.playerName();
        wins = player.wins();
        playedGames = player.playedGames();

        PlayerDto playerDto = new PlayerDto( id, playerName, wins, playedGames );

        return playerDto;
    }

    @Override
    public PlayerDto toDto(PlayerEntity playerEntity) {
        if ( playerEntity == null ) {
            return null;
        }

        int id = 0;
        String playerName = null;
        int wins = 0;

        if ( playerEntity.getId() != null ) {
            id = playerEntity.getId();
        }
        playerName = playerEntity.getPlayerName();
        wins = playerEntity.getWins();

        int playedGames = 0;

        PlayerDto playerDto = new PlayerDto( id, playerName, wins, playedGames );

        return playerDto;
    }

    @Override
    public Player toModel(PlayerDto playerDto) {
        if ( playerDto == null ) {
            return null;
        }

        int id = 0;
        String playerName = null;
        int wins = 0;
        int playedGames = 0;

        id = playerDto.id();
        playerName = playerDto.playerName();
        wins = playerDto.wins();
        playedGames = playerDto.playedGames();

        Player player = new Player( id, playerName, wins, playedGames );

        return player;
    }

    @Override
    public Player toModel(PlayerEntity playerEntity) {
        if ( playerEntity == null ) {
            return null;
        }

        int id = 0;
        String playerName = null;
        int wins = 0;

        if ( playerEntity.getId() != null ) {
            id = playerEntity.getId();
        }
        playerName = playerEntity.getPlayerName();
        wins = playerEntity.getWins();

        int playedGames = 0;

        Player player = new Player( id, playerName, wins, playedGames );

        return player;
    }

    @Override
    public PlayerEntity toEntity(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerEntity playerEntity = new PlayerEntity();

        playerEntity.setId( player.id() );
        playerEntity.setPlayerName( player.playerName() );
        playerEntity.setWins( player.wins() );

        return playerEntity;
    }

    @Override
    public PlayerEntity toEntity(PlayerDto playerDto) {
        if ( playerDto == null ) {
            return null;
        }

        PlayerEntity playerEntity = new PlayerEntity();

        playerEntity.setId( playerDto.id() );
        playerEntity.setPlayerName( playerDto.playerName() );
        playerEntity.setWins( playerDto.wins() );

        return playerEntity;
    }

    @Override
    public List<Player> entityToModel_List(List<PlayerEntity> playerEntities) {
        if ( playerEntities == null ) {
            return null;
        }

        List<Player> list = new ArrayList<Player>( playerEntities.size() );
        for ( PlayerEntity playerEntity : playerEntities ) {
            list.add( toModel( playerEntity ) );
        }

        return list;
    }

    @Override
    public List<PlayerDto> modelToDto_List(List<Player> playerEntities) {
        if ( playerEntities == null ) {
            return null;
        }

        List<PlayerDto> list = new ArrayList<PlayerDto>( playerEntities.size() );
        for ( Player player : playerEntities ) {
            list.add( toDto( player ) );
        }

        return list;
    }
}
