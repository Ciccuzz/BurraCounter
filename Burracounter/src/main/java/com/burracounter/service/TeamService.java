package com.burracounter.service;

import com.burracounter.entity.TeamEntity;
import com.burracounter.mapper.TeamMapper;
import com.burracounter.model.Team;
import com.burracounter.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamMapper teamMapper;
    private final TeamRepository teamRepository;


    public Team createTeam(Team team) {
        TeamEntity teamEntity = teamRepository.save(teamMapper.toEntity(team));
        return teamMapper.toModel(teamEntity);
    }

    public List<Team> getTeams() {
        List<TeamEntity> teamEntities = teamRepository.findAll();
        return teamMapper.entityToModel_List(teamEntities);
    }

    public Team updateTeamScores(int teamId, Team team) {
        return null;
    }

    public void deleteTeam(int teamId) {
        if (teamRepository.existsById(teamId)) {
            teamRepository.deleteById(teamId);
        } else throw new IllegalArgumentException(String.format("Team with id %s does not exist", teamId));
    }
}
