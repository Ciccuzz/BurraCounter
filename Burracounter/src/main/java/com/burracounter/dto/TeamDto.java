package com.burracounter.dto;

import com.burracounter.model.Player;

import java.util.List;

public record TeamDto(int id,
                      String teamName,
                      List<Player> players,
                      int score) {
}
