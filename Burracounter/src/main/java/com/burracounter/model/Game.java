package com.burracounter.model;

import java.time.LocalDateTime;
import java.util.List;

public record Game(int id,
                   String gameName,
                   int maxScore,
                   List<Team> teams,
                   int score1,
                   int score2,
                   LocalDateTime gameCreationTime,
                   boolean finished) {
}

