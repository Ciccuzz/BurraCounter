package com.burracounter.mapper;

import com.burracounter.dto.PlayerDto;
import com.burracounter.entity.PlayerEntity;
import com.burracounter.model.Player;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerDto toDto(Player player);

    PlayerDto toDto(PlayerEntity playerEntity);

    Player toModel(PlayerDto playerDto);

    Player toModel(PlayerEntity playerEntity);

    PlayerEntity toEntity(Player player);

    PlayerEntity toEntity(PlayerDto playerDto);

    List<Player> entityToModel_List(List<PlayerEntity> playerEntities);

    List<PlayerDto> modelToDto_List(List<Player> playerEntities);

}
