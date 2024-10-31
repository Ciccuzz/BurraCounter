package com.burracounter.controller;


import com.burracounter.dto.TeamDto;
import com.burracounter.mapper.TeamMapper;
import com.burracounter.model.Team;
import com.burracounter.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TeamController {


    private final TeamService teamService;
    private final TeamMapper teamMapper;

    @PostMapping("/teams")
    public ResponseEntity<TeamDto> createTeam(@RequestBody TeamDto teamDto) {
        Team team = teamService.createTeam(teamMapper.toModel(teamDto));
        return ResponseEntity.ok(teamMapper.toDto(team));
    }

    @GetMapping("/teams")
    public ResponseEntity<List<TeamDto>> getTeam() {
        List<Team> teams = teamService.getTeams();
        return ResponseEntity.ok(teamMapper.modelToDto_List(teams));
    }

    @PatchMapping("/teams/{teamId}")
    public ResponseEntity<TeamDto> updateTeam(@PathVariable int teamId, @RequestBody TeamDto teamDto) {
        Team updatedTeam = teamService.updateTeamScores(teamId, teamMapper.toModel(teamDto));
        return ResponseEntity.ok(teamMapper.toDto(updatedTeam));
    }

    @DeleteMapping("/teams/{teamId}")
    public ResponseEntity<String> deleteTeam(@PathVariable int teamId) {
        teamService.deleteTeam(teamId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Team deleted successfully.");
    }
}
