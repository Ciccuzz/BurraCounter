package com.burracounter.model;

import java.util.List;

public record Team(int id,
                   String teamName,
                   List<Player> players,
                   int score) {
}
