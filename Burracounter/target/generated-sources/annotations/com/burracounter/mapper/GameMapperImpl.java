package com.burracounter.mapper;

import com.burracounter.dto.GameDto;
import com.burracounter.entity.GameEntity;
import com.burracounter.entity.PlayerEntity;
import com.burracounter.entity.TeamEntity;
import com.burracounter.model.Game;
import com.burracounter.model.Player;
import com.burracounter.model.Team;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-31T01:43:17+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class GameMapperImpl implements GameMapper {

    @Override
    public GameDto toDto(Game game) {
        if ( game == null ) {
            return null;
        }

        int id = 0;
        String gameName = null;
        int maxScore = 0;
        List<Team> teams = null;
        int score1 = 0;
        int score2 = 0;
        LocalDateTime gameCreationTime = null;
        boolean finished = false;

        id = game.id();
        gameName = game.gameName();
        maxScore = game.maxScore();
        List<Team> list = game.teams();
        if ( list != null ) {
            teams = new ArrayList<Team>( list );
        }
        score1 = game.score1();
        score2 = game.score2();
        gameCreationTime = game.gameCreationTime();
        finished = game.finished();

        GameDto gameDto = new GameDto( id, gameName, maxScore, teams, score1, score2, gameCreationTime, finished );

        return gameDto;
    }

    @Override
    public GameDto toDto(GameEntity gameEntity) {
        if ( gameEntity == null ) {
            return null;
        }

        int id = 0;
        String gameName = null;
        int maxScore = 0;
        List<Team> teams = null;
        int score1 = 0;
        int score2 = 0;
        LocalDateTime gameCreationTime = null;
        boolean finished = false;

        if ( gameEntity.getId() != null ) {
            id = gameEntity.getId();
        }
        gameName = gameEntity.getGameName();
        maxScore = gameEntity.getMaxScore();
        teams = teamEntityListToTeamList( gameEntity.getTeams() );
        score1 = gameEntity.getScore1();
        score2 = gameEntity.getScore2();
        gameCreationTime = gameEntity.getGameCreationTime();
        finished = gameEntity.isFinished();

        GameDto gameDto = new GameDto( id, gameName, maxScore, teams, score1, score2, gameCreationTime, finished );

        return gameDto;
    }

    @Override
    public Game toModel(GameDto gameDto) {
        if ( gameDto == null ) {
            return null;
        }

        int id = 0;
        String gameName = null;
        int maxScore = 0;
        List<Team> teams = null;
        int score1 = 0;
        int score2 = 0;
        LocalDateTime gameCreationTime = null;
        boolean finished = false;

        id = gameDto.id();
        gameName = gameDto.gameName();
        maxScore = gameDto.maxScore();
        List<Team> list = gameDto.teams();
        if ( list != null ) {
            teams = new ArrayList<Team>( list );
        }
        score1 = gameDto.score1();
        score2 = gameDto.score2();
        gameCreationTime = gameDto.gameCreationTime();
        finished = gameDto.finished();

        Game game = new Game( id, gameName, maxScore, teams, score1, score2, gameCreationTime, finished );

        return game;
    }

    @Override
    public Game toModel(GameEntity gameEntity) {
        if ( gameEntity == null ) {
            return null;
        }

        int id = 0;
        String gameName = null;
        int maxScore = 0;
        List<Team> teams = null;
        int score1 = 0;
        int score2 = 0;
        LocalDateTime gameCreationTime = null;
        boolean finished = false;

        if ( gameEntity.getId() != null ) {
            id = gameEntity.getId();
        }
        gameName = gameEntity.getGameName();
        maxScore = gameEntity.getMaxScore();
        teams = teamEntityListToTeamList( gameEntity.getTeams() );
        score1 = gameEntity.getScore1();
        score2 = gameEntity.getScore2();
        gameCreationTime = gameEntity.getGameCreationTime();
        finished = gameEntity.isFinished();

        Game game = new Game( id, gameName, maxScore, teams, score1, score2, gameCreationTime, finished );

        return game;
    }

    @Override
    public GameEntity toEntity(Game game) {
        if ( game == null ) {
            return null;
        }

        GameEntity gameEntity = new GameEntity();

        gameEntity.setId( game.id() );
        gameEntity.setGameName( game.gameName() );
        gameEntity.setMaxScore( game.maxScore() );
        gameEntity.setTeams( teamListToTeamEntityList( game.teams() ) );
        gameEntity.setScore1( game.score1() );
        gameEntity.setScore2( game.score2() );
        gameEntity.setGameCreationTime( game.gameCreationTime() );
        gameEntity.setFinished( game.finished() );

        return gameEntity;
    }

    @Override
    public GameEntity toEntity(GameDto gameDto) {
        if ( gameDto == null ) {
            return null;
        }

        GameEntity gameEntity = new GameEntity();

        gameEntity.setId( gameDto.id() );
        gameEntity.setGameName( gameDto.gameName() );
        gameEntity.setMaxScore( gameDto.maxScore() );
        gameEntity.setTeams( teamListToTeamEntityList( gameDto.teams() ) );
        gameEntity.setScore1( gameDto.score1() );
        gameEntity.setScore2( gameDto.score2() );
        gameEntity.setGameCreationTime( gameDto.gameCreationTime() );
        gameEntity.setFinished( gameDto.finished() );

        return gameEntity;
    }

    @Override
    public List<Game> entityToModel_List(List<GameEntity> gameEntities) {
        if ( gameEntities == null ) {
            return null;
        }

        List<Game> list = new ArrayList<Game>( gameEntities.size() );
        for ( GameEntity gameEntity : gameEntities ) {
            list.add( toModel( gameEntity ) );
        }

        return list;
    }

    @Override
    public List<GameDto> modelToDto_List(List<Game> gameEntities) {
        if ( gameEntities == null ) {
            return null;
        }

        List<GameDto> list = new ArrayList<GameDto>( gameEntities.size() );
        for ( Game game : gameEntities ) {
            list.add( toDto( game ) );
        }

        return list;
    }

    @Override
    public GameEntity getEntityWithNewScore(GameEntity gameEntity, int increasedScore1, int increasedScore2) {
        if ( gameEntity == null ) {
            return null;
        }

        GameEntity gameEntity1 = new GameEntity();

        if ( gameEntity != null ) {
            gameEntity1.setId( gameEntity.getId() );
            gameEntity1.setGameName( gameEntity.getGameName() );
            gameEntity1.setMaxScore( gameEntity.getMaxScore() );
            List<TeamEntity> list = gameEntity.getTeams();
            if ( list != null ) {
                gameEntity1.setTeams( new ArrayList<TeamEntity>( list ) );
            }
            gameEntity1.setGameCreationTime( gameEntity.getGameCreationTime() );
            gameEntity1.setFinished( gameEntity.isFinished() );
        }
        gameEntity1.setScore1( increasedScore1 );
        gameEntity1.setScore2( increasedScore2 );

        return gameEntity1;
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

    protected Team teamEntityToTeam(TeamEntity teamEntity) {
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

    protected List<Team> teamEntityListToTeamList(List<TeamEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Team> list1 = new ArrayList<Team>( list.size() );
        for ( TeamEntity teamEntity : list ) {
            list1.add( teamEntityToTeam( teamEntity ) );
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

    protected TeamEntity teamToTeamEntity(Team team) {
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

    protected List<TeamEntity> teamListToTeamEntityList(List<Team> list) {
        if ( list == null ) {
            return null;
        }

        List<TeamEntity> list1 = new ArrayList<TeamEntity>( list.size() );
        for ( Team team : list ) {
            list1.add( teamToTeamEntity( team ) );
        }

        return list1;
    }
}
