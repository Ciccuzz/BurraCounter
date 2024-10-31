package com.burracounter.mapper;

import com.burracounter.dto.TeamDto;
import com.burracounter.entity.PlayerEntity;
import com.burracounter.entity.TeamEntity;
import com.burracounter.model.Player;
import com.burracounter.model.Team;
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
public class TeamMapperImpl implements TeamMapper {

    @Override
    public TeamDto toDto(Team team) {
        if ( team == null ) {
            return null;
        }

        int id = 0;
        String teamName = null;
        List<Player> players = null;
        int score = 0;

        id = team.id();
        teamName = team.teamName();
        List<Player> list = team.players();
        if ( list != null ) {
            players = new ArrayList<Player>( list );
        }
        score = team.score();

        TeamDto teamDto = new TeamDto( id, teamName, players, score );

        return teamDto;
    }

    @Override
    public TeamDto toDto(TeamEntity teamEntity) {
        if ( teamEntity == null ) {
            return null;
        }

        int id = 0;
        String teamName = null;
        List<Player> players = null;
        int score = 0;

        if ( teamEntity.getId() != null ) {
            id = teamEntity.getId();
        }
        teamName = teamEntity.getTeamName();
        players = playerEntityListToPlayerList( teamEntity.getPlayers() );
        score = teamEntity.getScore();

        TeamDto teamDto = new TeamDto( id, teamName, players, score );

        return teamDto;
    }

    @Override
    public Team toModel(TeamDto teamDto) {
        if ( teamDto == null ) {
            return null;
        }

        int id = 0;
        String teamName = null;
        List<Player> players = null;
        int score = 0;

        id = teamDto.id();
        teamName = teamDto.teamName();
        List<Player> list = teamDto.players();
        if ( list != null ) {
            players = new ArrayList<Player>( list );
        }
        score = teamDto.score();

        Team team = new Team( id, teamName, players, score );

        return team;
    }

    @Override
    public Team toModel(TeamEntity teamEntity) {
        if ( teamEntity == null ) {
            return null;
        }

        int id = 0;
        String teamName = null;
        List<Player> players = null;
        int score = 0;

        if ( teamEntity.getId() != null ) {
            id = teamEntity.getId();
        }
        teamName = teamEntity.getTeamName();
        players = playerEntityListToPlayerList( teamEntity.getPlayers() );
        score = teamEntity.getScore();

        Team team = new Team( id, teamName, players, score );

        return team;
    }

    @Override
    public TeamEntity toEntity(Team team) {
        if ( team == null ) {
            return null;
        }

        TeamEntity teamEntity = new TeamEntity();

        teamEntity.setId( team.id() );
        teamEntity.setTeamName( team.teamName() );
        teamEntity.setPlayers( playerListToPlayerEntityList( team.players() ) );
        teamEntity.setScore( team.score() );

        return teamEntity;
    }

    @Override
    public TeamEntity toEntity(TeamDto teamDto) {
        if ( teamDto == null ) {
            return null;
        }

        TeamEntity teamEntity = new TeamEntity();

        teamEntity.setId( teamDto.id() );
        teamEntity.setTeamName( teamDto.teamName() );
        teamEntity.setPlayers( playerListToPlayerEntityList( teamDto.players() ) );
        teamEntity.setScore( teamDto.score() );

        return teamEntity;
    }

    @Override
    public List<Team> entityToModel_List(List<TeamEntity> teamEntities) {
        if ( teamEntities == null ) {
            return null;
        }

        List<Team> list = new ArrayList<Team>( teamEntities.size() );
        for ( TeamEntity teamEntity : teamEntities ) {
            list.add( toModel( teamEntity ) );
        }

        return list;
    }

    @Override
    public List<TeamDto> modelToDto_List(List<Team> teamEntities) {
        if ( teamEntities == null ) {
            return null;
        }

        List<TeamDto> list = new ArrayList<TeamDto>( teamEntities.size() );
        for ( Team team : teamEntities ) {
            list.add( toDto( team ) );
        }

        return list;
    }

    protected Player playerEntityToPlayer(PlayerEntity playerEntity) {
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

    protected List<Player> playerEntityListToPlayerList(List<PlayerEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Player> list1 = new ArrayList<Player>( list.size() );
        for ( PlayerEntity playerEntity : list ) {
            list1.add( playerEntityToPlayer( playerEntity ) );
        }

        return list1;
    }

    protected PlayerEntity playerToPlayerEntity(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerEntity playerEntity = new PlayerEntity();

        playerEntity.setId( player.id() );
        playerEntity.setPlayerName( player.playerName() );
        playerEntity.setWins( player.wins() );

        return playerEntity;
    }

    protected List<PlayerEntity> playerListToPlayerEntityList(List<Player> list) {
        if ( list == null ) {
            return null;
        }

        List<PlayerEntity> list1 = new ArrayList<PlayerEntity>( list.size() );
        for ( Player player : list ) {
            list1.add( playerToPlayerEntity( player ) );
        }

        return list1;
    }
}
