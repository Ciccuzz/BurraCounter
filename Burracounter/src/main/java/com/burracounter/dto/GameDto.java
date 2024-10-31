package com.burracounter.dto;

import com.burracounter.model.Team;

import java.time.LocalDateTime;
import java.util.List;

public record GameDto(int id,
                   String gameName,
                   int maxScore,
                   List<Team> teams,
                   int score1,
                   int score2,
                   LocalDateTime gameCreationTime,
                   boolean finished) {
}
