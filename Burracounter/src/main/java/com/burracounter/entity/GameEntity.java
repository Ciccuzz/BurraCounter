package com.burracounter.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "game")
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "gameName", nullable = false, length = Integer.MAX_VALUE)
    private String gameName;

    @Column(name = "maxScore", nullable = false, length = Integer.MAX_VALUE)
    private int maxScore;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private List<TeamEntity> teams;

    @Column(name = "score1", nullable = false, length = Integer.MAX_VALUE)
    private int score1;

    @Column(name = "score2", nullable = false, length = Integer.MAX_VALUE)
    private int score2;

    @Column(name = "gameCreationTime")
    private LocalDateTime gameCreationTime;

    @Column(name = "finished", nullable = false, length = Integer.MAX_VALUE)
    private boolean finished;

}
