package com.burracounter.dto;

public record PlayerDto(int id,
                        String playerName,
                        int wins,
                        int playedGames) {
}
