package com.burracounter.mapper;

import com.burracounter.dto.GameDto;
import com.burracounter.entity.GameEntity;
import com.burracounter.model.Game;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GameMapper {

    GameDto toDto(Game game);

    GameDto toDto(GameEntity gameEntity);

    Game toModel(GameDto gameDto);

    Game toModel(GameEntity gameEntity);

    GameEntity toEntity(Game game);

    GameEntity toEntity(GameDto gameDto);

    List<Game> entityToModel_List(List<GameEntity> gameEntities);

    List<GameDto> modelToDto_List(List<Game> gameEntities);

    @Mapping(target = "score1", source = "increasedScore1")
    @Mapping(target = "score2", source = "increasedScore2")
    GameEntity getEntityWithNewScore(GameEntity gameEntity, int increasedScore1, int increasedScore2);
}
