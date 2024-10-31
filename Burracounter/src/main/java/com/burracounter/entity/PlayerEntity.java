package com.burracounter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "player")

public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "playerName", nullable = false, length = Integer.MAX_VALUE)
    private String playerName;

    @Column(name = "wins", nullable = false, length = Integer.MAX_VALUE)
    private int wins;

    @Column(name = "playedGame", nullable = false, length = Integer.MAX_VALUE)
    private int playedGame;
}
