package com.burracounter.mapper;

import com.burracounter.dto.TeamDto;
import com.burracounter.entity.TeamEntity;
import com.burracounter.model.Team;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamDto toDto(Team team);

    TeamDto toDto(TeamEntity teamEntity);

    Team toModel(TeamDto teamDto);

    Team toModel(TeamEntity teamEntity);

    TeamEntity toEntity(Team team);

    TeamEntity toEntity(TeamDto teamDto);

    List<Team> entityToModel_List(List<TeamEntity> teamEntities);

    List<TeamDto> modelToDto_List(List<Team> teamEntities);

}
