package com.burracounter.model;


public record RoundScore(int baseScore,
                         int score) {
    public int getTotal() {
        return baseScore + score;
    }
}
